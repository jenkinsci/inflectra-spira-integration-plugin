package com.inflectra.spiratest.plugins;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.*;
import hudson.tasks.BuildWrapper;
import hudson.util.FormValidation;
import hudson.util.Secret;
import jenkins.model.Jenkins;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.verb.POST;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Exposes the Spira global and build-specific configuration.
 *
 * @author Inflectra Corporation
 */
public class SpiraBuilder extends BuildWrapper {
    private final String project;
    private final String release;

    @DataBoundConstructor
    public SpiraBuilder(String project, String release) {
        this.project = project;
        this.release = release;
    }

    public String getProject() {
        return project;
    }

    public String getRelease() {
        return release;
    }

    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl) super.getDescriptor();
    }

    @Extension
    public static final class DescriptorImpl extends Descriptor<BuildWrapper> {
        public DescriptorImpl() {
            load();
        }

        private String url;
        private String username;
        private Secret password;

        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }

        public String getDisplayName() {
            return "Enable Spira Integration";
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            url = formData.getString("url");
            username = formData.getString("username");
            password = Secret.fromString(formData.getString("password"));
            save();
            return super.configure(req, formData);
        }

        public String getUrl() {
            return url;
        }

        public String getUsername() {
            return username;
        }

        public Secret getPassword() {
            return password;
        }

        public void setPassword(Secret password) {
            this.password = password;
        }

        /**
         * Tests the connection to the SpiraTeam server.
         * Requires Administrator permission and must be invoked via POST.
         */
        @POST
        public FormValidation doTestConnection(
                @QueryParameter("url") final String url,
                @QueryParameter("username") final String username,
                @QueryParameter("password") final String password)
                throws IOException, ServletException {
            Jenkins.get().checkPermission(Jenkins.ADMINISTER);
            try {
                SpiraImportExport spiraClient = new SpiraImportExport();
                spiraClient.setUrl(url);
                spiraClient.setUserName(username);
                spiraClient.setPassword(Secret.fromString(password));

                boolean success = spiraClient.testConnection();
                if (success) {
                    return FormValidation.ok("Successfully Connected");
                } else {
                    return FormValidation.error("Unable to authenticate with SpiraTeam. Please check the username and API key, then try again.");
                }
            } catch (Exception e) {
                return FormValidation.error("Error connecting to SpiraTeam: " + e.getMessage());
            }
        }

        /**
         * Verifies that the project and release exist.
         * Requires Administrator permission and must be invoked via POST.
         */
        @POST
        public FormValidation doVerifyRelease(
                @QueryParameter("project") final String project,
                @QueryParameter("release") final String release)
                throws IOException, ServletException {
            Jenkins.get().checkPermission(Jenkins.ADMINISTER);
            try {
                SpiraImportExport spiraClient = new SpiraImportExport();
                spiraClient.setUrl(this.getUrl());
                spiraClient.setUserName(this.getUsername());
                spiraClient.setPassword(this.getPassword());

                if (release == null || release.isEmpty()) {
                    return FormValidation.error("You need to enter a release version number");
                }

                int projectId = Integer.parseInt(project);
                spiraClient.setProjectId(projectId);
                Integer releaseId = spiraClient.verifyRelease(release);
                if (releaseId == null) {
                    return FormValidation.error("A release with the version number '" + release + "' does not exist in the Spira product PR" + projectId);
                } else {
                    return FormValidation.ok("Successfully Verified Product and Release");
                }
            } catch (NumberFormatException e) {
                return FormValidation.error("You need to enter a numeric product ID");
            } catch (Exception e) {
                return FormValidation.error("Error connecting to SpiraTeam: " + e.getMessage());
            }
        }
    }

    @Override
    public Environment setUp(Build build, Launcher launcher,
                             BuildListener listener) throws IOException, InterruptedException {
        return new SpiraEnvironment();
    }

    @Override
    public Environment setUp(AbstractBuild build, Launcher launcher,
                             BuildListener listener) throws IOException, InterruptedException {
        return new SpiraEnvironment();
    }

    public class SpiraEnvironment extends hudson.tasks.BuildWrapper.Environment {

        @Override
        public boolean tearDown(AbstractBuild build, BuildListener listener)
                throws IOException, InterruptedException {
            return true;
        }

        @Override
        public boolean tearDown(Build build, BuildListener listener)
                throws IOException, InterruptedException {
            return true;
        }
    }
}
