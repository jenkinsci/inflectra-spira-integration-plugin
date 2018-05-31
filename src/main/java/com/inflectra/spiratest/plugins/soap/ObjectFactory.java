
package com.inflectra.spiratest.plugins.soap;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inflectra.spiratest.plugins.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _RemoteFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteFilter");
    private final static QName _ArrayOfRemoteIncident_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteIncident");
    private final static QName _RemoteSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteSetting");
    private final static QName _RemoteRelease_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteRelease");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DateRange_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "DateRange");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfRemoteTestSetTestCaseParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteTestSetTestCaseParameter");
    private final static QName _RemoteBuild_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteBuild");
    private final static QName _ArrayOfRemoteTestRun_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteTestRun");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _RemoteBuildSourceCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteBuildSourceCode");
    private final static QName _MultiValueFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "MultiValueFilter");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _RemoteTestRunStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteTestRunStep");
    private final static QName _ServiceFaultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", "ServiceFaultMessage");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfRemoteBuildSourceCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteBuildSourceCode");
    private final static QName _RemoteProject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteProject");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _RemoteArtifact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteArtifact");
    private final static QName _ArrayOfRemoteSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteSetting");
    private final static QName _RemoteTestRun_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteTestRun");
    private final static QName _RemoteManualTestRun_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteManualTestRun");
    private final static QName _RemoteTestSetTestCaseParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteTestSetTestCaseParameter");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _RemoteSort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteSort");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfRemoteFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteFilter");
    private final static QName _ArrayOfRemoteManualTestRun_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteManualTestRun");
    private final static QName _ArrayOfRemoteRelease_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteRelease");
    private final static QName _RemoteIncident_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteIncident");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfRemoteTestRunStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteTestRunStep");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfRemoteBuild_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteBuild");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _RemoteAutomatedTestRun_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteAutomatedTestRun");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _RemoteVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemoteVersion");
    private final static QName _ArrayOfRemoteProject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteProject");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfRemoteAutomatedTestRun_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ArrayOfRemoteAutomatedTestRun");
    private final static QName _ProjectRetrieveResponseProjectRetrieveResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Project_RetrieveResult");
    private final static QName _RemoteManualTestRunTestRunSteps_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TestRunSteps");
    private final static QName _TestRunRetrieveResponseTestRunRetrieveResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_RetrieveResult");
    private final static QName _RemoteVersionPatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Patch");
    private final static QName _RemoteVersionVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Version");
    private final static QName _MultiValueFilterValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Values");
    private final static QName _IncidentRetrieveByIdResponseIncidentRetrieveByIdResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Incident_RetrieveByIdResult");
    private final static QName _ReleaseRetrieve2ResponseReleaseRetrieve2Result_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Release_Retrieve2Result");
    private final static QName _TestRunCreateFromTestCasesTestCaseIds_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "testCaseIds");
    private final static QName _TestRunCreateFromTestCasesReleaseId_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "releaseId");
    private final static QName _TestRunRecordAutomated1ResponseTestRunRecordAutomated1Result_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_RecordAutomated1Result");
    private final static QName _RemoteFilterDateRangeValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "DateRangeValue");
    private final static QName _RemoteFilterIntValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IntValue");
    private final static QName _RemoteFilterMultiValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "MultiValue");
    private final static QName _RemoteFilterStringValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "StringValue");
    private final static QName _RemoteFilterPropertyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "PropertyName");
    private final static QName _SystemGetWebServerUrlResponseSystemGetWebServerUrlResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "System_GetWebServerUrlResult");
    private final static QName _TestRunRecordAutomated3RemoteTestRuns_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "remoteTestRuns");
    private final static QName _RemoteAutomatedTestRunRunnerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RunnerName");
    private final static QName _RemoteAutomatedTestRunAutomationEngineId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "AutomationEngineId");
    private final static QName _RemoteAutomatedTestRunParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Parameters");
    private final static QName _RemoteAutomatedTestRunRunnerStackTrace_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RunnerStackTrace");
    private final static QName _RemoteAutomatedTestRunAutomationEngineToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "AutomationEngineToken");
    private final static QName _RemoteAutomatedTestRunScheduledDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ScheduledDate");
    private final static QName _RemoteAutomatedTestRunAutomationHostId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "AutomationHostId");
    private final static QName _RemoteAutomatedTestRunRunnerTestName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RunnerTestName");
    private final static QName _RemoteAutomatedTestRunAutomationAttachmentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "AutomationAttachmentId");
    private final static QName _RemoteAutomatedTestRunRunnerMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RunnerMessage");
    private final static QName _RemoteAutomatedTestRunRunnerAssertCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RunnerAssertCount");
    private final static QName _RemoteAutomatedTestRunProjectId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ProjectId");
    private final static QName _TestRunRecordAutomated1RemoteTestRun_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "remoteTestRun");
    private final static QName _RemoteSettingValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Value");
    private final static QName _RemoteSettingName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Name");
    private final static QName _RemoteTestRunEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "EndDate");
    private final static QName _RemoteTestRunTestSetTestCaseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TestSetTestCaseId");
    private final static QName _RemoteTestRunTestSetId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TestSetId");
    private final static QName _RemoteTestRunReleaseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ReleaseId");
    private final static QName _RemoteTestRunBuildId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "BuildId");
    private final static QName _RemoteTestRunTestRunId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TestRunId");
    private final static QName _RemoteTestRunTesterId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TesterId");
    private final static QName _ConnectionAuthenticateUserName_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "userName");
    private final static QName _ConnectionAuthenticatePassword_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "password");
    private final static QName _TestRunRetrieveByIdResponseTestRunRetrieveByIdResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_RetrieveByIdResult");
    private final static QName _TestRunCreateForAutomatedTestSetResponseTestRunCreateForAutomatedTestSetResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_CreateForAutomatedTestSetResult");
    private final static QName _TestRunCreateForAutomationHostResponseTestRunCreateForAutomationHostResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_CreateForAutomationHostResult");
    private final static QName _TestRunRetrieveAutomatedByIdResponseTestRunRetrieveAutomatedByIdResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_RetrieveAutomatedByIdResult");
    private final static QName _RemoteIncidentIncidentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IncidentId");
    private final static QName _RemoteIncidentIncidentTypeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IncidentTypeId");
    private final static QName _RemoteIncidentPriorityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "PriorityId");
    private final static QName _RemoteIncidentOpenerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "OpenerId");
    private final static QName _RemoteIncidentSeverityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "SeverityId");
    private final static QName _RemoteIncidentVerifiedReleaseVersionNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "VerifiedReleaseVersionNumber");
    private final static QName _RemoteIncidentActualEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ActualEffort");
    private final static QName _RemoteIncidentRemainingEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RemainingEffort");
    private final static QName _RemoteIncidentDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Description");
    private final static QName _RemoteIncidentProjectName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ProjectName");
    private final static QName _RemoteIncidentDetectedReleaseVersionNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "DetectedReleaseVersionNumber");
    private final static QName _RemoteIncidentPriorityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "PriorityName");
    private final static QName _RemoteIncidentClosedDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ClosedDate");
    private final static QName _RemoteIncidentCreationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "CreationDate");
    private final static QName _RemoteIncidentProjectedEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ProjectedEffort");
    private final static QName _RemoteIncidentIncidentStatusName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IncidentStatusName");
    private final static QName _RemoteIncidentVerifiedReleaseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "VerifiedReleaseId");
    private final static QName _RemoteIncidentStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "StartDate");
    private final static QName _RemoteIncidentIncidentTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IncidentTypeName");
    private final static QName _RemoteIncidentFixedBuildName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "FixedBuildName");
    private final static QName _RemoteIncidentFixedBuildId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "FixedBuildId");
    private final static QName _RemoteIncidentSeverityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "SeverityName");
    private final static QName _RemoteIncidentDetectedReleaseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "DetectedReleaseId");
    private final static QName _RemoteIncidentEstimatedEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "EstimatedEffort");
    private final static QName _RemoteIncidentOwnerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "OwnerName");
    private final static QName _RemoteIncidentResolvedReleaseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ResolvedReleaseId");
    private final static QName _RemoteIncidentTestRunStepId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TestRunStepId");
    private final static QName _RemoteIncidentOwnerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "OwnerId");
    private final static QName _RemoteIncidentIncidentStatusOpenStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IncidentStatusOpenStatus");
    private final static QName _RemoteIncidentIncidentStatusId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IncidentStatusId");
    private final static QName _RemoteIncidentResolvedReleaseVersionNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ResolvedReleaseVersionNumber");
    private final static QName _RemoteIncidentOpenerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "OpenerName");
    private final static QName _SystemGetProductVersionResponseSystemGetProductVersionResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "System_GetProductVersionResult");
    private final static QName _ServiceFaultMessageMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", "Message");
    private final static QName _ServiceFaultMessageType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", "Type");
    private final static QName _ServiceFaultMessageStackTrace_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", "StackTrace");
    private final static QName _TestRunCreateFromTestCasesResponseTestRunCreateFromTestCasesResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_CreateFromTestCasesResult");
    private final static QName _RemoteBuildSourceCodeRevisionKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "RevisionKey");
    private final static QName _TestRunCreateForAutomatedTestSetAutomationHostToken_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "automationHostToken");
    private final static QName _BuildRetrieveByIdResponseBuildRetrieveByIdResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Build_RetrieveByIdResult");
    private final static QName _IncidentUpdateRemoteIncident_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "remoteIncident");
    private final static QName _TestRunSaveResponseTestRunSaveResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_SaveResult");
    private final static QName _BuildCreateRemoteBuild_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "remoteBuild");
    private final static QName _TestRunRecordAutomated2RunnerTestName_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "runnerTestName");
    private final static QName _TestRunRecordAutomated2RunnerStackTrace_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "runnerStackTrace");
    private final static QName _TestRunRecordAutomated2TestSetTestCaseId_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "testSetTestCaseId");
    private final static QName _TestRunRecordAutomated2RunnerName_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "runnerName");
    private final static QName _TestRunRecordAutomated2TestSetId_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "testSetId");
    private final static QName _TestRunRecordAutomated2RunnerMessage_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "runnerMessage");
    private final static QName _BuildCreateResponseBuildCreateResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Build_CreateResult");
    private final static QName _BuildRetrieveByReleaseIdResponseBuildRetrieveByReleaseIdResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Build_RetrieveByReleaseIdResult");
    private final static QName _TestRunCreateForAutomationHostDateRange_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "dateRange");
    private final static QName _RemoteBuildBuildStatusName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "BuildStatusName");
    private final static QName _RemoteBuildRevisions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Revisions");
    private final static QName _IncidentRetrieveRemoteFilters_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "remoteFilters");
    private final static QName _IncidentRetrieveRemoteSort_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "remoteSort");
    private final static QName _TestRunCreateFromTestSetResponseTestRunCreateFromTestSetResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_CreateFromTestSetResult");
    private final static QName _ReleaseRetrieveResponseReleaseRetrieveResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Release_RetrieveResult");
    private final static QName _TestRunRetrieveManualByIdResponseTestRunRetrieveManualByIdResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_RetrieveManualByIdResult");
    private final static QName _ConnectionAuthenticate2PlugInName_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "plugInName");
    private final static QName _SystemGetSettingsResponseSystemGetSettingsResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "System_GetSettingsResult");
    private final static QName _ProjectRetrieveByIdResponseProjectRetrieveByIdResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Project_RetrieveByIdResult");
    private final static QName _IncidentRetrieveResponseIncidentRetrieveResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Incident_RetrieveResult");
    private final static QName _SystemGetArtifactUrlTabName_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "tabName");
    private final static QName _RemoteReleaseTaskEstimatedEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TaskEstimatedEffort");
    private final static QName _RemoteReleaseFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "FullName");
    private final static QName _RemoteReleaseIndentLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "IndentLevel");
    private final static QName _RemoteReleaseCreatorId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "CreatorId");
    private final static QName _RemoteReleaseCreatorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "CreatorName");
    private final static QName _RemoteReleaseVersionNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "VersionNumber");
    private final static QName _RemoteReleaseTaskCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TaskCount");
    private final static QName _RemoteReleaseAvailableEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "AvailableEffort");
    private final static QName _RemoteReleaseTaskActualEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TaskActualEffort");
    private final static QName _RemoteReleasePlannedEffort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "PlannedEffort");
    private final static QName _RemoteArtifactText05_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text05");
    private final static QName _RemoteArtifactText06_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text06");
    private final static QName _RemoteArtifactText03_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text03");
    private final static QName _RemoteArtifactText04_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text04");
    private final static QName _RemoteArtifactText09_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text09");
    private final static QName _RemoteArtifactText07_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text07");
    private final static QName _RemoteArtifactText08_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text08");
    private final static QName _RemoteArtifactList04_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List04");
    private final static QName _RemoteArtifactList05_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List05");
    private final static QName _RemoteArtifactList02_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List02");
    private final static QName _RemoteArtifactList03_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List03");
    private final static QName _RemoteArtifactList08_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List08");
    private final static QName _RemoteArtifactList09_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List09");
    private final static QName _RemoteArtifactList06_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List06");
    private final static QName _RemoteArtifactList07_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List07");
    private final static QName _RemoteArtifactList01_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List01");
    private final static QName _RemoteArtifactList10_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "List10");
    private final static QName _RemoteArtifactText02_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text02");
    private final static QName _RemoteArtifactText10_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text10");
    private final static QName _RemoteArtifactText01_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Text01");
    private final static QName _TestRunRecordAutomated3ResponseTestRunRecordAutomated3Result_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "TestRun_RecordAutomated3Result");
    private final static QName _SystemGetArtifactUrlResponseSystemGetArtifactUrlResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "System_GetArtifactUrlResult");
    private final static QName _RemoteTestRunStepTestStepId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TestStepId");
    private final static QName _RemoteTestRunStepTestCaseId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "TestCaseId");
    private final static QName _RemoteTestRunStepExpectedResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ExpectedResult");
    private final static QName _RemoteTestRunStepActualResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "ActualResult");
    private final static QName _RemoteTestRunStepSampleData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "SampleData");
    private final static QName _RemoteProjectWebsite_QNAME = new QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", "Website");
    private final static QName _SystemGetProductNameResponseSystemGetProductNameResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "System_GetProductNameResult");
    private final static QName _IncidentCreateResponseIncidentCreateResult_QNAME = new QName("http://www.inflectra.com/SpiraTest/Services/v3.0/", "Incident_CreateResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inflectra.spiratest.plugins.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfRemoteBuild }
     * 
     */
    public ArrayOfRemoteBuild createArrayOfRemoteBuild() {
        return new ArrayOfRemoteBuild();
    }

    /**
     * Create an instance of {@link SystemGetWebServerUrl }
     * 
     */
    public SystemGetWebServerUrl createSystemGetWebServerUrl() {
        return new SystemGetWebServerUrl();
    }

    /**
     * Create an instance of {@link IncidentRetrieveByIdResponse }
     * 
     */
    public IncidentRetrieveByIdResponse createIncidentRetrieveByIdResponse() {
        return new IncidentRetrieveByIdResponse();
    }

    /**
     * Create an instance of {@link ReleaseRetrieve2Response }
     * 
     */
    public ReleaseRetrieve2Response createReleaseRetrieve2Response() {
        return new ReleaseRetrieve2Response();
    }

    /**
     * Create an instance of {@link TestRunRetrieveAutomatedById }
     * 
     */
    public TestRunRetrieveAutomatedById createTestRunRetrieveAutomatedById() {
        return new TestRunRetrieveAutomatedById();
    }

    /**
     * Create an instance of {@link TestRunCreateFromTestCases }
     * 
     */
    public TestRunCreateFromTestCases createTestRunCreateFromTestCases() {
        return new TestRunCreateFromTestCases();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteSetting }
     * 
     */
    public ArrayOfRemoteSetting createArrayOfRemoteSetting() {
        return new ArrayOfRemoteSetting();
    }

    /**
     * Create an instance of {@link ConnectionDisconnectResponse }
     * 
     */
    public ConnectionDisconnectResponse createConnectionDisconnectResponse() {
        return new ConnectionDisconnectResponse();
    }

    /**
     * Create an instance of {@link TestRunRecordAutomated1Response }
     * 
     */
    public TestRunRecordAutomated1Response createTestRunRecordAutomated1Response() {
        return new TestRunRecordAutomated1Response();
    }

    /**
     * Create an instance of {@link RemoteFilter }
     * 
     */
    public RemoteFilter createRemoteFilter() {
        return new RemoteFilter();
    }

    /**
     * Create an instance of {@link SystemGetSettings }
     * 
     */
    public SystemGetSettings createSystemGetSettings() {
        return new SystemGetSettings();
    }

    /**
     * Create an instance of {@link SystemGetWebServerUrlResponse }
     * 
     */
    public SystemGetWebServerUrlResponse createSystemGetWebServerUrlResponse() {
        return new SystemGetWebServerUrlResponse();
    }

    /**
     * Create an instance of {@link ConnectionAuthenticate2Response }
     * 
     */
    public ConnectionAuthenticate2Response createConnectionAuthenticate2Response() {
        return new ConnectionAuthenticate2Response();
    }

    /**
     * Create an instance of {@link BuildRetrieveById }
     * 
     */
    public BuildRetrieveById createBuildRetrieveById() {
        return new BuildRetrieveById();
    }

    /**
     * Create an instance of {@link RemoteAutomatedTestRun }
     * 
     */
    public RemoteAutomatedTestRun createRemoteAutomatedTestRun() {
        return new RemoteAutomatedTestRun();
    }

    /**
     * Create an instance of {@link TestRunCreateFromTestSet }
     * 
     */
    public TestRunCreateFromTestSet createTestRunCreateFromTestSet() {
        return new TestRunCreateFromTestSet();
    }

    /**
     * Create an instance of {@link TestRunRecordAutomated1 }
     * 
     */
    public TestRunRecordAutomated1 createTestRunRecordAutomated1() {
        return new TestRunRecordAutomated1();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteProject }
     * 
     */
    public ArrayOfRemoteProject createArrayOfRemoteProject() {
        return new ArrayOfRemoteProject();
    }

    /**
     * Create an instance of {@link RemoteTestRun }
     * 
     */
    public RemoteTestRun createRemoteTestRun() {
        return new RemoteTestRun();
    }

    /**
     * Create an instance of {@link ConnectionAuthenticate }
     * 
     */
    public ConnectionAuthenticate createConnectionAuthenticate() {
        return new ConnectionAuthenticate();
    }

    /**
     * Create an instance of {@link TestRunRetrieveByIdResponse }
     * 
     */
    public TestRunRetrieveByIdResponse createTestRunRetrieveByIdResponse() {
        return new TestRunRetrieveByIdResponse();
    }

    /**
     * Create an instance of {@link TestRunCreateForAutomatedTestSetResponse }
     * 
     */
    public TestRunCreateForAutomatedTestSetResponse createTestRunCreateForAutomatedTestSetResponse() {
        return new TestRunCreateForAutomatedTestSetResponse();
    }

    /**
     * Create an instance of {@link ConnectionConnectToProjectResponse }
     * 
     */
    public ConnectionConnectToProjectResponse createConnectionConnectToProjectResponse() {
        return new ConnectionConnectToProjectResponse();
    }

    /**
     * Create an instance of {@link TestRunRetrieveAutomatedByIdResponse }
     * 
     */
    public TestRunRetrieveAutomatedByIdResponse createTestRunRetrieveAutomatedByIdResponse() {
        return new TestRunRetrieveAutomatedByIdResponse();
    }

    /**
     * Create an instance of {@link SystemGetProductVersionResponse }
     * 
     */
    public SystemGetProductVersionResponse createSystemGetProductVersionResponse() {
        return new SystemGetProductVersionResponse();
    }

    /**
     * Create an instance of {@link TestRunCreateForAutomatedTestSet }
     * 
     */
    public TestRunCreateForAutomatedTestSet createTestRunCreateForAutomatedTestSet() {
        return new TestRunCreateForAutomatedTestSet();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link TestRunSaveResponse }
     * 
     */
    public TestRunSaveResponse createTestRunSaveResponse() {
        return new TestRunSaveResponse();
    }

    /**
     * Create an instance of {@link ConnectionDisconnect }
     * 
     */
    public ConnectionDisconnect createConnectionDisconnect() {
        return new ConnectionDisconnect();
    }

    /**
     * Create an instance of {@link BuildCreate }
     * 
     */
    public BuildCreate createBuildCreate() {
        return new BuildCreate();
    }

    /**
     * Create an instance of {@link BuildRetrieveByReleaseIdResponse }
     * 
     */
    public BuildRetrieveByReleaseIdResponse createBuildRetrieveByReleaseIdResponse() {
        return new BuildRetrieveByReleaseIdResponse();
    }

    /**
     * Create an instance of {@link RemoteBuild }
     * 
     */
    public RemoteBuild createRemoteBuild() {
        return new RemoteBuild();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteRelease }
     * 
     */
    public ArrayOfRemoteRelease createArrayOfRemoteRelease() {
        return new ArrayOfRemoteRelease();
    }

    /**
     * Create an instance of {@link ProjectRetrieve }
     * 
     */
    public ProjectRetrieve createProjectRetrieve() {
        return new ProjectRetrieve();
    }

    /**
     * Create an instance of {@link TestRunCreateFromTestSetResponse }
     * 
     */
    public TestRunCreateFromTestSetResponse createTestRunCreateFromTestSetResponse() {
        return new TestRunCreateFromTestSetResponse();
    }

    /**
     * Create an instance of {@link ConnectionAuthenticateResponse }
     * 
     */
    public ConnectionAuthenticateResponse createConnectionAuthenticateResponse() {
        return new ConnectionAuthenticateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteBuildSourceCode }
     * 
     */
    public ArrayOfRemoteBuildSourceCode createArrayOfRemoteBuildSourceCode() {
        return new ArrayOfRemoteBuildSourceCode();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteIncident }
     * 
     */
    public ArrayOfRemoteIncident createArrayOfRemoteIncident() {
        return new ArrayOfRemoteIncident();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteAutomatedTestRun }
     * 
     */
    public ArrayOfRemoteAutomatedTestRun createArrayOfRemoteAutomatedTestRun() {
        return new ArrayOfRemoteAutomatedTestRun();
    }

    /**
     * Create an instance of {@link TestRunRetrieve }
     * 
     */
    public TestRunRetrieve createTestRunRetrieve() {
        return new TestRunRetrieve();
    }

    /**
     * Create an instance of {@link RemoteTestSetTestCaseParameter }
     * 
     */
    public RemoteTestSetTestCaseParameter createRemoteTestSetTestCaseParameter() {
        return new RemoteTestSetTestCaseParameter();
    }

    /**
     * Create an instance of {@link SystemGetServerDateTimeResponse }
     * 
     */
    public SystemGetServerDateTimeResponse createSystemGetServerDateTimeResponse() {
        return new SystemGetServerDateTimeResponse();
    }

    /**
     * Create an instance of {@link RemoteProject }
     * 
     */
    public RemoteProject createRemoteProject() {
        return new RemoteProject();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteFilter }
     * 
     */
    public ArrayOfRemoteFilter createArrayOfRemoteFilter() {
        return new ArrayOfRemoteFilter();
    }

    /**
     * Create an instance of {@link ProjectRetrieveResponse }
     * 
     */
    public ProjectRetrieveResponse createProjectRetrieveResponse() {
        return new ProjectRetrieveResponse();
    }

    /**
     * Create an instance of {@link RemoteManualTestRun }
     * 
     */
    public RemoteManualTestRun createRemoteManualTestRun() {
        return new RemoteManualTestRun();
    }

    /**
     * Create an instance of {@link ReleaseRetrieve }
     * 
     */
    public ReleaseRetrieve createReleaseRetrieve() {
        return new ReleaseRetrieve();
    }

    /**
     * Create an instance of {@link TestRunRetrieveResponse }
     * 
     */
    public TestRunRetrieveResponse createTestRunRetrieveResponse() {
        return new TestRunRetrieveResponse();
    }

    /**
     * Create an instance of {@link ProjectRetrieveById }
     * 
     */
    public ProjectRetrieveById createProjectRetrieveById() {
        return new ProjectRetrieveById();
    }

    /**
     * Create an instance of {@link IncidentUpdateResponse }
     * 
     */
    public IncidentUpdateResponse createIncidentUpdateResponse() {
        return new IncidentUpdateResponse();
    }

    /**
     * Create an instance of {@link RemoteVersion }
     * 
     */
    public RemoteVersion createRemoteVersion() {
        return new RemoteVersion();
    }

    /**
     * Create an instance of {@link MultiValueFilter }
     * 
     */
    public MultiValueFilter createMultiValueFilter() {
        return new MultiValueFilter();
    }

    /**
     * Create an instance of {@link SystemGetProductVersion }
     * 
     */
    public SystemGetProductVersion createSystemGetProductVersion() {
        return new SystemGetProductVersion();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteManualTestRun }
     * 
     */
    public ArrayOfRemoteManualTestRun createArrayOfRemoteManualTestRun() {
        return new ArrayOfRemoteManualTestRun();
    }

    /**
     * Create an instance of {@link TestRunRecordAutomated3 }
     * 
     */
    public TestRunRecordAutomated3 createTestRunRecordAutomated3() {
        return new TestRunRecordAutomated3();
    }

    /**
     * Create an instance of {@link SystemGetProductName }
     * 
     */
    public SystemGetProductName createSystemGetProductName() {
        return new SystemGetProductName();
    }

    /**
     * Create an instance of {@link RemoteSetting }
     * 
     */
    public RemoteSetting createRemoteSetting() {
        return new RemoteSetting();
    }

    /**
     * Create an instance of {@link SystemGetServerDateTime }
     * 
     */
    public SystemGetServerDateTime createSystemGetServerDateTime() {
        return new SystemGetServerDateTime();
    }

    /**
     * Create an instance of {@link TestRunRecordAutomated2Response }
     * 
     */
    public TestRunRecordAutomated2Response createTestRunRecordAutomated2Response() {
        return new TestRunRecordAutomated2Response();
    }

    /**
     * Create an instance of {@link TestRunRetrieveManualById }
     * 
     */
    public TestRunRetrieveManualById createTestRunRetrieveManualById() {
        return new TestRunRetrieveManualById();
    }

    /**
     * Create an instance of {@link TestRunCreateForAutomationHostResponse }
     * 
     */
    public TestRunCreateForAutomationHostResponse createTestRunCreateForAutomationHostResponse() {
        return new TestRunCreateForAutomationHostResponse();
    }

    /**
     * Create an instance of {@link RemoteIncident }
     * 
     */
    public RemoteIncident createRemoteIncident() {
        return new RemoteIncident();
    }

    /**
     * Create an instance of {@link TestRunCreateFromTestCasesResponse }
     * 
     */
    public TestRunCreateFromTestCasesResponse createTestRunCreateFromTestCasesResponse() {
        return new TestRunCreateFromTestCasesResponse();
    }

    /**
     * Create an instance of {@link ServiceFaultMessage }
     * 
     */
    public ServiceFaultMessage createServiceFaultMessage() {
        return new ServiceFaultMessage();
    }

    /**
     * Create an instance of {@link RemoteBuildSourceCode }
     * 
     */
    public RemoteBuildSourceCode createRemoteBuildSourceCode() {
        return new RemoteBuildSourceCode();
    }

    /**
     * Create an instance of {@link BuildRetrieveByIdResponse }
     * 
     */
    public BuildRetrieveByIdResponse createBuildRetrieveByIdResponse() {
        return new BuildRetrieveByIdResponse();
    }

    /**
     * Create an instance of {@link IncidentUpdate }
     * 
     */
    public IncidentUpdate createIncidentUpdate() {
        return new IncidentUpdate();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteTestSetTestCaseParameter }
     * 
     */
    public ArrayOfRemoteTestSetTestCaseParameter createArrayOfRemoteTestSetTestCaseParameter() {
        return new ArrayOfRemoteTestSetTestCaseParameter();
    }

    /**
     * Create an instance of {@link TestRunRecordAutomated2 }
     * 
     */
    public TestRunRecordAutomated2 createTestRunRecordAutomated2() {
        return new TestRunRecordAutomated2();
    }

    /**
     * Create an instance of {@link BuildCreateResponse }
     * 
     */
    public BuildCreateResponse createBuildCreateResponse() {
        return new BuildCreateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteTestRunStep }
     * 
     */
    public ArrayOfRemoteTestRunStep createArrayOfRemoteTestRunStep() {
        return new ArrayOfRemoteTestRunStep();
    }

    /**
     * Create an instance of {@link TestRunCreateForAutomationHost }
     * 
     */
    public TestRunCreateForAutomationHost createTestRunCreateForAutomationHost() {
        return new TestRunCreateForAutomationHost();
    }

    /**
     * Create an instance of {@link IncidentCreate }
     * 
     */
    public IncidentCreate createIncidentCreate() {
        return new IncidentCreate();
    }

    /**
     * Create an instance of {@link IncidentRetrieve }
     * 
     */
    public IncidentRetrieve createIncidentRetrieve() {
        return new IncidentRetrieve();
    }

    /**
     * Create an instance of {@link TestRunRetrieveById }
     * 
     */
    public TestRunRetrieveById createTestRunRetrieveById() {
        return new TestRunRetrieveById();
    }

    /**
     * Create an instance of {@link ConnectionConnectToProject }
     * 
     */
    public ConnectionConnectToProject createConnectionConnectToProject() {
        return new ConnectionConnectToProject();
    }

    /**
     * Create an instance of {@link ReleaseRetrieve2 }
     * 
     */
    public ReleaseRetrieve2 createReleaseRetrieve2() {
        return new ReleaseRetrieve2();
    }

    /**
     * Create an instance of {@link BuildRetrieveByReleaseId }
     * 
     */
    public BuildRetrieveByReleaseId createBuildRetrieveByReleaseId() {
        return new BuildRetrieveByReleaseId();
    }

    /**
     * Create an instance of {@link ReleaseRetrieveResponse }
     * 
     */
    public ReleaseRetrieveResponse createReleaseRetrieveResponse() {
        return new ReleaseRetrieveResponse();
    }

    /**
     * Create an instance of {@link TestRunRetrieveManualByIdResponse }
     * 
     */
    public TestRunRetrieveManualByIdResponse createTestRunRetrieveManualByIdResponse() {
        return new TestRunRetrieveManualByIdResponse();
    }

    /**
     * Create an instance of {@link RemoteSort }
     * 
     */
    public RemoteSort createRemoteSort() {
        return new RemoteSort();
    }

    /**
     * Create an instance of {@link ConnectionAuthenticate2 }
     * 
     */
    public ConnectionAuthenticate2 createConnectionAuthenticate2() {
        return new ConnectionAuthenticate2();
    }

    /**
     * Create an instance of {@link TestRunSave }
     * 
     */
    public TestRunSave createTestRunSave() {
        return new TestRunSave();
    }

    /**
     * Create an instance of {@link SystemGetSettingsResponse }
     * 
     */
    public SystemGetSettingsResponse createSystemGetSettingsResponse() {
        return new SystemGetSettingsResponse();
    }

    /**
     * Create an instance of {@link ProjectRetrieveByIdResponse }
     * 
     */
    public ProjectRetrieveByIdResponse createProjectRetrieveByIdResponse() {
        return new ProjectRetrieveByIdResponse();
    }

    /**
     * Create an instance of {@link IncidentRetrieveResponse }
     * 
     */
    public IncidentRetrieveResponse createIncidentRetrieveResponse() {
        return new IncidentRetrieveResponse();
    }

    /**
     * Create an instance of {@link SystemGetArtifactUrl }
     * 
     */
    public SystemGetArtifactUrl createSystemGetArtifactUrl() {
        return new SystemGetArtifactUrl();
    }

    /**
     * Create an instance of {@link RemoteRelease }
     * 
     */
    public RemoteRelease createRemoteRelease() {
        return new RemoteRelease();
    }

    /**
     * Create an instance of {@link RemoteArtifact }
     * 
     */
    public RemoteArtifact createRemoteArtifact() {
        return new RemoteArtifact();
    }

    /**
     * Create an instance of {@link TestRunRecordAutomated3Response }
     * 
     */
    public TestRunRecordAutomated3Response createTestRunRecordAutomated3Response() {
        return new TestRunRecordAutomated3Response();
    }

    /**
     * Create an instance of {@link IncidentRetrieveById }
     * 
     */
    public IncidentRetrieveById createIncidentRetrieveById() {
        return new IncidentRetrieveById();
    }

    /**
     * Create an instance of {@link ArrayOfRemoteTestRun }
     * 
     */
    public ArrayOfRemoteTestRun createArrayOfRemoteTestRun() {
        return new ArrayOfRemoteTestRun();
    }

    /**
     * Create an instance of {@link SystemGetArtifactUrlResponse }
     * 
     */
    public SystemGetArtifactUrlResponse createSystemGetArtifactUrlResponse() {
        return new SystemGetArtifactUrlResponse();
    }

    /**
     * Create an instance of {@link RemoteTestRunStep }
     * 
     */
    public RemoteTestRunStep createRemoteTestRunStep() {
        return new RemoteTestRunStep();
    }

    /**
     * Create an instance of {@link SystemGetProductNameResponse }
     * 
     */
    public SystemGetProductNameResponse createSystemGetProductNameResponse() {
        return new SystemGetProductNameResponse();
    }

    /**
     * Create an instance of {@link IncidentCreateResponse }
     * 
     */
    public IncidentCreateResponse createIncidentCreateResponse() {
        return new IncidentCreateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteFilter")
    public JAXBElement<RemoteFilter> createRemoteFilter(RemoteFilter value) {
        return new JAXBElement<RemoteFilter>(_RemoteFilter_QNAME, RemoteFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteIncident")
    public JAXBElement<ArrayOfRemoteIncident> createArrayOfRemoteIncident(ArrayOfRemoteIncident value) {
        return new JAXBElement<ArrayOfRemoteIncident>(_ArrayOfRemoteIncident_QNAME, ArrayOfRemoteIncident.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteSetting")
    public JAXBElement<RemoteSetting> createRemoteSetting(RemoteSetting value) {
        return new JAXBElement<RemoteSetting>(_RemoteSetting_QNAME, RemoteSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteRelease }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteRelease")
    public JAXBElement<RemoteRelease> createRemoteRelease(RemoteRelease value) {
        return new JAXBElement<RemoteRelease>(_RemoteRelease_QNAME, RemoteRelease.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "DateRange")
    public JAXBElement<DateRange> createDateRange(DateRange value) {
        return new JAXBElement<DateRange>(_DateRange_QNAME, DateRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestSetTestCaseParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteTestSetTestCaseParameter")
    public JAXBElement<ArrayOfRemoteTestSetTestCaseParameter> createArrayOfRemoteTestSetTestCaseParameter(ArrayOfRemoteTestSetTestCaseParameter value) {
        return new JAXBElement<ArrayOfRemoteTestSetTestCaseParameter>(_ArrayOfRemoteTestSetTestCaseParameter_QNAME, ArrayOfRemoteTestSetTestCaseParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteBuild")
    public JAXBElement<RemoteBuild> createRemoteBuild(RemoteBuild value) {
        return new JAXBElement<RemoteBuild>(_RemoteBuild_QNAME, RemoteBuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteTestRun")
    public JAXBElement<ArrayOfRemoteTestRun> createArrayOfRemoteTestRun(ArrayOfRemoteTestRun value) {
        return new JAXBElement<ArrayOfRemoteTestRun>(_ArrayOfRemoteTestRun_QNAME, ArrayOfRemoteTestRun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteBuildSourceCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteBuildSourceCode")
    public JAXBElement<RemoteBuildSourceCode> createRemoteBuildSourceCode(RemoteBuildSourceCode value) {
        return new JAXBElement<RemoteBuildSourceCode>(_RemoteBuildSourceCode_QNAME, RemoteBuildSourceCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiValueFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "MultiValueFilter")
    public JAXBElement<MultiValueFilter> createMultiValueFilter(MultiValueFilter value) {
        return new JAXBElement<MultiValueFilter>(_MultiValueFilter_QNAME, MultiValueFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteTestRunStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteTestRunStep")
    public JAXBElement<RemoteTestRunStep> createRemoteTestRunStep(RemoteTestRunStep value) {
        return new JAXBElement<RemoteTestRunStep>(_RemoteTestRunStep_QNAME, RemoteTestRunStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", name = "ServiceFaultMessage")
    public JAXBElement<ServiceFaultMessage> createServiceFaultMessage(ServiceFaultMessage value) {
        return new JAXBElement<ServiceFaultMessage>(_ServiceFaultMessage_QNAME, ServiceFaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteBuildSourceCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteBuildSourceCode")
    public JAXBElement<ArrayOfRemoteBuildSourceCode> createArrayOfRemoteBuildSourceCode(ArrayOfRemoteBuildSourceCode value) {
        return new JAXBElement<ArrayOfRemoteBuildSourceCode>(_ArrayOfRemoteBuildSourceCode_QNAME, ArrayOfRemoteBuildSourceCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteProject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteProject")
    public JAXBElement<RemoteProject> createRemoteProject(RemoteProject value) {
        return new JAXBElement<RemoteProject>(_RemoteProject_QNAME, RemoteProject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteArtifact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteArtifact")
    public JAXBElement<RemoteArtifact> createRemoteArtifact(RemoteArtifact value) {
        return new JAXBElement<RemoteArtifact>(_RemoteArtifact_QNAME, RemoteArtifact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteSetting")
    public JAXBElement<ArrayOfRemoteSetting> createArrayOfRemoteSetting(ArrayOfRemoteSetting value) {
        return new JAXBElement<ArrayOfRemoteSetting>(_ArrayOfRemoteSetting_QNAME, ArrayOfRemoteSetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteTestRun")
    public JAXBElement<RemoteTestRun> createRemoteTestRun(RemoteTestRun value) {
        return new JAXBElement<RemoteTestRun>(_RemoteTestRun_QNAME, RemoteTestRun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteManualTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteManualTestRun")
    public JAXBElement<RemoteManualTestRun> createRemoteManualTestRun(RemoteManualTestRun value) {
        return new JAXBElement<RemoteManualTestRun>(_RemoteManualTestRun_QNAME, RemoteManualTestRun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteTestSetTestCaseParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteTestSetTestCaseParameter")
    public JAXBElement<RemoteTestSetTestCaseParameter> createRemoteTestSetTestCaseParameter(RemoteTestSetTestCaseParameter value) {
        return new JAXBElement<RemoteTestSetTestCaseParameter>(_RemoteTestSetTestCaseParameter_QNAME, RemoteTestSetTestCaseParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteSort")
    public JAXBElement<RemoteSort> createRemoteSort(RemoteSort value) {
        return new JAXBElement<RemoteSort>(_RemoteSort_QNAME, RemoteSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteFilter")
    public JAXBElement<ArrayOfRemoteFilter> createArrayOfRemoteFilter(ArrayOfRemoteFilter value) {
        return new JAXBElement<ArrayOfRemoteFilter>(_ArrayOfRemoteFilter_QNAME, ArrayOfRemoteFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteManualTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteManualTestRun")
    public JAXBElement<ArrayOfRemoteManualTestRun> createArrayOfRemoteManualTestRun(ArrayOfRemoteManualTestRun value) {
        return new JAXBElement<ArrayOfRemoteManualTestRun>(_ArrayOfRemoteManualTestRun_QNAME, ArrayOfRemoteManualTestRun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteRelease }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteRelease")
    public JAXBElement<ArrayOfRemoteRelease> createArrayOfRemoteRelease(ArrayOfRemoteRelease value) {
        return new JAXBElement<ArrayOfRemoteRelease>(_ArrayOfRemoteRelease_QNAME, ArrayOfRemoteRelease.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteIncident")
    public JAXBElement<RemoteIncident> createRemoteIncident(RemoteIncident value) {
        return new JAXBElement<RemoteIncident>(_RemoteIncident_QNAME, RemoteIncident.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestRunStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteTestRunStep")
    public JAXBElement<ArrayOfRemoteTestRunStep> createArrayOfRemoteTestRunStep(ArrayOfRemoteTestRunStep value) {
        return new JAXBElement<ArrayOfRemoteTestRunStep>(_ArrayOfRemoteTestRunStep_QNAME, ArrayOfRemoteTestRunStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteBuild")
    public JAXBElement<ArrayOfRemoteBuild> createArrayOfRemoteBuild(ArrayOfRemoteBuild value) {
        return new JAXBElement<ArrayOfRemoteBuild>(_ArrayOfRemoteBuild_QNAME, ArrayOfRemoteBuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteAutomatedTestRun")
    public JAXBElement<RemoteAutomatedTestRun> createRemoteAutomatedTestRun(RemoteAutomatedTestRun value) {
        return new JAXBElement<RemoteAutomatedTestRun>(_RemoteAutomatedTestRun_QNAME, RemoteAutomatedTestRun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemoteVersion")
    public JAXBElement<RemoteVersion> createRemoteVersion(RemoteVersion value) {
        return new JAXBElement<RemoteVersion>(_RemoteVersion_QNAME, RemoteVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteProject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteProject")
    public JAXBElement<ArrayOfRemoteProject> createArrayOfRemoteProject(ArrayOfRemoteProject value) {
        return new JAXBElement<ArrayOfRemoteProject>(_ArrayOfRemoteProject_QNAME, ArrayOfRemoteProject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ArrayOfRemoteAutomatedTestRun")
    public JAXBElement<ArrayOfRemoteAutomatedTestRun> createArrayOfRemoteAutomatedTestRun(ArrayOfRemoteAutomatedTestRun value) {
        return new JAXBElement<ArrayOfRemoteAutomatedTestRun>(_ArrayOfRemoteAutomatedTestRun_QNAME, ArrayOfRemoteAutomatedTestRun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteProject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Project_RetrieveResult", scope = ProjectRetrieveResponse.class)
    public JAXBElement<ArrayOfRemoteProject> createProjectRetrieveResponseProjectRetrieveResult(ArrayOfRemoteProject value) {
        return new JAXBElement<ArrayOfRemoteProject>(_ProjectRetrieveResponseProjectRetrieveResult_QNAME, ArrayOfRemoteProject.class, ProjectRetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestRunStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestRunSteps", scope = RemoteManualTestRun.class)
    public JAXBElement<ArrayOfRemoteTestRunStep> createRemoteManualTestRunTestRunSteps(ArrayOfRemoteTestRunStep value) {
        return new JAXBElement<ArrayOfRemoteTestRunStep>(_RemoteManualTestRunTestRunSteps_QNAME, ArrayOfRemoteTestRunStep.class, RemoteManualTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_RetrieveResult", scope = TestRunRetrieveResponse.class)
    public JAXBElement<ArrayOfRemoteTestRun> createTestRunRetrieveResponseTestRunRetrieveResult(ArrayOfRemoteTestRun value) {
        return new JAXBElement<ArrayOfRemoteTestRun>(_TestRunRetrieveResponseTestRunRetrieveResult_QNAME, ArrayOfRemoteTestRun.class, TestRunRetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Patch", scope = RemoteVersion.class)
    public JAXBElement<Integer> createRemoteVersionPatch(Integer value) {
        return new JAXBElement<Integer>(_RemoteVersionPatch_QNAME, Integer.class, RemoteVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Version", scope = RemoteVersion.class)
    public JAXBElement<String> createRemoteVersionVersion(String value) {
        return new JAXBElement<String>(_RemoteVersionVersion_QNAME, String.class, RemoteVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Values", scope = MultiValueFilter.class)
    public JAXBElement<ArrayOfint> createMultiValueFilterValues(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_MultiValueFilterValues_QNAME, ArrayOfint.class, MultiValueFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Incident_RetrieveByIdResult", scope = IncidentRetrieveByIdResponse.class)
    public JAXBElement<RemoteIncident> createIncidentRetrieveByIdResponseIncidentRetrieveByIdResult(RemoteIncident value) {
        return new JAXBElement<RemoteIncident>(_IncidentRetrieveByIdResponseIncidentRetrieveByIdResult_QNAME, RemoteIncident.class, IncidentRetrieveByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteRelease }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Release_Retrieve2Result", scope = ReleaseRetrieve2Response.class)
    public JAXBElement<ArrayOfRemoteRelease> createReleaseRetrieve2ResponseReleaseRetrieve2Result(ArrayOfRemoteRelease value) {
        return new JAXBElement<ArrayOfRemoteRelease>(_ReleaseRetrieve2ResponseReleaseRetrieve2Result_QNAME, ArrayOfRemoteRelease.class, ReleaseRetrieve2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "testCaseIds", scope = TestRunCreateFromTestCases.class)
    public JAXBElement<ArrayOfint> createTestRunCreateFromTestCasesTestCaseIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_TestRunCreateFromTestCasesTestCaseIds_QNAME, ArrayOfint.class, TestRunCreateFromTestCases.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "releaseId", scope = TestRunCreateFromTestCases.class)
    public JAXBElement<Integer> createTestRunCreateFromTestCasesReleaseId(Integer value) {
        return new JAXBElement<Integer>(_TestRunCreateFromTestCasesReleaseId_QNAME, Integer.class, TestRunCreateFromTestCases.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_RecordAutomated1Result", scope = TestRunRecordAutomated1Response.class)
    public JAXBElement<RemoteAutomatedTestRun> createTestRunRecordAutomated1ResponseTestRunRecordAutomated1Result(RemoteAutomatedTestRun value) {
        return new JAXBElement<RemoteAutomatedTestRun>(_TestRunRecordAutomated1ResponseTestRunRecordAutomated1Result_QNAME, RemoteAutomatedTestRun.class, TestRunRecordAutomated1Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "DateRangeValue", scope = RemoteFilter.class)
    public JAXBElement<DateRange> createRemoteFilterDateRangeValue(DateRange value) {
        return new JAXBElement<DateRange>(_RemoteFilterDateRangeValue_QNAME, DateRange.class, RemoteFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IntValue", scope = RemoteFilter.class)
    public JAXBElement<Integer> createRemoteFilterIntValue(Integer value) {
        return new JAXBElement<Integer>(_RemoteFilterIntValue_QNAME, Integer.class, RemoteFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiValueFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "MultiValue", scope = RemoteFilter.class)
    public JAXBElement<MultiValueFilter> createRemoteFilterMultiValue(MultiValueFilter value) {
        return new JAXBElement<MultiValueFilter>(_RemoteFilterMultiValue_QNAME, MultiValueFilter.class, RemoteFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "StringValue", scope = RemoteFilter.class)
    public JAXBElement<String> createRemoteFilterStringValue(String value) {
        return new JAXBElement<String>(_RemoteFilterStringValue_QNAME, String.class, RemoteFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "PropertyName", scope = RemoteFilter.class)
    public JAXBElement<String> createRemoteFilterPropertyName(String value) {
        return new JAXBElement<String>(_RemoteFilterPropertyName_QNAME, String.class, RemoteFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "System_GetWebServerUrlResult", scope = SystemGetWebServerUrlResponse.class)
    public JAXBElement<String> createSystemGetWebServerUrlResponseSystemGetWebServerUrlResult(String value) {
        return new JAXBElement<String>(_SystemGetWebServerUrlResponseSystemGetWebServerUrlResult_QNAME, String.class, SystemGetWebServerUrlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteTestRuns", scope = TestRunRecordAutomated3 .class)
    public JAXBElement<ArrayOfRemoteAutomatedTestRun> createTestRunRecordAutomated3RemoteTestRuns(ArrayOfRemoteAutomatedTestRun value) {
        return new JAXBElement<ArrayOfRemoteAutomatedTestRun>(_TestRunRecordAutomated3RemoteTestRuns_QNAME, ArrayOfRemoteAutomatedTestRun.class, TestRunRecordAutomated3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RunnerName", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<String> createRemoteAutomatedTestRunRunnerName(String value) {
        return new JAXBElement<String>(_RemoteAutomatedTestRunRunnerName_QNAME, String.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "AutomationEngineId", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<Integer> createRemoteAutomatedTestRunAutomationEngineId(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunAutomationEngineId_QNAME, Integer.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteTestSetTestCaseParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Parameters", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<ArrayOfRemoteTestSetTestCaseParameter> createRemoteAutomatedTestRunParameters(ArrayOfRemoteTestSetTestCaseParameter value) {
        return new JAXBElement<ArrayOfRemoteTestSetTestCaseParameter>(_RemoteAutomatedTestRunParameters_QNAME, ArrayOfRemoteTestSetTestCaseParameter.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RunnerStackTrace", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<String> createRemoteAutomatedTestRunRunnerStackTrace(String value) {
        return new JAXBElement<String>(_RemoteAutomatedTestRunRunnerStackTrace_QNAME, String.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "AutomationEngineToken", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<String> createRemoteAutomatedTestRunAutomationEngineToken(String value) {
        return new JAXBElement<String>(_RemoteAutomatedTestRunAutomationEngineToken_QNAME, String.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ScheduledDate", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<XMLGregorianCalendar> createRemoteAutomatedTestRunScheduledDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteAutomatedTestRunScheduledDate_QNAME, XMLGregorianCalendar.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "AutomationHostId", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<Integer> createRemoteAutomatedTestRunAutomationHostId(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunAutomationHostId_QNAME, Integer.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RunnerTestName", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<String> createRemoteAutomatedTestRunRunnerTestName(String value) {
        return new JAXBElement<String>(_RemoteAutomatedTestRunRunnerTestName_QNAME, String.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "AutomationAttachmentId", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<Integer> createRemoteAutomatedTestRunAutomationAttachmentId(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunAutomationAttachmentId_QNAME, Integer.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RunnerMessage", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<String> createRemoteAutomatedTestRunRunnerMessage(String value) {
        return new JAXBElement<String>(_RemoteAutomatedTestRunRunnerMessage_QNAME, String.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RunnerAssertCount", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<Integer> createRemoteAutomatedTestRunRunnerAssertCount(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunRunnerAssertCount_QNAME, Integer.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ProjectId", scope = RemoteAutomatedTestRun.class)
    public JAXBElement<Integer> createRemoteAutomatedTestRunProjectId(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunProjectId_QNAME, Integer.class, RemoteAutomatedTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteTestRun", scope = TestRunRecordAutomated1 .class)
    public JAXBElement<RemoteAutomatedTestRun> createTestRunRecordAutomated1RemoteTestRun(RemoteAutomatedTestRun value) {
        return new JAXBElement<RemoteAutomatedTestRun>(_TestRunRecordAutomated1RemoteTestRun_QNAME, RemoteAutomatedTestRun.class, TestRunRecordAutomated1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Value", scope = RemoteSetting.class)
    public JAXBElement<String> createRemoteSettingValue(String value) {
        return new JAXBElement<String>(_RemoteSettingValue_QNAME, String.class, RemoteSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Name", scope = RemoteSetting.class)
    public JAXBElement<String> createRemoteSettingName(String value) {
        return new JAXBElement<String>(_RemoteSettingName_QNAME, String.class, RemoteSetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "EndDate", scope = RemoteTestRun.class)
    public JAXBElement<XMLGregorianCalendar> createRemoteTestRunEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteTestRunEndDate_QNAME, XMLGregorianCalendar.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestSetTestCaseId", scope = RemoteTestRun.class)
    public JAXBElement<Integer> createRemoteTestRunTestSetTestCaseId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunTestSetTestCaseId_QNAME, Integer.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestSetId", scope = RemoteTestRun.class)
    public JAXBElement<Integer> createRemoteTestRunTestSetId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunTestSetId_QNAME, Integer.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Name", scope = RemoteTestRun.class)
    public JAXBElement<String> createRemoteTestRunName(String value) {
        return new JAXBElement<String>(_RemoteSettingName_QNAME, String.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ReleaseId", scope = RemoteTestRun.class)
    public JAXBElement<Integer> createRemoteTestRunReleaseId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunReleaseId_QNAME, Integer.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "BuildId", scope = RemoteTestRun.class)
    public JAXBElement<Integer> createRemoteTestRunBuildId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunBuildId_QNAME, Integer.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestRunId", scope = RemoteTestRun.class)
    public JAXBElement<Integer> createRemoteTestRunTestRunId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunTestRunId_QNAME, Integer.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TesterId", scope = RemoteTestRun.class)
    public JAXBElement<Integer> createRemoteTestRunTesterId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunTesterId_QNAME, Integer.class, RemoteTestRun.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "userName", scope = ConnectionAuthenticate.class)
    public JAXBElement<String> createConnectionAuthenticateUserName(String value) {
        return new JAXBElement<String>(_ConnectionAuthenticateUserName_QNAME, String.class, ConnectionAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "password", scope = ConnectionAuthenticate.class)
    public JAXBElement<String> createConnectionAuthenticatePassword(String value) {
        return new JAXBElement<String>(_ConnectionAuthenticatePassword_QNAME, String.class, ConnectionAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_RetrieveByIdResult", scope = TestRunRetrieveByIdResponse.class)
    public JAXBElement<RemoteTestRun> createTestRunRetrieveByIdResponseTestRunRetrieveByIdResult(RemoteTestRun value) {
        return new JAXBElement<RemoteTestRun>(_TestRunRetrieveByIdResponseTestRunRetrieveByIdResult_QNAME, RemoteTestRun.class, TestRunRetrieveByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_CreateForAutomatedTestSetResult", scope = TestRunCreateForAutomatedTestSetResponse.class)
    public JAXBElement<ArrayOfRemoteAutomatedTestRun> createTestRunCreateForAutomatedTestSetResponseTestRunCreateForAutomatedTestSetResult(ArrayOfRemoteAutomatedTestRun value) {
        return new JAXBElement<ArrayOfRemoteAutomatedTestRun>(_TestRunCreateForAutomatedTestSetResponseTestRunCreateForAutomatedTestSetResult_QNAME, ArrayOfRemoteAutomatedTestRun.class, TestRunCreateForAutomatedTestSetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_CreateForAutomationHostResult", scope = TestRunCreateForAutomationHostResponse.class)
    public JAXBElement<ArrayOfRemoteAutomatedTestRun> createTestRunCreateForAutomationHostResponseTestRunCreateForAutomationHostResult(ArrayOfRemoteAutomatedTestRun value) {
        return new JAXBElement<ArrayOfRemoteAutomatedTestRun>(_TestRunCreateForAutomationHostResponseTestRunCreateForAutomationHostResult_QNAME, ArrayOfRemoteAutomatedTestRun.class, TestRunCreateForAutomationHostResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_RetrieveAutomatedByIdResult", scope = TestRunRetrieveAutomatedByIdResponse.class)
    public JAXBElement<RemoteAutomatedTestRun> createTestRunRetrieveAutomatedByIdResponseTestRunRetrieveAutomatedByIdResult(RemoteAutomatedTestRun value) {
        return new JAXBElement<RemoteAutomatedTestRun>(_TestRunRetrieveAutomatedByIdResponseTestRunRetrieveAutomatedByIdResult_QNAME, RemoteAutomatedTestRun.class, TestRunRetrieveAutomatedByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IncidentId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentIncidentId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentIncidentId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IncidentTypeId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentIncidentTypeId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentIncidentTypeId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Name", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentName(String value) {
        return new JAXBElement<String>(_RemoteSettingName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "PriorityId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentPriorityId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentPriorityId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "OpenerId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentOpenerId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentOpenerId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "SeverityId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentSeverityId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentSeverityId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "VerifiedReleaseVersionNumber", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentVerifiedReleaseVersionNumber(String value) {
        return new JAXBElement<String>(_RemoteIncidentVerifiedReleaseVersionNumber_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ActualEffort", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentActualEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentActualEffort_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ProjectId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentProjectId(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunProjectId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RemainingEffort", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentRemainingEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentRemainingEffort_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Description", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentDescription(String value) {
        return new JAXBElement<String>(_RemoteIncidentDescription_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ProjectName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentProjectName(String value) {
        return new JAXBElement<String>(_RemoteIncidentProjectName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "DetectedReleaseVersionNumber", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentDetectedReleaseVersionNumber(String value) {
        return new JAXBElement<String>(_RemoteIncidentDetectedReleaseVersionNumber_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "PriorityName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentPriorityName(String value) {
        return new JAXBElement<String>(_RemoteIncidentPriorityName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ClosedDate", scope = RemoteIncident.class)
    public JAXBElement<XMLGregorianCalendar> createRemoteIncidentClosedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteIncidentClosedDate_QNAME, XMLGregorianCalendar.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "CreationDate", scope = RemoteIncident.class)
    public JAXBElement<XMLGregorianCalendar> createRemoteIncidentCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteIncidentCreationDate_QNAME, XMLGregorianCalendar.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ProjectedEffort", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentProjectedEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentProjectedEffort_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IncidentStatusName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentIncidentStatusName(String value) {
        return new JAXBElement<String>(_RemoteIncidentIncidentStatusName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "VerifiedReleaseId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentVerifiedReleaseId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentVerifiedReleaseId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "StartDate", scope = RemoteIncident.class)
    public JAXBElement<XMLGregorianCalendar> createRemoteIncidentStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteIncidentStartDate_QNAME, XMLGregorianCalendar.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IncidentTypeName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentIncidentTypeName(String value) {
        return new JAXBElement<String>(_RemoteIncidentIncidentTypeName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "FixedBuildName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentFixedBuildName(String value) {
        return new JAXBElement<String>(_RemoteIncidentFixedBuildName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "FixedBuildId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentFixedBuildId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentFixedBuildId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "SeverityName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentSeverityName(String value) {
        return new JAXBElement<String>(_RemoteIncidentSeverityName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "DetectedReleaseId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentDetectedReleaseId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentDetectedReleaseId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "EstimatedEffort", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentEstimatedEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentEstimatedEffort_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "OwnerName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentOwnerName(String value) {
        return new JAXBElement<String>(_RemoteIncidentOwnerName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ResolvedReleaseId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentResolvedReleaseId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentResolvedReleaseId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestRunStepId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentTestRunStepId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentTestRunStepId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "OwnerId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentOwnerId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentOwnerId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IncidentStatusOpenStatus", scope = RemoteIncident.class)
    public JAXBElement<Boolean> createRemoteIncidentIncidentStatusOpenStatus(Boolean value) {
        return new JAXBElement<Boolean>(_RemoteIncidentIncidentStatusOpenStatus_QNAME, Boolean.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IncidentStatusId", scope = RemoteIncident.class)
    public JAXBElement<Integer> createRemoteIncidentIncidentStatusId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentIncidentStatusId_QNAME, Integer.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ResolvedReleaseVersionNumber", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentResolvedReleaseVersionNumber(String value) {
        return new JAXBElement<String>(_RemoteIncidentResolvedReleaseVersionNumber_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "OpenerName", scope = RemoteIncident.class)
    public JAXBElement<String> createRemoteIncidentOpenerName(String value) {
        return new JAXBElement<String>(_RemoteIncidentOpenerName_QNAME, String.class, RemoteIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "System_GetProductVersionResult", scope = SystemGetProductVersionResponse.class)
    public JAXBElement<RemoteVersion> createSystemGetProductVersionResponseSystemGetProductVersionResult(RemoteVersion value) {
        return new JAXBElement<RemoteVersion>(_SystemGetProductVersionResponseSystemGetProductVersionResult_QNAME, RemoteVersion.class, SystemGetProductVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", name = "Message", scope = ServiceFaultMessage.class)
    public JAXBElement<String> createServiceFaultMessageMessage(String value) {
        return new JAXBElement<String>(_ServiceFaultMessageMessage_QNAME, String.class, ServiceFaultMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", name = "Type", scope = ServiceFaultMessage.class)
    public JAXBElement<String> createServiceFaultMessageType(String value) {
        return new JAXBElement<String>(_ServiceFaultMessageType_QNAME, String.class, ServiceFaultMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0", name = "StackTrace", scope = ServiceFaultMessage.class)
    public JAXBElement<String> createServiceFaultMessageStackTrace(String value) {
        return new JAXBElement<String>(_ServiceFaultMessageStackTrace_QNAME, String.class, ServiceFaultMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteManualTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_CreateFromTestCasesResult", scope = TestRunCreateFromTestCasesResponse.class)
    public JAXBElement<ArrayOfRemoteManualTestRun> createTestRunCreateFromTestCasesResponseTestRunCreateFromTestCasesResult(ArrayOfRemoteManualTestRun value) {
        return new JAXBElement<ArrayOfRemoteManualTestRun>(_TestRunCreateFromTestCasesResponseTestRunCreateFromTestCasesResult_QNAME, ArrayOfRemoteManualTestRun.class, TestRunCreateFromTestCasesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "RevisionKey", scope = RemoteBuildSourceCode.class)
    public JAXBElement<String> createRemoteBuildSourceCodeRevisionKey(String value) {
        return new JAXBElement<String>(_RemoteBuildSourceCodeRevisionKey_QNAME, String.class, RemoteBuildSourceCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "CreationDate", scope = RemoteBuildSourceCode.class)
    public JAXBElement<XMLGregorianCalendar> createRemoteBuildSourceCodeCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteIncidentCreationDate_QNAME, XMLGregorianCalendar.class, RemoteBuildSourceCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "automationHostToken", scope = TestRunCreateForAutomatedTestSet.class)
    public JAXBElement<String> createTestRunCreateForAutomatedTestSetAutomationHostToken(String value) {
        return new JAXBElement<String>(_TestRunCreateForAutomatedTestSetAutomationHostToken_QNAME, String.class, TestRunCreateForAutomatedTestSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "EndDate", scope = DateRange.class)
    public JAXBElement<XMLGregorianCalendar> createDateRangeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteTestRunEndDate_QNAME, XMLGregorianCalendar.class, DateRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "StartDate", scope = DateRange.class)
    public JAXBElement<XMLGregorianCalendar> createDateRangeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteIncidentStartDate_QNAME, XMLGregorianCalendar.class, DateRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Build_RetrieveByIdResult", scope = BuildRetrieveByIdResponse.class)
    public JAXBElement<RemoteBuild> createBuildRetrieveByIdResponseBuildRetrieveByIdResult(RemoteBuild value) {
        return new JAXBElement<RemoteBuild>(_BuildRetrieveByIdResponseBuildRetrieveByIdResult_QNAME, RemoteBuild.class, BuildRetrieveByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteIncident", scope = IncidentUpdate.class)
    public JAXBElement<RemoteIncident> createIncidentUpdateRemoteIncident(RemoteIncident value) {
        return new JAXBElement<RemoteIncident>(_IncidentUpdateRemoteIncident_QNAME, RemoteIncident.class, IncidentUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteManualTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_SaveResult", scope = TestRunSaveResponse.class)
    public JAXBElement<ArrayOfRemoteManualTestRun> createTestRunSaveResponseTestRunSaveResult(ArrayOfRemoteManualTestRun value) {
        return new JAXBElement<ArrayOfRemoteManualTestRun>(_TestRunSaveResponseTestRunSaveResult_QNAME, ArrayOfRemoteManualTestRun.class, TestRunSaveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteBuild", scope = BuildCreate.class)
    public JAXBElement<RemoteBuild> createBuildCreateRemoteBuild(RemoteBuild value) {
        return new JAXBElement<RemoteBuild>(_BuildCreateRemoteBuild_QNAME, RemoteBuild.class, BuildCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "runnerTestName", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<String> createTestRunRecordAutomated2RunnerTestName(String value) {
        return new JAXBElement<String>(_TestRunRecordAutomated2RunnerTestName_QNAME, String.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "runnerStackTrace", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<String> createTestRunRecordAutomated2RunnerStackTrace(String value) {
        return new JAXBElement<String>(_TestRunRecordAutomated2RunnerStackTrace_QNAME, String.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "testSetTestCaseId", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<Integer> createTestRunRecordAutomated2TestSetTestCaseId(Integer value) {
        return new JAXBElement<Integer>(_TestRunRecordAutomated2TestSetTestCaseId_QNAME, Integer.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "userName", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<String> createTestRunRecordAutomated2UserName(String value) {
        return new JAXBElement<String>(_ConnectionAuthenticateUserName_QNAME, String.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "runnerName", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<String> createTestRunRecordAutomated2RunnerName(String value) {
        return new JAXBElement<String>(_TestRunRecordAutomated2RunnerName_QNAME, String.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "password", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<String> createTestRunRecordAutomated2Password(String value) {
        return new JAXBElement<String>(_ConnectionAuthenticatePassword_QNAME, String.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "testSetId", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<Integer> createTestRunRecordAutomated2TestSetId(Integer value) {
        return new JAXBElement<Integer>(_TestRunRecordAutomated2TestSetId_QNAME, Integer.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "runnerMessage", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<String> createTestRunRecordAutomated2RunnerMessage(String value) {
        return new JAXBElement<String>(_TestRunRecordAutomated2RunnerMessage_QNAME, String.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "releaseId", scope = TestRunRecordAutomated2 .class)
    public JAXBElement<Integer> createTestRunRecordAutomated2ReleaseId(Integer value) {
        return new JAXBElement<Integer>(_TestRunCreateFromTestCasesReleaseId_QNAME, Integer.class, TestRunRecordAutomated2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Build_CreateResult", scope = BuildCreateResponse.class)
    public JAXBElement<RemoteBuild> createBuildCreateResponseBuildCreateResult(RemoteBuild value) {
        return new JAXBElement<RemoteBuild>(_BuildCreateResponseBuildCreateResult_QNAME, RemoteBuild.class, BuildCreateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteBuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Build_RetrieveByReleaseIdResult", scope = BuildRetrieveByReleaseIdResponse.class)
    public JAXBElement<ArrayOfRemoteBuild> createBuildRetrieveByReleaseIdResponseBuildRetrieveByReleaseIdResult(ArrayOfRemoteBuild value) {
        return new JAXBElement<ArrayOfRemoteBuild>(_BuildRetrieveByReleaseIdResponseBuildRetrieveByReleaseIdResult_QNAME, ArrayOfRemoteBuild.class, BuildRetrieveByReleaseIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "automationHostToken", scope = TestRunCreateForAutomationHost.class)
    public JAXBElement<String> createTestRunCreateForAutomationHostAutomationHostToken(String value) {
        return new JAXBElement<String>(_TestRunCreateForAutomatedTestSetAutomationHostToken_QNAME, String.class, TestRunCreateForAutomationHost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "dateRange", scope = TestRunCreateForAutomationHost.class)
    public JAXBElement<DateRange> createTestRunCreateForAutomationHostDateRange(DateRange value) {
        return new JAXBElement<DateRange>(_TestRunCreateForAutomationHostDateRange_QNAME, DateRange.class, TestRunCreateForAutomationHost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Description", scope = RemoteBuild.class)
    public JAXBElement<String> createRemoteBuildDescription(String value) {
        return new JAXBElement<String>(_RemoteIncidentDescription_QNAME, String.class, RemoteBuild.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Name", scope = RemoteBuild.class)
    public JAXBElement<String> createRemoteBuildName(String value) {
        return new JAXBElement<String>(_RemoteSettingName_QNAME, String.class, RemoteBuild.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "CreationDate", scope = RemoteBuild.class)
    public JAXBElement<XMLGregorianCalendar> createRemoteBuildCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RemoteIncidentCreationDate_QNAME, XMLGregorianCalendar.class, RemoteBuild.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "BuildId", scope = RemoteBuild.class)
    public JAXBElement<Integer> createRemoteBuildBuildId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunBuildId_QNAME, Integer.class, RemoteBuild.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "BuildStatusName", scope = RemoteBuild.class)
    public JAXBElement<String> createRemoteBuildBuildStatusName(String value) {
        return new JAXBElement<String>(_RemoteBuildBuildStatusName_QNAME, String.class, RemoteBuild.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteBuildSourceCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Revisions", scope = RemoteBuild.class)
    public JAXBElement<ArrayOfRemoteBuildSourceCode> createRemoteBuildRevisions(ArrayOfRemoteBuildSourceCode value) {
        return new JAXBElement<ArrayOfRemoteBuildSourceCode>(_RemoteBuildRevisions_QNAME, ArrayOfRemoteBuildSourceCode.class, RemoteBuild.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteIncident", scope = IncidentCreate.class)
    public JAXBElement<RemoteIncident> createIncidentCreateRemoteIncident(RemoteIncident value) {
        return new JAXBElement<RemoteIncident>(_IncidentUpdateRemoteIncident_QNAME, RemoteIncident.class, IncidentCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteFilters", scope = IncidentRetrieve.class)
    public JAXBElement<ArrayOfRemoteFilter> createIncidentRetrieveRemoteFilters(ArrayOfRemoteFilter value) {
        return new JAXBElement<ArrayOfRemoteFilter>(_IncidentRetrieveRemoteFilters_QNAME, ArrayOfRemoteFilter.class, IncidentRetrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteSort", scope = IncidentRetrieve.class)
    public JAXBElement<RemoteSort> createIncidentRetrieveRemoteSort(RemoteSort value) {
        return new JAXBElement<RemoteSort>(_IncidentRetrieveRemoteSort_QNAME, RemoteSort.class, IncidentRetrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteManualTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_CreateFromTestSetResult", scope = TestRunCreateFromTestSetResponse.class)
    public JAXBElement<ArrayOfRemoteManualTestRun> createTestRunCreateFromTestSetResponseTestRunCreateFromTestSetResult(ArrayOfRemoteManualTestRun value) {
        return new JAXBElement<ArrayOfRemoteManualTestRun>(_TestRunCreateFromTestSetResponseTestRunCreateFromTestSetResult_QNAME, ArrayOfRemoteManualTestRun.class, TestRunCreateFromTestSetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteFilters", scope = ReleaseRetrieve2 .class)
    public JAXBElement<ArrayOfRemoteFilter> createReleaseRetrieve2RemoteFilters(ArrayOfRemoteFilter value) {
        return new JAXBElement<ArrayOfRemoteFilter>(_IncidentRetrieveRemoteFilters_QNAME, ArrayOfRemoteFilter.class, ReleaseRetrieve2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteFilters", scope = BuildRetrieveByReleaseId.class)
    public JAXBElement<ArrayOfRemoteFilter> createBuildRetrieveByReleaseIdRemoteFilters(ArrayOfRemoteFilter value) {
        return new JAXBElement<ArrayOfRemoteFilter>(_IncidentRetrieveRemoteFilters_QNAME, ArrayOfRemoteFilter.class, BuildRetrieveByReleaseId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteSort", scope = BuildRetrieveByReleaseId.class)
    public JAXBElement<RemoteSort> createBuildRetrieveByReleaseIdRemoteSort(RemoteSort value) {
        return new JAXBElement<RemoteSort>(_IncidentRetrieveRemoteSort_QNAME, RemoteSort.class, BuildRetrieveByReleaseId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteRelease }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Release_RetrieveResult", scope = ReleaseRetrieveResponse.class)
    public JAXBElement<ArrayOfRemoteRelease> createReleaseRetrieveResponseReleaseRetrieveResult(ArrayOfRemoteRelease value) {
        return new JAXBElement<ArrayOfRemoteRelease>(_ReleaseRetrieveResponseReleaseRetrieveResult_QNAME, ArrayOfRemoteRelease.class, ReleaseRetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteManualTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_RetrieveManualByIdResult", scope = TestRunRetrieveManualByIdResponse.class)
    public JAXBElement<RemoteManualTestRun> createTestRunRetrieveManualByIdResponseTestRunRetrieveManualByIdResult(RemoteManualTestRun value) {
        return new JAXBElement<RemoteManualTestRun>(_TestRunRetrieveManualByIdResponseTestRunRetrieveManualByIdResult_QNAME, RemoteManualTestRun.class, TestRunRetrieveManualByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "PropertyName", scope = RemoteSort.class)
    public JAXBElement<String> createRemoteSortPropertyName(String value) {
        return new JAXBElement<String>(_RemoteFilterPropertyName_QNAME, String.class, RemoteSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "userName", scope = ConnectionAuthenticate2 .class)
    public JAXBElement<String> createConnectionAuthenticate2UserName(String value) {
        return new JAXBElement<String>(_ConnectionAuthenticateUserName_QNAME, String.class, ConnectionAuthenticate2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "password", scope = ConnectionAuthenticate2 .class)
    public JAXBElement<String> createConnectionAuthenticate2Password(String value) {
        return new JAXBElement<String>(_ConnectionAuthenticatePassword_QNAME, String.class, ConnectionAuthenticate2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "plugInName", scope = ConnectionAuthenticate2 .class)
    public JAXBElement<String> createConnectionAuthenticate2PlugInName(String value) {
        return new JAXBElement<String>(_ConnectionAuthenticate2PlugInName_QNAME, String.class, ConnectionAuthenticate2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteManualTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteTestRuns", scope = TestRunSave.class)
    public JAXBElement<ArrayOfRemoteManualTestRun> createTestRunSaveRemoteTestRuns(ArrayOfRemoteManualTestRun value) {
        return new JAXBElement<ArrayOfRemoteManualTestRun>(_TestRunRecordAutomated3RemoteTestRuns_QNAME, ArrayOfRemoteManualTestRun.class, TestRunSave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteSetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "System_GetSettingsResult", scope = SystemGetSettingsResponse.class)
    public JAXBElement<ArrayOfRemoteSetting> createSystemGetSettingsResponseSystemGetSettingsResult(ArrayOfRemoteSetting value) {
        return new JAXBElement<ArrayOfRemoteSetting>(_SystemGetSettingsResponseSystemGetSettingsResult_QNAME, ArrayOfRemoteSetting.class, SystemGetSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteProject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Project_RetrieveByIdResult", scope = ProjectRetrieveByIdResponse.class)
    public JAXBElement<RemoteProject> createProjectRetrieveByIdResponseProjectRetrieveByIdResult(RemoteProject value) {
        return new JAXBElement<RemoteProject>(_ProjectRetrieveByIdResponseProjectRetrieveByIdResult_QNAME, RemoteProject.class, ProjectRetrieveByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Incident_RetrieveResult", scope = IncidentRetrieveResponse.class)
    public JAXBElement<ArrayOfRemoteIncident> createIncidentRetrieveResponseIncidentRetrieveResult(ArrayOfRemoteIncident value) {
        return new JAXBElement<ArrayOfRemoteIncident>(_IncidentRetrieveResponseIncidentRetrieveResult_QNAME, ArrayOfRemoteIncident.class, IncidentRetrieveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "tabName", scope = SystemGetArtifactUrl.class)
    public JAXBElement<String> createSystemGetArtifactUrlTabName(String value) {
        return new JAXBElement<String>(_SystemGetArtifactUrlTabName_QNAME, String.class, SystemGetArtifactUrl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TaskEstimatedEffort", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleaseTaskEstimatedEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteReleaseTaskEstimatedEffort_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Name", scope = RemoteRelease.class)
    public JAXBElement<String> createRemoteReleaseName(String value) {
        return new JAXBElement<String>(_RemoteSettingName_QNAME, String.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "FullName", scope = RemoteRelease.class)
    public JAXBElement<String> createRemoteReleaseFullName(String value) {
        return new JAXBElement<String>(_RemoteReleaseFullName_QNAME, String.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "IndentLevel", scope = RemoteRelease.class)
    public JAXBElement<String> createRemoteReleaseIndentLevel(String value) {
        return new JAXBElement<String>(_RemoteReleaseIndentLevel_QNAME, String.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "CreatorId", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleaseCreatorId(Integer value) {
        return new JAXBElement<Integer>(_RemoteReleaseCreatorId_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "CreatorName", scope = RemoteRelease.class)
    public JAXBElement<String> createRemoteReleaseCreatorName(String value) {
        return new JAXBElement<String>(_RemoteReleaseCreatorName_QNAME, String.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "VersionNumber", scope = RemoteRelease.class)
    public JAXBElement<String> createRemoteReleaseVersionNumber(String value) {
        return new JAXBElement<String>(_RemoteReleaseVersionNumber_QNAME, String.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ReleaseId", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleaseReleaseId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunReleaseId_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ProjectId", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleaseProjectId(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunProjectId_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TaskCount", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleaseTaskCount(Integer value) {
        return new JAXBElement<Integer>(_RemoteReleaseTaskCount_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Description", scope = RemoteRelease.class)
    public JAXBElement<String> createRemoteReleaseDescription(String value) {
        return new JAXBElement<String>(_RemoteIncidentDescription_QNAME, String.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "AvailableEffort", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleaseAvailableEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteReleaseAvailableEffort_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TaskActualEffort", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleaseTaskActualEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteReleaseTaskActualEffort_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "PlannedEffort", scope = RemoteRelease.class)
    public JAXBElement<Integer> createRemoteReleasePlannedEffort(Integer value) {
        return new JAXBElement<Integer>(_RemoteReleasePlannedEffort_QNAME, Integer.class, RemoteRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text05", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText05(String value) {
        return new JAXBElement<String>(_RemoteArtifactText05_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text06", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText06(String value) {
        return new JAXBElement<String>(_RemoteArtifactText06_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text03", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText03(String value) {
        return new JAXBElement<String>(_RemoteArtifactText03_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text04", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText04(String value) {
        return new JAXBElement<String>(_RemoteArtifactText04_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text09", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText09(String value) {
        return new JAXBElement<String>(_RemoteArtifactText09_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text07", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText07(String value) {
        return new JAXBElement<String>(_RemoteArtifactText07_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text08", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText08(String value) {
        return new JAXBElement<String>(_RemoteArtifactText08_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List04", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList04(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList04_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List05", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList05(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList05_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List02", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList02(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList02_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List03", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList03(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList03_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List08", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList08(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList08_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List09", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList09(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList09_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List06", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList06(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList06_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List07", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList07(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList07_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List01", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList01(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList01_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "List10", scope = RemoteArtifact.class)
    public JAXBElement<Integer> createRemoteArtifactList10(Integer value) {
        return new JAXBElement<Integer>(_RemoteArtifactList10_QNAME, Integer.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text02", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText02(String value) {
        return new JAXBElement<String>(_RemoteArtifactText02_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text10", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText10(String value) {
        return new JAXBElement<String>(_RemoteArtifactText10_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Text01", scope = RemoteArtifact.class)
    public JAXBElement<String> createRemoteArtifactText01(String value) {
        return new JAXBElement<String>(_RemoteArtifactText01_QNAME, String.class, RemoteArtifact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "TestRun_RecordAutomated3Result", scope = TestRunRecordAutomated3Response.class)
    public JAXBElement<ArrayOfRemoteAutomatedTestRun> createTestRunRecordAutomated3ResponseTestRunRecordAutomated3Result(ArrayOfRemoteAutomatedTestRun value) {
        return new JAXBElement<ArrayOfRemoteAutomatedTestRun>(_TestRunRecordAutomated3ResponseTestRunRecordAutomated3Result_QNAME, ArrayOfRemoteAutomatedTestRun.class, TestRunRecordAutomated3Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRemoteFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteFilters", scope = TestRunRetrieve.class)
    public JAXBElement<ArrayOfRemoteFilter> createTestRunRetrieveRemoteFilters(ArrayOfRemoteFilter value) {
        return new JAXBElement<ArrayOfRemoteFilter>(_IncidentRetrieveRemoteFilters_QNAME, ArrayOfRemoteFilter.class, TestRunRetrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "remoteSort", scope = TestRunRetrieve.class)
    public JAXBElement<RemoteSort> createTestRunRetrieveRemoteSort(RemoteSort value) {
        return new JAXBElement<RemoteSort>(_IncidentRetrieveRemoteSort_QNAME, RemoteSort.class, TestRunRetrieve.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "System_GetArtifactUrlResult", scope = SystemGetArtifactUrlResponse.class)
    public JAXBElement<String> createSystemGetArtifactUrlResponseSystemGetArtifactUrlResult(String value) {
        return new JAXBElement<String>(_SystemGetArtifactUrlResponseSystemGetArtifactUrlResult_QNAME, String.class, SystemGetArtifactUrlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Value", scope = RemoteTestSetTestCaseParameter.class)
    public JAXBElement<String> createRemoteTestSetTestCaseParameterValue(String value) {
        return new JAXBElement<String>(_RemoteSettingValue_QNAME, String.class, RemoteTestSetTestCaseParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Name", scope = RemoteTestSetTestCaseParameter.class)
    public JAXBElement<String> createRemoteTestSetTestCaseParameterName(String value) {
        return new JAXBElement<String>(_RemoteSettingName_QNAME, String.class, RemoteTestSetTestCaseParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Description", scope = RemoteTestRunStep.class)
    public JAXBElement<String> createRemoteTestRunStepDescription(String value) {
        return new JAXBElement<String>(_RemoteIncidentDescription_QNAME, String.class, RemoteTestRunStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestRunStepId", scope = RemoteTestRunStep.class)
    public JAXBElement<Integer> createRemoteTestRunStepTestRunStepId(Integer value) {
        return new JAXBElement<Integer>(_RemoteIncidentTestRunStepId_QNAME, Integer.class, RemoteTestRunStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestStepId", scope = RemoteTestRunStep.class)
    public JAXBElement<Integer> createRemoteTestRunStepTestStepId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunStepTestStepId_QNAME, Integer.class, RemoteTestRunStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "TestCaseId", scope = RemoteTestRunStep.class)
    public JAXBElement<Integer> createRemoteTestRunStepTestCaseId(Integer value) {
        return new JAXBElement<Integer>(_RemoteTestRunStepTestCaseId_QNAME, Integer.class, RemoteTestRunStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ExpectedResult", scope = RemoteTestRunStep.class)
    public JAXBElement<String> createRemoteTestRunStepExpectedResult(String value) {
        return new JAXBElement<String>(_RemoteTestRunStepExpectedResult_QNAME, String.class, RemoteTestRunStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ActualResult", scope = RemoteTestRunStep.class)
    public JAXBElement<String> createRemoteTestRunStepActualResult(String value) {
        return new JAXBElement<String>(_RemoteTestRunStepActualResult_QNAME, String.class, RemoteTestRunStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "SampleData", scope = RemoteTestRunStep.class)
    public JAXBElement<String> createRemoteTestRunStepSampleData(String value) {
        return new JAXBElement<String>(_RemoteTestRunStepSampleData_QNAME, String.class, RemoteTestRunStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Description", scope = RemoteProject.class)
    public JAXBElement<String> createRemoteProjectDescription(String value) {
        return new JAXBElement<String>(_RemoteIncidentDescription_QNAME, String.class, RemoteProject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Name", scope = RemoteProject.class)
    public JAXBElement<String> createRemoteProjectName(String value) {
        return new JAXBElement<String>(_RemoteSettingName_QNAME, String.class, RemoteProject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "Website", scope = RemoteProject.class)
    public JAXBElement<String> createRemoteProjectWebsite(String value) {
        return new JAXBElement<String>(_RemoteProjectWebsite_QNAME, String.class, RemoteProject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects", name = "ProjectId", scope = RemoteProject.class)
    public JAXBElement<Integer> createRemoteProjectProjectId(Integer value) {
        return new JAXBElement<Integer>(_RemoteAutomatedTestRunProjectId_QNAME, Integer.class, RemoteProject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "System_GetProductNameResult", scope = SystemGetProductNameResponse.class)
    public JAXBElement<String> createSystemGetProductNameResponseSystemGetProductNameResult(String value) {
        return new JAXBElement<String>(_SystemGetProductNameResponseSystemGetProductNameResult_QNAME, String.class, SystemGetProductNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.inflectra.com/SpiraTest/Services/v3.0/", name = "Incident_CreateResult", scope = IncidentCreateResponse.class)
    public JAXBElement<RemoteIncident> createIncidentCreateResponseIncidentCreateResult(RemoteIncident value) {
        return new JAXBElement<RemoteIncident>(_IncidentCreateResponseIncidentCreateResult_QNAME, RemoteIncident.class, IncidentCreateResponse.class, value);
    }

}
