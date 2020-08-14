package me.unknown.shoppyapi.api.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import me.unknown.shoppyapi.api.Api;
import me.unknown.shoppyapi.http.HttpClient;
import me.unknown.shoppyapi.objects.Query;
import me.unknown.shoppyapi.objects.QueryMessage;

import java.util.ArrayList;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class QueryAPI extends Api {
    private final String BASE = "queries/";

    public QueryAPI(HttpClient httpClient) {
        super("Query", httpClient);
    }

    public Query get(String id) throws Exception {
        return getGson().fromJson(getHttpClient().parse(BASE + id), Query.class);
    }

    public void replay(Query query, QueryMessage message) throws Exception {
        getHttpClient().post(BASE + query.getId() + "/replay", getGson().toJson(message));
    }

    public ArrayList<Query> getAllQueries() throws Exception {
        ArrayList<Query> products = new ArrayList<>();
        JsonArray jsonArray = getHttpClient().parse(BASE).getAsJsonArray();
        for(JsonElement object : jsonArray) {
            products.add(getGson().fromJson(object, Query.class));
        }

        return products;
    }

}
