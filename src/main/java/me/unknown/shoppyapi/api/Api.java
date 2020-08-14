package me.unknown.shoppyapi.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.unknown.shoppyapi.http.HttpClient;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class Api {
    private final Gson gson = new GsonBuilder().create();
    private final HttpClient httpClient;
    private final String label;

    public Api(String label, HttpClient httpClient) {
        this.httpClient = httpClient;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public Gson getGson() {
        return gson;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }
}
