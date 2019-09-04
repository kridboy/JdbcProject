package com.keisse.project.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Order {
    private int orderID;
    private int customerID;
    private Timestamp purchaseTime;

    public Order(int orderID, Timestamp purchaseTime, int customerID) {
        this.orderID = orderID;
        this.purchaseTime = purchaseTime;
        this.customerID = customerID;
    }

    public int getOrderID() {
        return orderID;
    }

    public Timestamp getPurchaseTime() {
        return purchaseTime;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void update(int orderID, LocalDateTime purchaseTime, int customerID) {

    }
}
