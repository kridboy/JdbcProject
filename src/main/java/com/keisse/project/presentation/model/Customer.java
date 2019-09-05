package com.keisse.project.presentation.model;

//TODO don't think i really need this? it's just a lookup table
public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    private String address;
    private String email;

    public Customer(int customerID, String firstName, String lastName, String address, String email) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }
    public Customer( String firstName, String lastName, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.valueOf(customerID);
    }


    public void update(int customerID, String firstName, String lastName, String address, String email) {

    }

}
