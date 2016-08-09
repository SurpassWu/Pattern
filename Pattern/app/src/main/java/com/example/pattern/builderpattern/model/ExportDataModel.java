package com.example.pattern.builderpattern.model;

/**
 * Created by wuyue on 16/8/9.
 */
public class ExportDataModel {
    private String productId;
    private double price;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
