package com.keisse.project.model;

public class Customer{
    final int customerID;
    final String firstName;
    final String lastName;
    final String address;
    final String email;

    public Customer(int customerID, String firstName, String lastName, String address, String email) {
        this.customerID = customerID;
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
}
