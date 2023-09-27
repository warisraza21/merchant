package com.example.merchant.models;

public class PaymentDTO {
    private String merchantId;
    private double amount;
    private String currency;
    private String orderId;

    public PaymentDTO() {
    }

    public PaymentDTO(String merchantId, double amount, String currency, String orderId) {
        this.merchantId = merchantId;
        this.amount = amount;
        this.currency = currency;
        this.orderId = orderId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
