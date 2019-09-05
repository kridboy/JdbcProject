package com.keisse.project.presentation.model;

public class Breeder {
    private int breederID;
    private String name;
    private String contact;
    private String phoneNumber;

    public Breeder(int breederID, String name, String contact, String phoneNumber) {
        this.breederID = breederID;
        this.name = name;
        this.contact = contact;
        this.phoneNumber = phoneNumber;
    }

    public Breeder(String name, String contact, String phoneNumber) {
        this.name = name;
        this.contact = contact;
        this.phoneNumber = phoneNumber;
    }

    public int getBreederID() {
        return breederID;
    }

    public String getName() {
        return name;
    }


    public String getContact() {
        return contact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void update(int breederID, String name, String contact, String phoneNumber) {

    }
}
