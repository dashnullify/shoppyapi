package me.unknown.shoppyapi;

import me.unknown.shoppyapi.api.ApiManager;
import me.unknown.shoppyapi.http.HttpClient;
import me.unknown.shoppyapi.api.impl.FeedbackAPI;
import me.unknown.shoppyapi.api.impl.OrderAPI;
import me.unknown.shoppyapi.api.impl.ProductAPI;
import me.unknown.shoppyapi.api.impl.QueryAPI;
import me.unknown.shoppyapi.objects.*;

import java.util.ArrayList;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class ShoppyAPI {
    private final String key;
    private final HttpClient httpClient;
    private final ApiManager apiManager;

    public ShoppyAPI(String key) {
        this.key = key;
        this.httpClient = new HttpClient(key);
        apiManager = new ApiManager(httpClient);
    }

    public Order getOrder(String id) throws Exception {
        return ((OrderAPI) apiManager.getApi("Order")).get(id);
    }

    public ArrayList<Order> getAllOrders() throws Exception {
        return ((OrderAPI) apiManager.getApi("Order")).getAllOrders();
    }

    public Product getProduct(String id) throws Exception {
        return ((ProductAPI) apiManager.getApi("Product")).get(id);
    }

    public void createProduct(Product product) throws Exception {
        ((ProductAPI) apiManager.getApi("Product")).create(product);
    }

    public void deleteProduct(String id) throws Exception {
        ((ProductAPI) apiManager.getApi("Product")).delete(id);
    }

    public String updateProduct(Product product) throws Exception {
        return ((ProductAPI) apiManager.getApi("Product")).update(product);
    }

    public ArrayList<Product> getAllProducts() throws Exception {
        return ((ProductAPI) apiManager.getApi("Product")).getAllProducts();
    }

    public Feedback getFeedback(String id) throws Exception {
        return ((FeedbackAPI) apiManager.getApi("Feedback")).get(id);
    }

    public ArrayList<Feedback> getAllFeedbacks() throws Exception {
        return ((FeedbackAPI) apiManager.getApi("Feedback")).getAllFeedbacks();
    }

    public Query getQuery(String id) throws Exception {
        return ((QueryAPI) apiManager.getApi("Query")).get(id);
    }

    public void replayToQuery(Query query, QueryMessage queryMessage) throws Exception {
        ((QueryAPI) apiManager.getApi("Query")).replay(query, queryMessage);
    }

    public ArrayList<Query> getAllQueries() throws Exception {
        return ((QueryAPI) apiManager.getApi("Query")).getAllQueries();
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public String getKey() {
        return key;
    }
}
