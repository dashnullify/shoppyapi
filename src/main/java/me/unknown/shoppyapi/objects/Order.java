package me.unknown.shoppyapi.objects;

/**
 * made for ShoppyAPI
 *
 * @author Unknown
 * @since 4/10/2020
 **/
public class Order {
    private String id, pay_id, product_id, coupon_id, currency, exchange_rate, email, transaction_id, crypto_address, crypto_amount, shipping_address, gateway, refund_id, replacement_id, paid_at, disputed_at, created_at;
    private int price, delivered, confirmations, required_confirmations, quantity;
    private boolean is_replacement;

    public boolean isReplacement() {
        return is_replacement;
    }

    public String getProductId() {
        return product_id;
    }

    public String getGateway() {
        return gateway;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrency() {
        return currency;
    }

    public String getId() {
        return id;
    }

    public String getCouponId() {
        return coupon_id;
    }

    public String getCryptoAddress() {
        return crypto_address;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getCryptoAmount() {
        return crypto_amount;
    }

    public String getDisputedAt() {
        return disputed_at;
    }

    public String getExchangeRate() {
        return exchange_rate;
    }

    public String getPaidAt() {
        return paid_at;
    }

    public String getPayId() {
        return pay_id;
    }

    public int getDelivered() {
        return delivered;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public int getPrice() {
        return price;
    }

    public String getRefundId() {
        return refund_id;
    }

    public String getReplacementId() {
        return replacement_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getRequiredConfirmations() {
        return required_confirmations;
    }

    public String getShippingAddress() {
        return shipping_address;
    }

    public String getTransactionId() {
        return transaction_id;
    }
}

