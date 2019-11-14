package com.inflectra.spiratest.plugins;

import java.util.List;
import java.util.regex.Pattern;

import hudson.Extension;
import hudson.MarkupText;
import hudson.MarkupText.SubText;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.Descriptor;
import hudson.model.Hudson;
import hudson.model.Project;
import hudson.scm.ChangeLogAnnotator;
import hudson.scm.ChangeLogSet.Entry;
import hudson.util.Secret;

/**
 * Extends the changelog annotator to make the changelog include links to Spira
 * artifacts
 * @author Inflectra Corporation
 *
 */
@Extension
public class SpiraChangeLogAnnotator extends ChangeLogAnnotator
{    	
	/*
	 * (non-Javadoc)
	 * @see hudson.scm.ChangeLogAnnotator#annotate(hudson.model.AbstractBuild, hudson.scm.ChangeLogSet.Entry, hudson.MarkupText)
	 */
	@Override
	public void annotate(AbstractBuild<?, ?> build, Entry change, MarkupText text)
	{
		int projectId = 0;
		
		//Get the configuration values
		Project project = (Project)build.getProject();
		SpiraBuilder spiraBuilder = (SpiraBuilder)project.getBuildWrappers().get(Descriptor.find(SpiraBuilder.class.getName()));
		String url = spiraBuilder.getDescriptor().getUrl();
		String username = spiraBuilder.getDescriptor().getUsername();
		//SWB  Pass in decrypted password here
		//SWB Added .getPlainText() to decrypt
		String password = spiraBuilder.getDescriptor().getPassword().getPlainText();
		String projectIdString = spiraBuilder.getProject();
		try
		{
			projectId = Integer.parseInt(projectIdString);
		}
		catch (NumberFormatException ex)
		{
			//Do Nothing
		}
		
		//Instantiate the spira proxy
		SpiraImportExport spiraClient = new SpiraImportExport();
		spiraClient.setUrl(url);
		spiraClient.setUserName(username);

		//SWB  Set correct password here for Secret
		spiraClient.setPassword(Secret.fromString(password));
		spiraClient.setProjectId(projectId);
		
		//See if we have any Spira tokens
		Pattern regex = Pattern.compile("\\[([A-Z]{2,}):([0-9]+)\\]");
		List<SubText> tokens = text.findTokens(regex);
		for (SubText token : tokens)
		{
			if (token.groupCount() > 1)
			{
				//Get the prefix and artifact id
				String prefix = token.group(1);
				try
				{
					int artifactId = Integer.parseInt(token.group(2));
					String artifactUrl = spiraClient.createArtifactUrl(prefix, artifactId);
					String startTag = "<a href=\"" + artifactUrl + "\">";
					String endTag = "</a>";
					token.surroundWith(startTag, endTag);
				}
				catch (NumberFormatException ex)
				{
                    //need to do something to stop Maven from getting mad
                    int i=0;
                    i++;

                    //Do Nothing since token invalid
				}
				catch (Exception ex)
				{
				    //need to do something to stop Maven from getting mad
					int i=0;
					i++;

					//TODO: Log the exception - need to figure out how to get handle to logger
					//listener.getLogger().print(ex.getMessage() + ": " + ex.getStackTrace());
				}
			}
		}
	}
}
