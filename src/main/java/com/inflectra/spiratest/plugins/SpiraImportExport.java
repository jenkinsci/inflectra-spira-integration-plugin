package com.inflectra.spiratest.plugins;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.*;

import com.inflectra.spiratest.plugins.soap.ArrayOfRemoteBuildSourceCode;
import com.inflectra.spiratest.plugins.soap.ArrayOfRemoteFilter;
import com.inflectra.spiratest.plugins.soap.ArrayOfRemoteRelease;
import com.inflectra.spiratest.plugins.soap.IImportExport;
import com.inflectra.spiratest.plugins.soap.IImportExportBuildCreateServiceFaultMessageFaultFaultMessage;
import com.inflectra.spiratest.plugins.soap.IImportExportConnectionAuthenticate2ServiceFaultMessageFaultFaultMessage;
import com.inflectra.spiratest.plugins.soap.IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage;
import com.inflectra.spiratest.plugins.soap.IImportExportSystemGetArtifactUrlServiceFaultMessageFaultFaultMessage;
import com.inflectra.spiratest.plugins.soap.IImportExportTestRunRecordAutomated1ServiceFaultMessageFaultFaultMessage;
import com.inflectra.spiratest.plugins.soap.ImportExport;
import com.inflectra.spiratest.plugins.soap.RemoteAutomatedTestRun;
import com.inflectra.spiratest.plugins.soap.RemoteBuild;
import com.inflectra.spiratest.plugins.soap.RemoteBuildSourceCode;
import com.inflectra.spiratest.plugins.soap.RemoteFilter;
import com.inflectra.spiratest.plugins.soap.RemoteIncident;
import com.inflectra.spiratest.plugins.soap.RemoteRelease;
import hudson.util.Secret;

/**
 * This defines the 'SpiraImportExport' class that provides the Java facade
 * for calling the SOAP web service exposed by SpiraTest
 * 
 * @author		Inflectra Corporation
 * @version		3.2.0
 *
 */
public class SpiraImportExport
{
	private static final String WEB_SERVICE_SUFFIX = "/Services/v3_0/ImportExport.svc?WSDL";
	private static final String WEB_SERVICE_NAMESPACE = "{http://www.inflectra.com/SpiraTest/Services/v3.0/}ImportExport";
	private static final String WEB_SERVICE_NAMESPACE_DATA_OBJECTS = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects";

	private static final String SPIRA_PLUG_IN_NAME = "Jenkins Plugin";
	
	private String url;
	private String userName;
	private Secret password;
	private int projectId;

	//Artifact type enums
	public enum ArtifactType
	{
		REQUIREMENT ("RQ", 1),
		TESTCASE ("TC", 2),
		INCIDENT ("IN", 3),
		RELEASE ("RL", 4),
		TESTRUN ("TR", 5),
		TASK ("TK", 6),
		TESTSTEP ("TS", 7),
		TESTSET ("TX", 8),
		HOST ("AH", 9);
		
	    private final String prefix;
	    private final int artifactId;
	    private static Map<String, ArtifactType> map = new HashMap<String, ArtifactType>();

	    private ArtifactType(String prefix, int artifactId)
	    {
	        this.prefix = prefix;
	        this.artifactId = artifactId;
	    }
	    
	    public String getPrefix()
	    {
	    	return this.prefix;
	    }
	    
	    public int getArtifactId()
	    {
	    	return this.artifactId;
	    }
	    
        static
        { 
            for (ArtifactType a : ArtifactType.values()) 
                map.put(a.getPrefix(), a); 
        } 

        public static ArtifactType getByPrefix(String prefix)
        { 
            return map.get(prefix); 
        } 

	}
	
	public SpiraImportExport()
	{
	}

	public SpiraImportExport(String url, String userName, Secret password, int projectId)
	{
		this.url = url;
		this.userName = userName;
		this.password = password;
		this.projectId = projectId;
	}
	

