package me.unknown.shoppyapi.objects;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/12/2020
 **/
public class QueryMessage {
    private final String message;

    public QueryMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
