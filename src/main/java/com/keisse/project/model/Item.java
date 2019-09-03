package com.keisse.project.model;

public class Item {
    final int itemID;
    final int orderID;
    final int count;
    final int breederID;
    final int breedID;

    public Item(int itemID, int orderID, int count, int breederID, int breedID) {
        this.itemID = itemID;
        this.orderID = orderID;
        this.count = count;
        this.breederID = breederID;
        this.breedID = breedID;
    }

    public int getItemID() {
        return itemID;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getCount() {
        return count;
    }

    public int getBreederID() {
        return breederID;
    }

    public int getBreedID() {
        return breedID;
    }
}
