package com.inflectra.spiratest.plugins;

import com.google.gson.*;
import hudson.util.Secret;

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
 * @version 4.0.2
 */
public class SpiraImportExport {

    /**
     * The URL appended to the base URL to access REST. Note that it ends with a slash
     */
    private static final String REST_SERVICE_URL = "/Services/v6_0/RestService.svc/";
    private static final String REST_SERVICE_URL_v7 = "/Services/v7_0/RestService.svc/";

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
     * Performs an HTTP POST request to the specified URL with authentication via headers.
     *
     * @param input    The URL to perform the query on
     * @param body     The request body to be sent
     * @param username The Spira username for authentication
     * @param apiKey   The Spira API key for authentication
     * @return A string containing the JSON returned from the POST request
     * @throws IOException
     */
    public static String httpPost(String input, String body, String username, String apiKey) throws IOException {
        URL url = new URL(input);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        connection.setRequestProperty("accept", "application/json; charset=utf-8");
        connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        connection.setRequestProperty("username", username);
        connection.setRequestProperty("api-key", apiKey);

        OutputStream os = connection.getOutputStream();
        os.write(body.getBytes(StandardCharsets.UTF_8));
        os.flush();
        os.close();

        int responseCode = connection.getResponseCode();

        String httpResponse = "";

        if (100 <= responseCode && responseCode <= 399) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            httpResponse = response.toString();
        }
        return httpResponse;
    }

    /**
     * Performs an HTTP PUT request to the specified URL with authentication via headers.
     *
     * @param input    The URL to perform the query on
     * @param body     The request body to be sent
     * @param username The Spira username for authentication
     * @param apiKey   The Spira API key for authentication
     * @return The HTTP response code returned from the PUT request
     * @throws IOException
     */
    public static int httpPut(String input, String body, String username, String apiKey) throws IOException {
        URL url = new URL(input);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("PUT");
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        http.setRequestProperty("username", username);
        http.setRequestProperty("api-key", apiKey);

        byte[] out = body.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);

        int httpCode = http.getResponseCode();
        http.disconnect();
        return httpCode;
    }


    /**
     * Performs an HTTP GET request to the specified URL with authentication via headers.
     *
     * @param input    The URL to perform the query on
     * @param username The Spira username for authentication
     * @param apiKey   The Spira API key for authentication
     * @return A string containing the JSON returned from the GET request
     * @throws IOException
     */
    public static String httpGet(String input, String username, String apiKey) throws IOException {
        URL url = new URL(input);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("accept", "application/json; charset=utf-8");
        connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        connection.setRequestProperty("username", username);
        connection.setRequestProperty("api-key", apiKey);

        int responseCode = connection.getResponseCode();
        String httpResponse = "";

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            httpResponse = response.toString();
        }
        return httpResponse;
    }


    /**
     * Turn the date into the format readable by Spira
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
            String requestUrl = this.url + REST_SERVICE_URL + "projects";
            String httpResult = httpGet(requestUrl, this.userName, this.token.getPlainText());
            if (!httpResult.isEmpty()) {
                success = true;
            }
        } catch (Exception exception) {
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
        String requestUrl = this.url + REST_SERVICE_URL + "projects/" + this.projectId + "/releases";

        Integer releaseId = null;

        try {
            String httpResponse = httpGet(requestUrl, this.userName, this.token.getPlainText());
            JsonArray releasesArray = JsonParser.parseString(httpResponse).getAsJsonArray();

            for (JsonElement je : releasesArray) {
                JsonObject release = je.getAsJsonObject();
                String VersionNumber = release.getAsJsonObject().get("VersionNumber").getAsString();
                if (VersionNumber.equals(releaseVersionNumber)) {
                    releaseId = release.getAsJsonObject().get("ReleaseId").getAsInt();
                    break;
                }
            }

        } catch (Exception exception) {
            throw new Exception("Error getting the releases from SpiraTest server (" + exception.getMessage() + ")\n\n");
        }
        return releaseId;
    }

    /**
     * Returns the full spira artifact URL for an artifact
     *
     * @param prefix     The artifact prefix
     * @param artifactId The artifact id
     * @return The full URL to the artifact
     * @throws Exception
     */
    public String createArtifactUrl(String prefix, int artifactId) throws Exception {
        try {
            int artifactTypeId;
            artifactTypeId = SpiraImportExport.ArtifactType.getByPrefix(prefix).getArtifactId();

            String requestUrl = this.url + REST_SERVICE_URL + "system/artifact-types/" + artifactTypeId + "/project/"
                    + this.projectId + "/artifact/" + artifactId;

            String httpResponse = httpGet(requestUrl, this.userName, this.token.getPlainText());

            String relativeUrl = httpResponse;
            String absoluteUrl = relativeUrl.replaceFirst("~", this.url);
            return absoluteUrl;
        } catch (Exception exception) {
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
     * @return The build ID
     * @throws Exception
     */
    public int recordBuild(String releaseVersionNumber, Date creationDate, int buildStatusId, String name, String description, List<String> revisions, List<Integer> incidents) throws Exception {
        try {

            String associatedRevisions = "";

            if (revisions != null && !revisions.isEmpty()) {
                for (String revisionKey : revisions) {
                    associatedRevisions += "{\"RevisionKey\": \"" + revisionKey + "\"},";
                }
            }

            // Get the release id for the specific version number
            String requestUrl = this.url + REST_SERVICE_URL + "projects/" + this.projectId + "/releases";
            Integer releaseId = null;

            String httpResponse = httpGet(requestUrl, this.userName, this.token.getPlainText());
            JsonArray releasesArray = JsonParser.parseString(httpResponse).getAsJsonArray();

            for (JsonElement je : releasesArray) {
                JsonObject release = je.getAsJsonObject();
                String VersionNumber = release.getAsJsonObject().get("VersionNumber").getAsString();
                if (VersionNumber.equals(releaseVersionNumber)) {
                    releaseId = release.getAsJsonObject().get("ReleaseId").getAsInt();
                    break;
                }
            }
            if (releaseId == null) {
                throw new Exception("Unable to locate a release with version number '" + releaseVersionNumber + "' in project PR" + this.projectId);
            }

            // Record the new build
            requestUrl = this.url + REST_SERVICE_URL + "projects/" + this.projectId + "/releases/" + releaseId + "/builds";

            Gson gson = new Gson();

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

            try {
                httpResponse = httpPost(requestUrl, body, this.userName, this.token.getPlainText());
                JsonObject jsonObject = JsonParser.parseString(httpResponse).getAsJsonObject();
                buildId = jsonObject.get("BuildId").getAsInt();

                // Update the 'FixedBuildId' for any incidents listed in the commit messages
                if (incidents != null && !incidents.isEmpty() && buildId != 0) {

                    for (Integer incidentId : incidents) {
                        try {
                            String incidentUrl = this.url + REST_SERVICE_URL_v7 + "projects/" + this.projectId + "/incidents/" + incidentId + "/fixed/" + buildId;

                            int httpResponseCode = httpPut(incidentUrl, jsonObject.toString(), this.userName, this.token.getPlainText());
                            if (httpResponseCode != 200) {
                                // Ignore — not all customers have the V7 API available
                            }

                        } catch (Exception exception) {
                            throw new Exception("Error getting/updating incident IN" + incidentId + " from SpiraTest server (" + exception.getMessage() + ")\n\n");
                        }
                    }
                }
            } catch (Exception exception) {
                throw new Exception("Error sending results to SpiraTest server (" + exception.getMessage() + ")");
            }
            return buildId;
        } catch (Exception exception) {
            throw new Exception("Error creating record Build (" + exception.getMessage() + ")\n\n");
        }
    }

    public static String convertDatetoUtc(Date date) {
        if (date == null) {
            return null;
        } else {
            final String API_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
            final SimpleDateFormat sdf = new SimpleDateFormat(API_DATE_FORMAT);
            final TimeZone utc = TimeZone.getTimeZone("UTC");
            sdf.setTimeZone(utc);
            return sdf.format(date);
        }
    }

    /**
     * Removes any invalid XML control characters from a string
     */
    public String cleanText(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");
    }

    /**
     * Escapes strings for safe inclusion in JSON values
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
