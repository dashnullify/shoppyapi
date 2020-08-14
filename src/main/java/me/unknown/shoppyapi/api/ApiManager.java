package me.unknown.shoppyapi.api;

import me.unknown.shoppyapi.http.HttpClient;
import me.unknown.shoppyapi.api.impl.FeedbackAPI;
import me.unknown.shoppyapi.api.impl.OrderAPI;
import me.unknown.shoppyapi.api.impl.ProductAPI;
import me.unknown.shoppyapi.api.impl.QueryAPI;

import java.util.LinkedList;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class ApiManager {
    private final LinkedList<Api> apis = new LinkedList<>();

    public ApiManager(HttpClient httpClient) {
        apis.add(new FeedbackAPI(httpClient));
        apis.add(new OrderAPI(httpClient));
        apis.add(new ProductAPI(httpClient));
        apis.add(new QueryAPI(httpClient));
    }

    public Api getApi(String label) {
        for(Api api : getApis())
            if(api.getLabel().equalsIgnoreCase(label))
                return api;

        return null;
    }

    public LinkedList<Api> getApis() {
        return apis;
    }
}
