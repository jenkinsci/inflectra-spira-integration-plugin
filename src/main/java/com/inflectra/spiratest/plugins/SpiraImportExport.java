package com.inflectra.spiratest.plugins;

import com.google.gson.*;
import hudson.util.Secret;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * This defines the 'SpiraImportExport' class that provides the Java facade for
 * calling the REST web service exposed by SpiraTest
 *
 * @author Inflectra Corporation
 * @version 4.0.0
 */
public class SpiraImportExport {

    /**
     * The URL appended to the base URL to access REST. Note that it ends with a slash
     */
    private static final String REST_SERVICE_URL = "/Services/v6_0/RestService.svc/";
    private static final String REST_SERVICE_URL_v7 = "/Services/v7_0/RestService.svc/";
    private static final String WEB_SERVICE_NAMESPACE_DATA_OBJECTS = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v3_0.DataObjects";

    private String url;
    private String userName;
    private Secret token;
    private int projectId;

    //Artifact type enums
    public enum ArtifactType {
        REQUIREMENT("RQ", 1),
        TESTCASE("TC", 2),
        INCIDENT("IN", 3),
        RELEASE("RL", 4),
        TESTRUN("TR", 5),
        TASK("TK", 6),
        TESTSTEP("TS", 7),
        TESTSET("TX", 8),
        HOST("AH", 9);

        private final String prefix;
        private final int artifactId;
        private static Map<String, SpiraImportExport.ArtifactType> map = new HashMap<String, SpiraImportExport.ArtifactType>();

        private ArtifactType(String prefix, int artifactId) {
            this.prefix = prefix;
            this.artifactId = artifactId;
        }

        public String getPrefix() {
            return this.prefix;
        }

        public int getArtifactId() {
            return this.artifactId;
        }

        static {
            for (SpiraImportExport.ArtifactType a : SpiraImportExport.ArtifactType.values())
                map.put(a.getPrefix(), a);
        }

        public static SpiraImportExport.ArtifactType getByPrefix(String prefix) {
            return map.get(prefix);
        }

    }

    public SpiraImportExport() {
    }

    public SpiraImportExport(String url, String userName, Secret token, int projectId) {
        this.url = url;
        this.userName = userName;
        this.token = token;
        this.projectId = projectId;
    }

