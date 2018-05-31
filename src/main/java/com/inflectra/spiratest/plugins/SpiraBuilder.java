package com.inflectra.spiratest.plugins;

import java.io.IOException;

import javax.servlet.ServletException;

import net.sf.json.JSONObject;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.Build;
import hudson.model.BuildListener;
import hudson.model.Descriptor;
import hudson.tasks.BuildWrapper;
import hudson.util.FormValidation;

/**
 * Just used to expose the Spira global and build-specific configuration
 * @author Inflectra Corporation
 *
 */
public class SpiraBuilder extends BuildWrapper
{
    private final String project;
    private final String release;

    // Fields in config.jelly must match the parameter names in the "DataBoundConstructor"
    @DataBoundConstructor
    public SpiraBuilder(String project, String release)
    {
        this.project = project;
        this.release = release;
    }

    /**
     * We'll use this from the <tt>config.jelly</tt>.
     */
    public String getProject()
    {
        return project;
    }

    /**
     * We'll use this from the <tt>config.jelly</tt>.
     */
    public String getRelease()
    {
        return release;
    }
    
    // Overridden for better type safety.
    // If your plugin doesn't really define any property on Descriptor,
    // you don't have to do this.
    @Override
    public DescriptorImpl getDescriptor()
    {
        return (DescriptorImpl)super.getDescriptor();
    }

    /**
     * Descriptor for {@link SpiraBuilder}. Used as a singleton.
     * The class is marked as public so that it can be accessed from views.
     *
     * <p>
     * See <tt>src/main/resources/hudson/plugins/hello_world/SpiraBuilder/*.jelly</tt>
     * for the actual HTML fragment for the configuration screen.
     */
    @Extension // This indicates to Jenkins that this is an implementation of an extension point.
    public static final class DescriptorImpl extends Descriptor<BuildWrapper>
    {
    	public DescriptorImpl()
    	{
    		//Load the initial values in
    		load();
    	}
    	
        /**
         * To persist global configuration information,
         * simply store it in a field and call save().
         *
         * <p>
         * If you don't want fields to be persisted, use <tt>transient</tt>.
         */
        private String url;
        private String username;
        private String password;

        public boolean isApplicable(Class<? extends AbstractProject> aClass)
        {
            // Indicates that this build wrapper can be used with all kinds of project types 
            return true;
        }

        /**
         * This human readable name for the build wrapper is used in the configuration screen.
         */
        public String getDisplayName()
        {
            return "Enable Spira Integration";
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException
        {
            // To persist global configuration information,
            // set that to properties and call save().
            url = formData.getString("url");
            username = formData.getString("username");
            password = formData.getString("password");
            // ^Can also use req.bindJSON(this, formData);
            //  (easier when there are many fields; need set* methods for this, like setUseFrench)
            save();
            return super.configure(req,formData);
        }

        /**
         * Returns the Spira URL
         */
        public String getUrl()
        {
            return url;
        }

        /**
         * Returns the Spira Username
         */
        public String getUsername()
        {
            return username;
        }

        /**
         * Returns the Spira Password
         */
        public String getPassword()
        {
            return password;
        }

        /**
         * Tests the connection to the SpiraTeam server
         * @param url
         * @param username
         * @param password
         * @return
         */        
        public FormValidation doTestConnection(
        	    @QueryParameter("url") final String url,
        	    @QueryParameter("username") final String username,
        	    @QueryParameter("password") final String password)
        		throws IOException, ServletException
        {
	            try
	            {
	            	SpiraImportExport spiraClient = new SpiraImportExport();
	            	spiraClient.setUrl(url);
	            	spiraClient.setUserName(username);
	            	spiraClient.setPassword(password);
	            	boolean success = spiraClient.testConnection();
	            	if (success)
	            	{
	            		return FormValidation.ok("Successfully Connected");
	            	}
	            	else
	            	{
	            		return FormValidation.error("Unable to authenticate with SpiraTeam, please check the username and password, then try again.");
	            	}
	            }
	            catch (Exception e)
	            {
	            	return FormValidation.error("Error connecting to SpiraTeam: "+e.getMessage());
	            }
        }
        
        /**
         * Verifies that the project and release exist
         * @param project
         * @param release
         * @return
         * @throws IOException
         * @throws ServletException
         */        
        public FormValidation doVerifyRelease(
        	    @QueryParameter("project") final String project,
        	    @QueryParameter("release") final String release)
        		throws IOException, ServletException
        {
                try
                {
                	SpiraImportExport spiraClient = new SpiraImportExport();
                	spiraClient.setUrl(this.getUrl());
                	spiraClient.setUserName(this.getUsername());
                	spiraClient.setPassword(this.getPassword());
                	
                	//Make sure we have a release specified
                	if (release == null || release.isEmpty())
                	{
                    	return FormValidation.error("You need to enter a release version number");            	                		
                	}
                	
                	//Get the project id
                	int projectId = Integer.parseInt(project);
                	spiraClient.setProjectId(projectId);
                	Integer releaseId = spiraClient.verifyRelease(release);
                	if (releaseId == null)
                	{
                		return FormValidation.error("A release with the version number '" + release + "' does not exist in the Spira project PR" + projectId);
                	}
                	else
                	{
                		return FormValidation.ok("Successfully Verified Project and Release");
                	}
                }
                catch (NumberFormatException e)
                {
                	return FormValidation.error("You need to enter a numeric project ID");            	
                }
                catch (Exception e)
                {
                	return FormValidation.error("Error connecting to SpiraTeam: "+e.getMessage());
                }
        }
    }

	@Override
	public Environment setUp(Build build, Launcher launcher,
			BuildListener listener) throws IOException, InterruptedException
	{
		return new SpiraEnvironment();
	}

	@Override
	public Environment setUp(AbstractBuild build, Launcher launcher,
			BuildListener listener) throws IOException, InterruptedException
	{
		return new SpiraEnvironment();
	}
	
	public class SpiraEnvironment extends hudson.tasks.BuildWrapper.Environment
	{

		@Override
		public boolean tearDown(AbstractBuild build, BuildListener listener)
				throws IOException, InterruptedException
		{
			return true;
		}

		@Override
		public boolean tearDown(Build build, BuildListener listener)
				throws IOException, InterruptedException
		{
			return true;
		}

	}
}

