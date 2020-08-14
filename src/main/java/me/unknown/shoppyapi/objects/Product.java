package me.unknown.shoppyapi.objects;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class Product {
    private String id, attachment_id, title, description,type, currency, gateways, webhook_urls, position, created_at, updated_at, seller;
    private boolean unlisted;
    private int price, stock_warning, quantity, confirmations,stock;

    public Product(String title, String description, String type, String currency, String gateways, String webhook_urls,
                   String seller,
                   boolean unlisted, int price, int stock_warning, int quantity, int stock) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.currency = currency;
        this.gateways = gateways;
        this.webhook_urls = webhook_urls;
        this.seller = seller;
        this.unlisted = unlisted;
        this.price = price;
        this.stock_warning = stock_warning;
        this.quantity = quantity;
        this.stock = stock;
    }

    public void setAttachment_id(String attachment_id) {
        this.attachment_id = attachment_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setGateways(String gateways) {
        this.gateways = gateways;
    }

    public void setWebhookUrls(String webhook_urls) {
        this.webhook_urls = webhook_urls;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdatedAt(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setUnlisted(boolean unlisted) {
        this.unlisted = unlisted;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStockWarning(int stock_warning) {
        this.stock_warning = stock_warning;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getAttachmentId() {
        return attachment_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
    }

    public String getGateways() {
        return gateways;
    }

    public String getWebhookUrls() {
        return webhook_urls;
    }

    public String getPosition() {
        return position;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public String getSeller() {
        return seller;
    }

    public boolean isUnlisted() {
        return unlisted;
    }

    public int getPrice() {
        return price;
    }

    public int getStockWarning() {
        return stock_warning;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public int getStock() {
        return stock;
    }
}