    /**
     * Performs an HTTP POST request ot the specified URL
     *
     * @param input The URL to perform the query on
     * @param body  The request body to be sent
     * @return A string containing the JSON returned from the POST request
     * @throws IOException
     */
    public static String httpPost(String input, String body) throws IOException {
        URL url = new URL(input);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //allow sending a request body
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        //have the connection send and retrieve JSON
        connection.setRequestProperty("accept", "application/json; charset=utf-8");
        connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        OutputStream os = connection.getOutputStream();
        os.write(body.getBytes());
        os.flush();
        os.close();

        int responseCode = connection.getResponseCode();

        String httpResponse = "";

        //getting the response
        if (100 <= responseCode && responseCode <= 399) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            httpResponse = response.toString();
        }
        return httpResponse;
    }

    /**
     * Performs an HTTP PUT request ot the specified URL
     *
     * @param input The URL to perform the query on
     * @param body  The request body to be sent
     * @return The HTML code returned from the PUT request
     * @throws IOException
     */
    public static int httpPut(String input, String body) throws IOException {

        URL url = new URL(input);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("PUT");
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/json");

        String data = body;

        byte[] out = data.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);

        int httpCode = http.getResponseCode();
        http.disconnect();
        return httpCode;
    }


    /**
     * Performs an HTTP GET request ot the specified URL
     *
     * @param input The URL to perform the query on
     * @return A string containing the JSON returned from the GET request
     * @throws IOException
     */
    public static String httpGet(String input) throws IOException {
        URL url = new URL(input);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //allow sending a request body
        connection.setRequestMethod("GET");
        //have the connection send and retrieve JSON
        connection.setRequestProperty("accept", "application/json; charset=utf-8");
        connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");

        int responseCode = connection.getResponseCode();
        String httpResponse = "";

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            httpResponse = response.toString();

        }
        return httpResponse;
    }


    /**
     * ** NOT USED - DISABLED IN 3.2.7 **
     * Records a test run
     *
     * @param testCaseId        The test case being executed
     * @param releaseId         The release being executed against (optional)
     * @param testSetId         The test set being executed against (optional)
     * @param executionStatusId The status of the test run (pass/fail/not run)
     * @param runnerName        The name of the automated testing tool
     * @param runnerTestName    The name of the test as stored in JUnit
     * @param runnerAssertCount The number of assertions
     * @param runnerMessage     The failure message (if appropriate)
     * @param runnerStackTrace  The error stack trace (if any)
     * @param endDate           When the test run ended
     * @param startDate         When the test run started
     * @return ID of the new test run
     */
   /* public int recordTestRun(int testCaseId, Integer releaseId, Integer testSetId, Date startDate,
                             Date endDate, int executionStatusId, String runnerName, String runnerTestName, int runnerAssertCount,
                             String runnerMessage, String runnerStackTrace) {
        String url = this.url + REST_SERVICE_URL + "projects/" + this.projectId + "/test-runs/record?username=" + this.userName + "&api-key=" + this.token.getPlainText();

        Gson gson = new Gson();


        //create the body of the request
        String body = "{\"TestRunFormatId\": 1, \"RunnerName\": \"" + runnerName;
        body += "\", \"RunnerTestName\": \"" + runnerTestName + "\",";
        body += "\"RunnerStackTrace\": " + gson.toJson(runnerStackTrace) + ",";
        body += "\"StartDate\": \"" + formatDate(startDate) + "\", " + "\"EndDate\": \"" + formatDate(endDate) + "\",";
        body += "\"ExecutionStatusId\": " + executionStatusId + ",\"RunnerAssertCount\": " + runnerAssertCount;
        body += ",\"RunnerMessage\": \"" + runnerMessage + "\",";
        body += "\"TestCaseId\": " + testCaseId;

        if (releaseId != null) {
            body += ", \"ReleaseId\": " + releaseId;
        }
        if (testSetId != null) {
            body += ", \"TestSetId\": " + testSetId;
        }

        body += "}";

        String httpResponse;
        int testRunId = 0;

        //send the request
        try {
            httpResponse = httpPost(url, body);
            JsonObject jsonObject = JsonParser.parseString(httpResponse).getAsJsonObject();
            testRunId = jsonObject.get("TestRunId").getAsInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testRunId;
    }*/

    /**
     * Turn the date into the format readable by Spira
     *
     * @param d
     * @return
     */
    private static String formatDate(Date d) {
        return "/Date(" + d.getTime() + "-0000)/";
    }

    /**
     * Tests the SpiraTeam connection
     *
     * @return true or false, depending on the result
     */
    public boolean testConnection() throws Exception {
        boolean success = false;
        try {
            //try to send data to the server
            String url = this.url + REST_SERVICE_URL + "projects?username=" + this.userName + "&api-key=" + this.token.getPlainText();
            String httpResult = httpGet(url);
            if (!httpResult.isEmpty()) {
                success = true;
            }
        } catch (Exception exception) {
            //Display the error
            throw new Exception("Error connecting to Spira server (" + exception.getMessage() + ")\n\n");
        }
        return success;
    }

    /**
     * Verifies that the release exists in the project
     *
     * @param releaseVersionNumber
     * @return The id of the release or null
     */
    public Integer verifyRelease(String releaseVersionNumber) throws Exception {
        String url = this.url + REST_SERVICE_URL + "projects/" + this.projectId + "/releases?username=" + this.userName + "&api-key=" + this.token.getPlainText();

        Gson gson = new Gson();

        String httpResponse;

        Integer releaseId = null;

        //send the request
        try {
            //Get all the active releases
            httpResponse = httpGet(url);
            JsonArray releasesArray = JsonParser.parseString(httpResponse).getAsJsonArray();

            //iterate through the results
            for (JsonElement je : releasesArray) {
                JsonObject release = je.getAsJsonObject();
                String VersionNumber = release.getAsJsonObject().get("VersionNumber").getAsString();
                //Need to make sure we have an exact match
                if (VersionNumber.equals(releaseVersionNumber)) {
                    releaseId = release.getAsJsonObject().get("ReleaseId").getAsInt();
                    break;
                }
            }

        } catch (Exception exception) {
            //Display the error
            throw new Exception("Error getting the releases from SpiraTest server (" + exception.getMessage() + ")\n\n");
        }
        return releaseId;
    }

    /**
     * Returns the full spira artifact URL for an artifact
     *
     * @param prefix     The artifact prefix
     * @param artifactId The artifact id
     * @return
     * @throws Exception
     */
    public String createArtifactUrl(String prefix, int artifactId) throws Exception {
        try {
            //Get the navigation link for the prefix
            int artifactTypeId;
            artifactTypeId = SpiraImportExport.ArtifactType.getByPrefix(prefix).getArtifactId();

            //Get the artifact URL from the server
            String url = this.url + REST_SERVICE_URL + "system/artifact-types/" + artifactTypeId + "/project/"
                    + this.projectId + "/artifact/" + artifactId + "?username=" + this.userName + "&api-key=" + this.token.getPlainText();

            String httpResponse = httpGet(url);

            String relativeUrl = httpResponse;
            String absoluteUrl = relativeUrl.replaceFirst("~", this.url);
            return absoluteUrl;
        } catch (Exception exception) {
            //Display the error
            throw new Exception("Unable to create artifact URL: (" + exception.getMessage() + ")\n\n");
        }
    }

    /**
     * Creates a new build entry in SpiraTest
     *
     * @param releaseVersionNumber The current release
     * @param creationDate         The creation date
     * @param buildStatusId        The status of the build (1 = Fail, 2 = Succeed)
     * @param name                 The name of the build
     * @param description          The full build description
     * @param revisions            The list of revisions associated with the build
     * @param incidents            The list of incidents fixed in the build
     * @return
     * @throws Exception
     */
    public int recordBuild(String releaseVersionNumber, Date creationDate, int buildStatusId, String name, String description, List<String> revisions, List<Integer> incidents) throws Exception {
        try {

            String associatedRevisions = "";

            //See if we have any associated revisions
            if (revisions != null && !revisions.isEmpty()) {

                for (String revisionKey : revisions) {
                    associatedRevisions += "{\"RevisionKey\": \"" + revisionKey + "\"},";
                }
            }
            //Now get the release id for the specific version number
            //Get all the active releases
            String url = this.url + REST_SERVICE_URL + "projects/" + this.projectId + "/releases?username=" + this.userName + "&api-key=" + this.token.getPlainText();
            Integer releaseId = null;

            //Get all the active releases
            String httpResponse = httpGet(url);
            JsonArray releasesArray = JsonParser.parseString(httpResponse).getAsJsonArray();

            //iterate through the results
            for (JsonElement je : releasesArray) {
                JsonObject release = je.getAsJsonObject();
                String VersionNumber = release.getAsJsonObject().get("VersionNumber").getAsString();
                //Need to make sure we have an exact match
                if (VersionNumber.equals(releaseVersionNumber)) {
                    releaseId = release.getAsJsonObject().get("ReleaseId").getAsInt();
                    break;
                }
            }
            if (releaseId == null) {
                throw new Exception("Unable to locate a release with version number '" + releaseVersionNumber + "' in project PR" + this.projectId);
            }

            //Now record the new build

            url = this.url + REST_SERVICE_URL + "projects/" + this.projectId + "/releases/" + releaseId + "/builds?username=" + this.userName + "&api-key=" + this.token.getPlainText();

            Gson gson = new Gson();

            //create the body of the request
            String body = "{\"BuildStatusId\": \"" + buildStatusId;
            body += "\", \"ProjectId\": \"" + this.projectId + "\",";
            body += "\"ReleaseId\": " + releaseId + ",";
            body += "\"Name\": " + cleanApiText(cleanText(name)) + ",";
            body += "\"Description\": " + cleanApiText(cleanText(description)) + ",";
            body += "\"CreationDate\": \"" + convertDatetoUtc(creationDate) + "\"";

            if (!associatedRevisions.isEmpty()) {
                body += ", \"Revisions\": [" + associatedRevisions + "]";
            }
            body += "}";

            int buildId = 0;

            //send the request
            try {
                httpResponse = httpPost(url, body);
                JsonObject jsonObject = JsonParser.parseString(httpResponse).getAsJsonObject();
                buildId = jsonObject.get("BuildId").getAsInt();

                //Now we need to set the 'FixedBuildId' for any incidents listed in the commit messages
                
                if (incidents != null && !incidents.isEmpty() && buildId != 0) {

                    for (Integer incidentId : incidents) {
                        try {
                            //Update the Resolved Build field of the Incident
                            url = this.url + REST_SERVICE_URL_v7 + "projects/" + this.projectId + "/incidents/" + incidentId  + "/fixed/" +  buildId +"?username=" + this.userName + "&api-key=" + this.token.getPlainText();

                            int httpResponseCode = httpPut(url, jsonObject.toString());
                            if (httpResponseCode != 200) {
                                //Just ignore, as not all customers have the V7 API available
                            }

                        } catch (Exception exception) {
                            //Display the error
                            throw new Exception("Error getting/updating incindent IN" + incidentId + " from SpiraTest server (" + exception.getMessage() + ")\n\n");
                        }
                    }
                }
            } catch (Exception exception) {
                //Display the error
                throw new Exception("Error sending results to SpiraTest server (" + exception.getMessage() + ")");
            }
            return buildId;
        } catch (Exception exception) {
            //Display the error
            throw new Exception("Error creating record Build (" + exception.getMessage() + ")\n\n");
        }
    }

    /***
     * Creates a JAXB web service string element from a Java string
     * @param value
     * @return
     */
    public static JAXBElement<String> createJAXBString(String fieldName, String value) {
        JAXBElement<String> jaxString = new JAXBElement<String>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, fieldName), String.class, value);
        if (value == null) {
            jaxString.setNil(true);
        }
        return jaxString;
    }

    public static String convertDatetoUtc(Date date) {
        if (date == null) {
            return null;
        } else {
            final String API_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
            final SimpleDateFormat sdf = new SimpleDateFormat(API_DATE_FORMAT);
            final TimeZone utc = TimeZone.getTimeZone("UTC");
            sdf.setTimeZone(utc);
            String utcDate = sdf.format(date);
            return utcDate;
        }
    }

    /**
     * Removes any invalid XML contract characters from a string before being used in a SOAP call
     *
     * @param text
     * @return
     */
    public String cleanText(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");
    }

    /**
     * Removes any invalid characters of strings being sent through the API
     *
     * @param text
     * @return
     */
    public String cleanApiText(String text) {
        if (text == null) {
            return null;
        } else {
            String result = text.replaceAll("\\\\+", "\\\\\\\\").replaceAll("\"", "\\\\\"");
            if (!result.startsWith("\"")) {
                result = "\"" + result;
            }
            if (!result.endsWith("\"")) {
                result = result + "\"";
            }
            return result;
        }

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
        return token;
    }

    public void setPassword(Secret password) {

        this.token = password;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


}