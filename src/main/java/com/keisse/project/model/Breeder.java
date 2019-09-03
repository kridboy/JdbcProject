package com.keisse.project.model;

import java.util.List;

public class Breeder {
    final int breederID;
    final String name;
    final String address;
    final String contact;
    final String phoneNumber;

    public Breeder(int breederID, String name, String address, String contact, String phoneNumber) {
        this.breederID = breederID;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.phoneNumber = phoneNumber;
    }

    public int getBreederID() {
        return breederID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
