package me.unknown.shoppyapi.api.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import me.unknown.shoppyapi.api.Api;
import me.unknown.shoppyapi.http.HttpClient;
import me.unknown.shoppyapi.objects.Product;

import java.util.ArrayList;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class ProductAPI extends Api {
    private final String BASE = "products/";

    public ProductAPI(HttpClient httpClient) {
        super("Product", httpClient);
    }

    public Product get(String id) throws Exception {
        return getGson().fromJson(getHttpClient().parse(BASE + id), Product.class);
    }

    public void create(Product product) throws Exception {
        getHttpClient().put(BASE, getGson().toJson(product));
    }

    public String update(Product product) throws Exception {
        return getHttpClient().post(BASE + product.getId(), getGson().toJson(product));
    }

    public void delete(String id) throws Exception {
        getHttpClient().delete(BASE + id);
    }

    public ArrayList<Product> getAllProducts() throws Exception {
        ArrayList<Product> products = new ArrayList<>();
        JsonArray jsonArray = getHttpClient().parse(BASE).getAsJsonArray();
        for(JsonElement object : jsonArray) {
            products.add(getGson().fromJson(object, Product.class));
        }

        return products;
    }


}
