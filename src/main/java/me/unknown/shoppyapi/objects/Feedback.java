package me.unknown.shoppyapi.objects;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class Feedback {
    private String id, order_id, comment, response, created_at, updated_at;
    private int stars, rating;

    public String getId() {
        return id;
    }

    public String getOrderId() {
        return order_id;
    }

    public String getComment() {
        return comment;
    }

    public String getResponse() {
        return response;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public int getStars() {
        return stars;
    }

    public int getRating() {
        return rating;
    }
}
