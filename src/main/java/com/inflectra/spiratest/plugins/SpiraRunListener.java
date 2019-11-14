package com.inflectra.spiratest.plugins;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Arrays;

import hudson.Extension;
import hudson.MarkupText;
import hudson.MarkupText.SubText;
import hudson.model.AbstractBuild;
import hudson.model.Descriptor;
import hudson.model.Project;
import hudson.model.Result;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.model.listeners.RunListener;
import hudson.scm.ChangeLogSet;
import hudson.util.Secret;

/**
 * Implements RunListener to capture build events and send to Spira
 * @author Inflectra Corporation
 *
 */
@Extension
public class SpiraRunListener extends RunListener<Run>
{
	/**
	 * Called when a build is completed
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void onCompleted(Run r, TaskListener listener)
	{
		super.onCompleted(r, listener);
		
		//Get the configuration values
		Project project = (Project)r.getParent();
		SpiraBuilder spiraBuilder = (SpiraBuilder)project.getBuildWrappers().get(Descriptor.find(SpiraBuilder.DescriptorImpl.class.getName()));
		if (spiraBuilder == null)
		{
			return;
		}
		if (spiraBuilder.getDescriptor() == null)
		{
			return;
		}
		String url = spiraBuilder.getDescriptor().getUrl();
		String username = spiraBuilder.getDescriptor().getUsername();
		//SWB Added .getPlainText() to decrypt
		String password = spiraBuilder.getDescriptor().getPassword().getPlainText();
		String projectIdString = spiraBuilder.getProject();
		int projectId = Integer.parseInt(projectIdString);
		String releaseVersionNumber = spiraBuilder.getRelease();
				
		//Record the build status
		try
		{
			String buildName = r.getFullDisplayName();
			String buildDescription = "";
			if (r.getDescription() != null)
			{
				buildDescription += r.getDescription() + "\n";
			}
			List<String> logLines = r.getLog(Integer.MAX_VALUE);
			if (logLines != null && !logLines.isEmpty())
			{
				//use StringBuffer for better performance
                StringBuffer buffer = new StringBuffer();
				for (String logLine : logLines)
				{
					buffer.append(logLine + "\n");
				}
				buildDescription += buffer.toString();
			}
			int buildStatusId = convertStatus(r.getResult());
			
			//See if we have any revisions or incidents
			List<String> revisionKeys = new ArrayList<String>();
			List<Integer> incidents = new ArrayList<Integer>();
			if (r instanceof AbstractBuild) 
			{
				AbstractBuild build = (AbstractBuild)r;
				ChangeLogSet set = build.getChangeSet();
				if (set != null)
				{
					for(Iterator<ChangeLogSet.Entry> iter = set.iterator(); iter.hasNext();)
					{
						ChangeLogSet.Entry entry = iter.next();
						String revisionKey = entry.getCommitId();
						MarkupText unannotatedMessage = new MarkupText(entry.getMsg());
						if (revisionKey != null && !revisionKey.isEmpty())
						{
							revisionKeys.add(revisionKey);
						}
						
						//See if we have any Spira incident IN tokens
						Pattern regex = Pattern.compile("\\[IN:([0-9]+)\\]");
						List<SubText> tokens = unannotatedMessage.findTokens(regex);
						for (SubText token : tokens)
						{
							if (token.groupCount() > 0)
							{
								//Get the incident id
								try
								{
									int incidentId = Integer.parseInt(token.group(1));
									incidents.add(incidentId);
								}
								catch (NumberFormatException ex)
								{
									//Do Nothing since token invalid
								}
							}
						}
					}
				}
			}
			
			//Actually record the build
			SpiraImportExport spiraClient = new SpiraImportExport();
			spiraClient.setUrl(url);
			spiraClient.setUserName(username);
			spiraClient.setPassword(Secret.fromString(password));
			spiraClient.setProjectId(projectId);
			Date buildDate = r.getTime();
			spiraClient.recordBuild(releaseVersionNumber, buildDate, buildStatusId, buildName, buildDescription, revisionKeys, incidents);
		}
		catch (Exception ex)
		{
			//Log the exception
			listener.getLogger().print(ex.getMessage() + ": " + Arrays.toString(ex.getStackTrace()));
		}
	}
	
	/**
	 * Converts a Jenkins status to a Spira one
	 * @param result
	 * @return
	 */
	protected int convertStatus(Result result)
	{
		int buildStatusId = 1;	//Failed
		if (result == Result.SUCCESS)
		{
			buildStatusId = 2;	//Passed
		}
		return buildStatusId;
	}
}
