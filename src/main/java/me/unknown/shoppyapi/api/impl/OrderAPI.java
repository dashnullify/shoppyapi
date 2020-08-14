package me.unknown.shoppyapi.api.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import me.unknown.shoppyapi.api.Api;
import me.unknown.shoppyapi.http.HttpClient;
import me.unknown.shoppyapi.objects.Order;

import java.util.ArrayList;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class OrderAPI extends Api {
    private final String BASE = "orders/";

    public OrderAPI(HttpClient httpClient) {
        super("Order", httpClient);
    }

    public Order get(String id) throws Exception {
        return getGson().fromJson(getHttpClient().parse(BASE + id), Order.class);
    }

    public ArrayList<Order> getAllOrders() throws Exception {
        ArrayList<Order> orders = new ArrayList<>();
        JsonArray jsonArray = getHttpClient().parse(BASE).getAsJsonArray();
        for(JsonElement object : jsonArray) {
            orders.add(getGson().fromJson(object, Order.class));
        }

        return orders;
    }

}
