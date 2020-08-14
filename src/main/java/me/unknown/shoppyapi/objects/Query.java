package me.unknown.shoppyapi.objects;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class Query {
    private String id, subject, email, message, created_at, updated_at;
    private int status;

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public int getStatus() {
        return status;
    }
}