	/**
	 * Records a test run
	 * 
		@param testerUserId			The user id of the person who's running the test (null for logged in user)
		@param testCaseId			The test case being executed
		@param releaseId			The release being executed against (optional)
		@param testSetId			The test set being executed against (optional)
		@param executionStatusId	The status of the test run (pass/fail/not run)
		@param runnerName			The name of the automated testing tool
		@param runnerTestName		The name of the test as stored in JUnit
		@param runnerAssertCount	The number of assertions
		@param runnerMessage		The failure message (if appropriate)
		@param runnerStackTrace		The error stack trace (if any)
		@param endDate				When the test run ended
		@param startDate			When the test run started
	 */
	public int recordTestRun(Integer testerUserId, int testCaseId, Integer releaseId, Integer testSetId, Date startDate, Date endDate, int executionStatusId, String runnerName, String runnerTestName, int runnerAssertCount, String runnerMessage, String runnerStackTrace) throws Exception 
	{
		//Instantiate the soap proxy
		try
		{

			//Break up the URL into server name and the service path
			URL serviceUrl = new URL(this.url + WEB_SERVICE_SUFFIX);

			ImportExport service = new ImportExport(serviceUrl, QName.valueOf(WEB_SERVICE_NAMESPACE));
			//Try both the HTTP and HTTPS ports
			IImportExport soap = null;
			IImportExport soap1 = null;
			String soapMessage = "";
			try
			{
				soap = service.getBasicHttpBindingIImportExport();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			try
			{
				soap1 = service.getBasicHttpBindingIImportExport1();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			
			//If both are NULL, throw exception
			if (soap == null && soap1 == null)
			{
				//Display the error
				throw new Exception ("Unable to connect with either the SpiraTest HTTP or HTTPS APIs. Please check the URL and try again: " + soapMessage + "\n");
			}
			
			//If one is NULL, simply set to the same as the other to avoid having to add NULL checks in the subsequent code
			if (soap == null)
			{
				soap = soap1;
			}
			else
			{
				soap1 = soap;
			}
			
			//Make sure that session is maintained
			Map<String, Object> requestContext = ((BindingProvider)soap).getRequestContext();
			requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
			Map<String, Object> requestContext1 = ((BindingProvider)soap1).getRequestContext();
			requestContext1.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
						
			//Authenticate
			boolean success = false;
			try
			{
				//SWB Changed password to type secret, but need to decrypt using .getPlainText()
				//success = soap.connectionAuthenticate2(this.userName, this.password, SPIRA_PLUG_IN_NAME);
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);
			}
			catch (Exception ex)
			{
				//Try using the second binding
				soap = soap1;
				//SWB Changed password to type secret, but need to decrypt using .getPlainText()
				//success = soap.connectionAuthenticate2(this.userName, this.password, SPIRA_PLUG_IN_NAME);
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);
			}
			if (!success)
			{
				//Display the error
				throw new Exception ("Unable to authenticate with SpiraTest server. Please check the username/password and try again\n\n");
			}
	        
	        //Connect to the project
			success = soap.connectionConnectToProject(projectId);
			if (!success)
			{
				throw new Exception ("Unable to connect to SpiraTest project " + projectId + ", please check that the user is a member of this project\n\n");
			}
			
			//Now record the test result
			RemoteAutomatedTestRun remoteTestRun = new RemoteAutomatedTestRun();
			remoteTestRun.setTestCaseId(testCaseId);
			if (releaseId != null)
			{
				remoteTestRun.setReleaseId(createJAXBInteger("ReleaseId", releaseId));
			}
			if (testSetId != null)
			{
				remoteTestRun.setTestSetId(createJAXBInteger("TestSetId", testSetId));
			}
			remoteTestRun.setStartDate(convertDatesJava2Xml(startDate));
			remoteTestRun.setEndDate(createJAXBXMLGregorianCalendar("EndDate", convertDatesJava2Xml(endDate)));
			remoteTestRun.setExecutionStatusId(executionStatusId);
			remoteTestRun.setRunnerName(createJAXBString("RunnerName", runnerName));
			remoteTestRun.setRunnerTestName(createJAXBString("RunnerTestName", runnerTestName));
			remoteTestRun.setRunnerAssertCount(createJAXBInteger("RunnerAssertCount", runnerAssertCount));
			remoteTestRun.setRunnerMessage(createJAXBString("RunnerMessage", runnerMessage));
			remoteTestRun.setRunnerStackTrace(createJAXBString("RunnerStackTrace", runnerStackTrace));
			
			remoteTestRun = soap.testRunRecordAutomated1(remoteTestRun);
			int testRunId = remoteTestRun.getTestRunId().getValue();
			return testRunId;
		}
		catch (IImportExportTestRunRecordAutomated1ServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error sending results to SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
		catch (IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error connecting to SpiraTest project (" + exception.getMessage() + ")\n\n");
		}
		catch (IImportExportConnectionAuthenticate2ServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error authenticating with SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
		catch (MalformedURLException exception)
		{
			throw new Exception ("Error creating URL for connecting to SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
		catch (Exception exception)
		{
			//Display the error
			throw new Exception ("Error sending results to SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
	}
	
	/**
	 * Tests the SpiraTeam connection
	 * @return
	 */
	public boolean testConnection() throws Exception
	{
		//Instantiate the soap proxy
		try
		{

			//Break up the URL into server name and the service path
			URL serviceUrl = new URL(this.url + WEB_SERVICE_SUFFIX);

			ImportExport service = new ImportExport(serviceUrl, QName.valueOf(WEB_SERVICE_NAMESPACE));
			//Try both the HTTP and HTTPS ports
			IImportExport soap = null;
			IImportExport soap1 = null;
			String soapMessage = "";
			try
			{
				soap = service.getBasicHttpBindingIImportExport();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			try
			{
				soap1 = service.getBasicHttpBindingIImportExport1();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			
			//If both are NULL, throw exception
			if (soap == null && soap1 == null)
			{
				//Display the error
				throw new Exception ("Unable to connect with either the SpiraTest HTTP or HTTPS APIs. Please check the URL and try again: " + soapMessage + "\n");
			}
			
			//If one is NULL, simply set to the same as the other to avoid having to add NULL checks in the subsequent code
			if (soap == null)
			{
				soap = soap1;
			}
			else
			{
				soap1 = soap;
			}
			
			//Make sure that session is maintained
			Map<String, Object> requestContext = ((BindingProvider)soap).getRequestContext();
			requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
			Map<String, Object> requestContext1 = ((BindingProvider)soap1).getRequestContext();
			requestContext1.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
						
			//Authenticate
			boolean success = false;
			try
			{
				//SWB Changed password to type secret, but need to use toString because password could be
				// either in plain text or encrypted, and toString handles both situations
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);

			}
			catch (Exception ex)
			{
				//Try using the second binding
				soap = soap1;
				//SWB Changed password to type secret, but need to use toString because password could be
				// either in plain text or encrypted, and toString handles both situations
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);
			}
			return success;
		}
		catch (IImportExportConnectionAuthenticate2ServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error authenticating with SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
		catch (MalformedURLException exception)
		{
			throw new Exception ("Error creating URL for connecting to SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
		catch (Exception exception)
		{
			//Display the error
			throw new Exception ("Error sending results to SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
	}
	
	/**
	 * Verifies that the release exists in the project
	 * @param releaseVersionNumber
	 * @return The id of the release or null
	 */
	public Integer verifyRelease (String releaseVersionNumber) throws Exception
	{
		//Instantiate the soap proxy
		try
		{

			//Break up the URL into server name and the service path
			URL serviceUrl = new URL(this.url + WEB_SERVICE_SUFFIX);

			ImportExport service = new ImportExport(serviceUrl, QName.valueOf(WEB_SERVICE_NAMESPACE));
			//Try both the HTTP and HTTPS ports
			IImportExport soap = null;
			IImportExport soap1 = null;
			String soapMessage = "";
			try
			{
				soap = service.getBasicHttpBindingIImportExport();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			try
			{
				soap1 = service.getBasicHttpBindingIImportExport1();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			
			//If both are NULL, throw exception
			if (soap == null && soap1 == null)
			{
				//Display the error
				throw new Exception ("Unable to connect with either the SpiraTest HTTP or HTTPS APIs. Please check the URL and try again: " + soapMessage + "\n");
			}
			
			//If one is NULL, simply set to the same as the other to avoid having to add NULL checks in the subsequent code
			if (soap == null)
			{
				soap = soap1;
			}
			else
			{
				soap1 = soap;
			}
			
			//Make sure that session is maintained
			Map<String, Object> requestContext = ((BindingProvider)soap).getRequestContext();
			requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
			Map<String, Object> requestContext1 = ((BindingProvider)soap1).getRequestContext();
			requestContext1.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
						
			//Authenticate
			boolean success = false;
			try
			{
				//SWB Changed password to type secret, but need to decrypt using .getPlainText()
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);
			}
			catch (Exception ex)
			{
				//Try using the second binding
				soap = soap1;
				//SWB Changed password to type secret, but need to decrypt using .getPlainText()
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);
			}
			
	        //Connect to the project
			success = soap.connectionConnectToProject(projectId);
			if (!success)
			{
				throw new Exception ("Unable to connect to SpiraTest project " + projectId + ", please check that the user is a member of this project");
			}
			
			//Verify the release exists
			/*
			RemoteFilter filter = new RemoteFilter();
			filter.setPropertyName(createJAXBString("PropertyName", "VersionNumber"));
			filter.setStringValue(createJAXBString("StringValue", releaseVersionNumber));
			ArrayOfRemoteFilter remoteFilters = new ArrayOfRemoteFilter();
			remoteFilters.getRemoteFilter().add(filter);
			ArrayOfRemoteRelease remoteReleases = soap.releaseRetrieve2(remoteFilters, 1, 10000);			
			*/
			//Get all the active releases
			ArrayOfRemoteRelease remoteReleases = soap.releaseRetrieve(true);
			
			if (remoteReleases == null || remoteReleases.getRemoteRelease() == null || remoteReleases.getRemoteRelease().isEmpty())
			{
				return null;
			}
			//Need to make sure we have an exact match since a filter will do a LIKE comparison
			Integer releaseId = null;
			for (RemoteRelease remoteRelease : remoteReleases.getRemoteRelease())
			{
				if (remoteRelease.getVersionNumber().getValue().equals(releaseVersionNumber))
				{
					releaseId = remoteRelease.getReleaseId().getValue();
					break;
				}
			}
			return releaseId;
		}
		catch (IImportExportConnectionAuthenticate2ServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error authenticating with SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
		catch (MalformedURLException exception)
		{
			throw new Exception ("Error creating URL for connecting to SpiraTest server (" + exception.getMessage() + ")\n\n");
		}
		catch (Exception exception)
		{
			//Display the error
			throw new Exception ("Error sending results to SpiraTest server (" + exception.getMessage() + ")\n\n");
		}	
	}
	
	/**
	 * Returns the full spira artifact URL for an artifact
	 * @param projectId		The current spira project
	 * @param prefix		The artifact prefix
	 * @param artifactId	The artifact id
	 * @return
	 * @throws Exception 
	 */
	public String createArtifactUrl (String prefix, int artifactId) throws Exception
	{
		//Instantiate the soap proxy
		try
		{

			//Break up the URL into server name and the service path
			URL serviceUrl = new URL(this.url + WEB_SERVICE_SUFFIX);

			ImportExport service = new ImportExport(serviceUrl, QName.valueOf(WEB_SERVICE_NAMESPACE));
			//Try both the HTTP and HTTPS ports
			IImportExport soap = null;
			IImportExport soap1 = null;
			String soapMessage = "";
			try
			{
				soap = service.getBasicHttpBindingIImportExport();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			try
			{
				soap1 = service.getBasicHttpBindingIImportExport1();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			
			//If both are NULL, throw exception
			if (soap == null && soap1 == null)
			{
				//Display the error
				throw new Exception ("Unable to connect with either the SpiraTest HTTP or HTTPS APIs. Please check the URL and try again: " + soapMessage + "\n");
			}
			
			//If one is NULL, simply set to the same as the other to avoid having to add NULL checks in the subsequent code
			if (soap == null)
			{
				soap = soap1;
			}
			
			//Get the navigation link for the prefix
			int artifactTypeId;
			artifactTypeId = ArtifactType.getByPrefix(prefix).getArtifactId();
			
			//Get the artifact URL from the server
			String relativeUrl = soap.systemGetArtifactUrl(artifactTypeId, projectId, artifactId, "");
			String absoluteUrl = relativeUrl.replaceFirst("~", this.url);
			return absoluteUrl;
		}
		catch (IImportExportSystemGetArtifactUrlServiceFaultMessageFaultFaultMessage ex)
		{
			throw new Exception ("Unable to create artifact URL", ex);
		}
	}
	
	/**
	 * Creates a new build entry in SpiraTest
	 * @param releaseVersionNumber			The current release
	 * @param creationDate 		The creation date
	 * @param buildStatusId 	The status of the build (1 = Fail, 2 = Succeed)
	 * @param name 				The name of the build
	 * @param description 		The full build description
	 * @param revisions			The list of revisions associated with the build
	 * @param incidents			The list of incidents fixed in the build
	 * @return
	 * @throws Exception 
	 */
	public int recordBuild(String releaseVersionNumber, Date creationDate, int buildStatusId, String name, String description, List<String> revisions, List<Integer> incidents) throws Exception
	{
		//Instantiate the soap proxy
		try
		{

			//Break up the URL into server name and the service path
			URL serviceUrl = new URL(this.url + WEB_SERVICE_SUFFIX);

			ImportExport service = new ImportExport(serviceUrl, QName.valueOf(WEB_SERVICE_NAMESPACE));
			//Try both the HTTP and HTTPS ports
			IImportExport soap = null;
			IImportExport soap1 = null;
			String soapMessage = "";
			try
			{
				soap = service.getBasicHttpBindingIImportExport();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			try
			{
				soap1 = service.getBasicHttpBindingIImportExport1();
			}
			catch (WebServiceException ex)
			{
				//Ignore as the port will be left as null
				soapMessage = ex.getMessage() + " - " + extractStackTrace(ex.getStackTrace());
			}
			
			//If both are NULL, throw exception
			if (soap == null && soap1 == null)
			{
				//Display the error
				throw new Exception ("Unable to connect with either the SpiraTest HTTP or HTTPS APIs. Please check the URL and try again: " + soapMessage + "\n");
			}
			
			//If one is NULL, simply set to the same as the other to avoid having to add NULL checks in the subsequent code
			if (soap == null)
			{
				soap = soap1;
			}
			else
			{
				soap1 = soap;
			}
			
			//Make sure that session is maintained
			Map<String, Object> requestContext = ((BindingProvider)soap).getRequestContext();
			requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
			Map<String, Object> requestContext1 = ((BindingProvider)soap1).getRequestContext();
			requestContext1.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
						
			//Authenticate
			boolean success = false;
			try
			{
				//SWB Changed password to type secret, but need to decrypt using .getPlainText()
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);
			}
			catch (Exception ex)
			{
				//Try using the second binding
				soap = soap1;
				//SWB Changed password to type secret, but need to decrypt using .getPlainText()
				success = soap.connectionAuthenticate2(this.userName, this.password.getPlainText(), SPIRA_PLUG_IN_NAME);
			}
			if (!success)
			{
				//Display the error
				throw new Exception ("Unable to authenticate with SpiraTest server. Please check the username/password and try again");
			}
	        
	        //Connect to the project
			success = soap.connectionConnectToProject(projectId);
			if (!success)
			{
				throw new Exception ("Unable to connect to SpiraTest project PR" + projectId + " with user '" + this.userName + "', please check that the user is a member of this project");
			}

			//See if we have any associated revisions
			ArrayOfRemoteBuildSourceCode remoteSourceCodeRevisions = new ArrayOfRemoteBuildSourceCode();
			if (revisions != null && !revisions.isEmpty())
			{
				for (String revisionKey : revisions)
				{
					RemoteBuildSourceCode remoteSourceCodeRevision = new RemoteBuildSourceCode();
					remoteSourceCodeRevision.setRevisionKey(createJAXBString("RevisionKey", revisionKey));
					remoteSourceCodeRevisions.getRemoteBuildSourceCode().add(remoteSourceCodeRevision);
				}
			}
			
			//Now get the release id for the specific version number
			//Get all the active releases
			Integer releaseId = null;
			ArrayOfRemoteRelease remoteReleases = soap.releaseRetrieve(true);			
			if (remoteReleases != null && remoteReleases.getRemoteRelease() != null && !remoteReleases.getRemoteRelease().isEmpty())
			{
				//Need to make sure we have an exact match since a filter will do a LIKE comparison
				for (RemoteRelease remoteRelease : remoteReleases.getRemoteRelease())
				{
					if (remoteRelease.getVersionNumber().getValue().equals(releaseVersionNumber))
					{
						releaseId = remoteRelease.getReleaseId().getValue();
						break;
					}
				}
			}
			if (releaseId == null)
			{
				throw new Exception("Unable to locate a release with version number '" + releaseVersionNumber + "' in project PR" + this.projectId);
			}
			
			//Now record the new build
			RemoteBuild remoteBuild = new RemoteBuild();
			remoteBuild.setReleaseId(releaseId);
			remoteBuild.setBuildStatusId(buildStatusId);	//Succeeded
			remoteBuild.setName(createJAXBString("Name", cleanText(name)));
			remoteBuild.setDescription(createJAXBString("Description", cleanText(description)));
			remoteBuild.setCreationDate(createJAXBXMLGregorianCalendar("CreationDate", convertDatesJava2Xml(creationDate)));			
			if (remoteSourceCodeRevisions.getRemoteBuildSourceCode() != null && !remoteSourceCodeRevisions.getRemoteBuildSourceCode().isEmpty())
			{
				remoteBuild.setRevisions(createJAXBBuildRevisionArray("Revisions", remoteSourceCodeRevisions));
			}
			remoteBuild = soap.buildCreate(remoteBuild);
			int buildId = remoteBuild.getBuildId().getValue();
			
			//Now we need to set the 'FixedBuildId' for any incidents listed in the commit messages
			if (incidents != null && !incidents.isEmpty())
			{
				for (Integer incidentId : incidents)
				{
					//Try and retrieve the incident
					RemoteIncident remoteIncident = soap.incidentRetrieveById(incidentId);
					if (remoteIncident != null)
					{
						remoteIncident.setFixedBuildId(createJAXBInteger("FixedBuildId", buildId));
						soap.incidentUpdate(remoteIncident);
					}
				}
			}
			
			return buildId;
		}
		catch (IImportExportBuildCreateServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error sending results to SpiraTest server (" + exception.getMessage() + ")");
		}
		catch (IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error connecting to SpiraTest project (" + exception.getMessage() + ")");
		}
		catch (IImportExportConnectionAuthenticate2ServiceFaultMessageFaultFaultMessage exception)
		{
			throw new Exception ("Error authenticating with SpiraTest server (" + exception.getMessage() + ")");
		}
		catch (MalformedURLException exception)
		{
			throw new Exception("Error creating URL for connecting to SpiraTest server (" + exception.getMessage() + ")");
		}
		catch (Exception exception)
		{
			//Display the error
			throw new Exception ("Error sending results to SpiraTest server (" + exception.getMessage() + ")");
		}
	}
	
	/**
	 * Removes any invalid XML contract characters from a string before being used in a SOAP call
	 * @param text
	 * @return
	 */
	public String cleanText(String text)
	{
		if (text == null)
		{
			return null;
		}
		return text.replaceAll("\\p{Cntrl}", "");
	}
	
	public String extractStackTrace(StackTraceElement[] elements)
	{
        //use a StringBuffer for better performance
        StringBuffer buffer = new StringBuffer();
		if (elements != null)
		{

			for (int i = 0; i < elements.length; i++)
			{
				buffer.append(elements[i].toString());
			}
		}
		
		return buffer.toString();
	}
	
	public static XMLGregorianCalendar convertDatesJava2Xml(Date date)
	{
		if (date == null)
		{
			return null;
		}
		try
		{
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
			XMLGregorianCalendar xmlCal = datatypeFactory.newXMLGregorianCalendar(calendar);
			//We need to unset the timezone because SpiraTeam is not expected it
			//and it will break concurrency
			xmlCal.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			return xmlCal;
		}
		catch (DatatypeConfigurationException ex)
		{
			return null;
		}
	}
	
	/***
	 * Creates a JAXB web service string element from a Java string
	 * @param value
	 * @return
	 */
	public static JAXBElement<String> createJAXBString(String fieldName, String value)
	{
		JAXBElement<String> jaxString = new JAXBElement<String>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, fieldName), String.class, value);
		if (value == null)
		{
			jaxString.setNil(true);
		}
		return jaxString;
	}
	
	/***
	 * Creates a JAXB web service string element from an Array of Remote Build Revisions
	 * @param value
	 * @return
	 */
	public static JAXBElement<ArrayOfRemoteBuildSourceCode> createJAXBBuildRevisionArray(String fieldName, ArrayOfRemoteBuildSourceCode value)
	{
		JAXBElement<ArrayOfRemoteBuildSourceCode> jaxObject = new JAXBElement<ArrayOfRemoteBuildSourceCode>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, fieldName), ArrayOfRemoteBuildSourceCode.class, value);
		if (value == null)
		{
			jaxObject.setNil(true);
		}
		return jaxObject;
	}
	
	/***
	 * Creates a JAXB web service integer element from a Java integer
	 * @param value
	 * @return
	 */
	public static JAXBElement<Integer> createJAXBInteger(String fieldName, Integer value)
	{
		JAXBElement<Integer> jaxInteger = new JAXBElement<Integer>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, fieldName), Integer.class, value);
		if (value == null)
		{
			jaxInteger.setNil(true);
		}
		return jaxInteger;
	}
	
	/***
	 * Creates a JAXB web service XMLGregorianCalendar element from a Java XMLGregorianCalendar object
	 * @param value
	 * @return
	 */
	public static JAXBElement<XMLGregorianCalendar> createJAXBXMLGregorianCalendar(String fieldName, XMLGregorianCalendar value)
	{
		JAXBElement<XMLGregorianCalendar> jaxXMLGregorianCalendar = new JAXBElement<XMLGregorianCalendar>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, fieldName), XMLGregorianCalendar.class, value);
		if (value == null)
		{
			jaxXMLGregorianCalendar.setNil(true);
		}
		return jaxXMLGregorianCalendar;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Secret getPassword() {
		return password;
	}

	public void setPassword(Secret password) {

		this.password = password;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
}
