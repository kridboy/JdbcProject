package com.keisse.project.data;

import com.keisse.project.presentation.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelDAO {
    private ModelDAO() {
    }

    public static Breed getBreedByName(String breedName) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("breeds", "BreedName", breedName);
            rs.next();
            return new Breed(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Breeder getBreederByName(String breederName) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("Breeders", "BreederName", breederName);
            rs.next();
            return new Breeder(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Customer getCustomerByName(String firstName, String lastName) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("Customers", "FirstName", firstName + "' AND LastName='" + lastName);
            rs.next();
            return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public static Breed getBreedByID(String breedID) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("breeds", "BreedID", breedID);
            rs.next();
            return new Breed(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Breeder getBreederByID(String breederID) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("Breeders", "BreederID", breederID);
            rs.next();
            return new Breeder(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Customer getCustomerByID(String customerID) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("Customers", "CustomerID", customerID);
            rs.next();
            return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Item getItemByID(String itemID) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("Items", "ItemID", itemID);
            rs.next();
            return new Item(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Order getOrderByID(String orderID) {
        try {
            ResultSet rs = JdbcFacade.selectStatement("Orders", "OrderID", orderID);
            rs.next();
            return new Order(rs.getInt(1), rs.getTimestamp(2), rs.getInt(3));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void addBreed(Breed breed) {
        JdbcFacade.executeStatement("INSERT INTO breeds(BreedName,Price) " +
                "VALUES('" + breed.getBreedname() +
                "','" + breed.getPrice() + "')");
    }

    public static void addBreeder(Breeder breeder) {
        JdbcFacade.executeStatement("INSERT INTO Breeders(BreederName,Contact,PhoneNumber) " +
                "VALUES('" + breeder.getName() +
                "','" + breeder.getContact() +
                "','" + breeder.getPhoneNumber() + "')");
    }

    public static void addCustomer(Customer customer) {
        JdbcFacade.executeStatement("INSERT INTO Customers(FirstName,LastName,Address,Email) " +
                "VALUES('" + customer.getFirstName() +
                "','" + customer.getLastName() +
                "','" + customer.getAddress() +
                "','" + customer.getEmail() + "')");
    }

    public static void addItem(Item item) {
        JdbcFacade.executeStatement("INSERT INTO Items(orderID,BreederID,Count) " +
                "VALUES('" + item.getOrderID() +
                "','" + item.getBreederID() +
                "','" + item.getCount() + "')");
    }

    public static void addOrder(Order order) {
        JdbcFacade.executeStatement("INSERT INTO Orders(CustomerID,PurchaseTime) " +
                "VALUES('" + order.getCustomerID() + "','" +
                order.getPurchaseTime() + "')");
    }

    public static void removeBreed(Breed breed) {
        JdbcFacade.executeStatement("DELETE FROM breeds WHERE BreedID='" + breed.getBreedID() + "'");
    }

    public static void removeBreeder(Breeder breeder) {
        JdbcFacade.executeStatement("DELETE FROM Breeders WHERE BreederID='" + breeder.getBreederID() + "'");
        JdbcFacade.executeStatement("DELETE FROM BreedLinks WHERE BreederID='" + breeder.getBreederID() + "'");
    }

    public static void removeItem(Item item) {
        JdbcFacade.executeStatement("DELETE FROM Items WHERE ItemID='" + item.getItemID() + "'");
    }

    public static void removeOrder(Order order) {
        JdbcFacade.executeStatement("DELETE FROM Orders WHERE OrderID='" + order.getOrderID() + "'");
        JdbcFacade.executeStatement("DELETE FROM Items WHERE OrderID='" + order.getOrderID() + "'");
    }

    public void updateRow(String sql) {
        JdbcFacade.updateStatement(sql);
    }
}
