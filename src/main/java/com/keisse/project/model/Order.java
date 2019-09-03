package com.keisse.project.model;

import java.time.LocalDateTime;

public class Order {
    final int orderID;
    final int customerID;
    final LocalDateTime purchaseTime;

    public Order(int orderID, LocalDateTime purchaseTime, int customerID) {
        this.orderID = orderID;
        this.purchaseTime = purchaseTime;
        this.customerID = customerID;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }

    public int getCustomerID() {
        return customerID;
    }
}
