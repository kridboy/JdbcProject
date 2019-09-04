package com.keisse.project.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ModelDAOTest {

    @Test
    void getBreedByName() {
        assertDoesNotThrow(() -> ModelDAO.getBreedByName("Naakt"));
    }

    @Test
    void getBreederByName() {
        assertDoesNotThrow(() -> ModelDAO.getBreederByName("Cool"));
    }

    @Test
    void getCustomerByName() {
        assertDoesNotThrow(() -> ModelDAO.getCustomerByName("Matthias", "Keisse"));
    }

    @Test
    void getBreedByID() {
        assertDoesNotThrow(() -> ModelDAO.getBreedByID("1"));
    }

    @Test
    void getBreederByID() {
        assertDoesNotThrow(() -> ModelDAO.getBreederByID("1"));
    }

    @Test
    void getCustomerByID() {
        assertDoesNotThrow(() -> ModelDAO.getCustomerByID("1"));
    }

    @Test
    void getItemByID() {
        assertDoesNotThrow(() -> ModelDAO.getItemByID("1"));
    }

    @Test
    void getOrderByID() {
        assertDoesNotThrow(() -> ModelDAO.getOrderByID("9"));
    }

    @Test
    void addBreed() {
    }

    @Test
    void addBreeder() {
    }

    @Test
    void addCustomer() {
    }

    @Test
    void addItem() {
    }

    @Test
    void addOrder() {
    }

    @Test
    void removeBreed() {
    }

    @Test
    void removeBreeder() {
    }

    @Test
    void removeItem() {
    }

    @Test
    void removeOrder() {
    }

    @Test
    void updateRow() {
    }
}