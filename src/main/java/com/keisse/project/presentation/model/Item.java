package com.keisse.project.model;

public class Item {
    private int itemID;
    private int orderID;
    private int count;
    private int breederID;
    private int breedID;

    public Item(int itemID, int orderID, int breederID, int breedID, int count) {
        this.itemID = itemID;
        this.orderID = orderID;
        this.breederID = breederID;
        this.breedID = breedID;
        this.count = count;
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


    public void update(int itemID, int orderID, int count, int breederID, int breedID) {

    }
}
