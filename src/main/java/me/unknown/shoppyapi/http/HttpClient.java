package me.unknown.shoppyapi.http;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class HttpClient {
    private final String BASE_URL = "https://shoppy.gg/api/v1/";
    private final String key;

    public HttpClient(String key) {
        this.key = key;
    }

    public void delete(String parms) throws Exception {
        final URL url = new URL(BASE_URL + parms);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded" );
        connection.setRequestProperty("Authorization", key);
        connection.addRequestProperty("Content-type", "application/json");
        connection.addRequestProperty("Accept", "application/json");
        connection.connect();
    }

    public void put(String parms, String options) throws Exception {
        final URL url = new URL(BASE_URL + parms);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Authorization", key);
        connection.addRequestProperty("Content-type", "application/json");
        connection.addRequestProperty("Accept", "application/json");
        final OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
        out.write(options);
        out.close();
    }

    public String post(String parms, String options) throws Exception {
        final URL obj = new URL(BASE_URL + parms);
        final HttpsURLConnection connection = (HttpsURLConnection) obj.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", key);
        connection.addRequestProperty("Content-type", "application/json");
        connection.addRequestProperty("Accept", "application/json");
        final DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.writeUTF(options);
        wr.flush();
        wr.close();

        final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        final StringBuilder result = new StringBuilder();
        String line = in.readLine();
        while (line != null) {
            result.append(line);
            line = in.readLine();
        }

        return result.toString();
    }

    public JsonElement parse(String parms) throws Exception {
        final URL url = new URL(BASE_URL + parms);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", key);
        connection.addRequestProperty("Content-type", "application/json");
        connection.addRequestProperty("Accept", "application/json");

        final BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        final StringBuilder result = new StringBuilder();
        String line = rd.readLine();
        while (line != null) {
            result.append(line);
            line = rd.readLine();
        }

        return new JsonParser().parse(result.toString());

    }

}
