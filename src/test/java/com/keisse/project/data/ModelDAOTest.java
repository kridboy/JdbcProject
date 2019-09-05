package com.keisse.project.data;

import com.keisse.project.presentation.model.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ModelDAOTest {
    private Breed breed = new Breed("testbreed", BigDecimal.valueOf(420.2));
    private Breeder breeder = new Breeder("", "", "");
    private Customer customer = new Customer("Testy", "De Tester", "Goedeweg 5 9968 Bassevelde", "test@mail.ru");
    private Item item = new Item(1, 1, 1, 5);
    private Order order = new Order(Timestamp.valueOf(LocalDateTime.now()), 1);

    @Test
    void getBreedByName() {
        assertDoesNotThrow(() -> ModelDAO.getBreedByName("Naakt"));
        assertEquals(ModelDAO.getBreedByName("Naakt").getBreedID(), 1);
    }

    @Test
    void getBreederByName() {
        assertDoesNotThrow(() -> ModelDAO.getBreederByName("Cool"));
        assertEquals(ModelDAO.getBreederByName("Cool").getContact(), "Jafar");
    }

    @Test
    void getCustomerByName() {
        assertDoesNotThrow(() -> ModelDAO.getCustomerByName("Matthias", "Keisse"));
        assertEquals(ModelDAO.getCustomerByName("Matthias", "Keisse").getCustomerID(), 1);
    }

    @Test
    void getBreedByID() {
        assertDoesNotThrow(() -> ModelDAO.getBreedByID("1"));
        assertEquals(ModelDAO.getBreedByID("1").getBreedname(), "Naakt");
    }

    @Test
    void getBreederByID() {
        assertDoesNotThrow(() -> ModelDAO.getBreederByID("1"));
        assertEquals(ModelDAO.getBreederByID("1").getContact(), "Gerrit De Slak");
    }

    @Test
    void getCustomerByID() {
        assertDoesNotThrow(() -> ModelDAO.getCustomerByID("1"));
        assertEquals(ModelDAO.getCustomerByID("1").getLastName(), "Keisse");
    }

    @Test
    void getItemByID() {
        assertDoesNotThrow(() -> ModelDAO.getItemByID("1"));
    }

    @Test
    void getOrderByID() {
        assertDoesNotThrow(() -> ModelDAO.getOrderByID("1"));
    }

    @Test
    void addBreed() {
        assertDoesNotThrow(() -> ModelDAO.addBreed(breed));
        //eventueel kan er getest worden als er na de operatie een lijn is bij
    }

    @Test
    void addBreeder() {
        assertDoesNotThrow(() -> ModelDAO.addBreeder(breeder));
    }

    @Test
    void addCustomer() {
        assertDoesNotThrow(() -> ModelDAO.addCustomer(customer));
    }

    @Test
    void addItem() {
        assertDoesNotThrow(() -> ModelDAO.addItem(item));
    }

    @Test
    void addOrder() {
        assertDoesNotThrow(() -> ModelDAO.addOrder(order));
    }

    @Test
    void removeBreed() {
        assertDoesNotThrow(() -> ModelDAO.removeBreed(breed));
        assertThrows(SQLException.class, () -> ModelDAO.getBreedByName("testbreed"));
    }

    @Test
    void removeBreeder() {
        assertDoesNotThrow(() -> ModelDAO.removeBreeder(breeder));
    }

    @Test
    void removeItem() {
        assertDoesNotThrow(() -> ModelDAO.removeItem(item));
    }

    @Test
    void removeOrder() {
        assertDoesNotThrow(() -> ModelDAO.removeOrder(order));
    }

    @Test
    void updateRow() {
    }
}