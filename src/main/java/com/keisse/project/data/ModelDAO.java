package com.keisse.project.util;

import com.keisse.project.model.*;
import com.keisse.project.wrapper.JdbcFacade;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ModelDAO {
    private ModelDAO(){}

    public static Breed getBreedByName(String breedName){
        try {
            ResultSet rs = JdbcFacade.selectStatement("Breed", "BreedName", breedName);
            return new Breed(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static Breeder getBreederByName(String breederName){
        try {
            ResultSet rs = JdbcFacade.selectStatement("breeder", "BreederName", breederName);
            return new Breeder(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static Customer getCustomerByName(String firstName, String lastName){
        try {
            ResultSet rs = JdbcFacade.selectStatement("Customers", "FirstName", firstName+" AND LastName='"+lastName+"'");
            return new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static Breed getBreedByID(String breedID){
        try {
            ResultSet rs = JdbcFacade.selectStatement("Breed", "BreedID", breedID);
            return new Breed(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static Breeder getBreederByID(String breederID){
        try {
            ResultSet rs = JdbcFacade.selectStatement("breeders", "BreederID", breederID);
            return new Breeder(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static Customer getCustomerByID(String customerID){
        try {
            ResultSet rs = JdbcFacade.selectStatement("Customers", "CustomerID", customerID);
            return new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static Item getItemByID(String itemID){
        try {
            ResultSet rs = JdbcFacade.selectStatement("Items", "ItemID", itemID);
            return new Item(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static Order getOrderByID(String orderID){
        try {
            ResultSet rs = JdbcFacade.selectStatement("Orders", "OrderID",orderID);
            return new Order(rs.getInt(1),rs.getTimestamp(2),rs.getInt(3));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static void addBreed(int breedID, String breedname, BigDecimal price){ }
    public static void addBreeder(int breederID, String name, String contact, String phoneNumber){ }
    public static void addCustomer(int customerID, String firstName, String lastName, String address, String email){}
    public static void addItem(int itemID, int orderID, int breederID, int breedID, int count){}
    public static void addOrder(int orderID, Timestamp purchaseTime, int customerID){}

    public static void removeBreed(int breedID){}
    public static void removeBreeder(int breederID){}
    public static void removeItem(int itemID){}
    public static void removeOrder(int orderID){}

    public void updateRow(String sql){}
}
