package com.inflectra.spiratest.plugins;

import hudson.Extension;
import hudson.MarkupText;
import hudson.MarkupText.SubText;
import hudson.Util;
import hudson.model.AbstractBuild;
import hudson.model.Descriptor;
import hudson.model.Project;
import hudson.scm.ChangeLogAnnotator;
import hudson.scm.ChangeLogSet.Entry;
import hudson.util.Secret;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Extends the changelog annotator to make the changelog include links to Spira
 * artifacts.
 *
 * @author Inflectra Corporation
 */
@Extension
public class SpiraChangeLogAnnotator extends ChangeLogAnnotator {
    @Override
    public void annotate(AbstractBuild<?, ?> build, Entry change, MarkupText text) {
        int projectId = 0;

        Project project = (Project) build.getProject();
        SpiraBuilder spiraBuilder = (SpiraBuilder) project.getBuildWrappers().get(Descriptor.find(SpiraBuilder.class.getName()));
        if (spiraBuilder == null || spiraBuilder.getDescriptor() == null) {
            return;
        }

        String url = spiraBuilder.getDescriptor().getUrl();
        String username = spiraBuilder.getDescriptor().getUsername();
        Secret password = spiraBuilder.getDescriptor().getPassword();
        if (password == null) {
            return;
        }

        String projectIdString = spiraBuilder.getProject();
        try {
            projectId = Integer.parseInt(projectIdString);
        } catch (NumberFormatException ex) {
            return;
        }

        SpiraImportExport spiraClient = new SpiraImportExport();
        spiraClient.setUrl(url);
        spiraClient.setUserName(username);
        spiraClient.setPassword(password);
        spiraClient.setProjectId(projectId);

        // Match Spira artifact tokens like [IN:123], [RQ:456]
        Pattern regex = Pattern.compile("\\[([A-Z]{2,}):([0-9]+)\\]");
        List<SubText> tokens = text.findTokens(regex);
        for (SubText token : tokens) {
            if (token.groupCount() > 1) {
                String prefix = token.group(1);
                try {
                    int artifactId = Integer.parseInt(token.group(2));
                    String artifactUrl = spiraClient.createArtifactUrl(prefix, artifactId);
                    // Escape the URL to prevent XSS via server-supplied values
                    String safeUrl = Util.xmlEscape(artifactUrl);
                    String startTag = "<a href=\"" + safeUrl + "\">";
                    String endTag = "</a>";
                    token.surroundWith(startTag, endTag);
                } catch (NumberFormatException ex) {
                    // Token had non-numeric ID, skip
                } catch (Exception ex) {
                    // Unable to create artifact URL, skip
                }
            }
        }
    }
}
