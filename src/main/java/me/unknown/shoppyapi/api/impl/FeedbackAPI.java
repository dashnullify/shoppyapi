package me.unknown.shoppyapi.api.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import me.unknown.shoppyapi.api.Api;
import me.unknown.shoppyapi.http.HttpClient;
import me.unknown.shoppyapi.objects.Feedback;

import java.util.ArrayList;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class FeedbackAPI extends Api {
    private final String BASE = "feedback/";

    public FeedbackAPI(HttpClient httpClient) {
        super("Feedback", httpClient);
    }

    public Feedback get(String id) throws Exception {
        return getGson().fromJson(getHttpClient().parse(BASE + id), Feedback.class);
    }

    public ArrayList<Feedback> getAllFeedbacks() throws Exception {
        ArrayList<Feedback> feedbacks = new ArrayList<>();
        JsonArray jsonArray = getHttpClient().parse(BASE).getAsJsonArray();
        for(JsonElement object : jsonArray) {
            feedbacks.add(getGson().fromJson(object, Feedback.class));
        }

        return feedbacks;
    }
}
