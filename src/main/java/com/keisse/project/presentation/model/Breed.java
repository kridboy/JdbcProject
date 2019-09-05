package com.keisse.project.presentation.model;

import com.keisse.project.data.ModelDAO;

import java.math.BigDecimal;

public class Breed {
    private int breedID;
    private String breedname;
    private BigDecimal price;

    public Breed(int breedID, String breedname, BigDecimal price) {
        this.breedID = breedID;
        this.breedname = breedname;
        this.price = price;
    }
    public Breed(String breedname, BigDecimal price) {
        this.breedname = breedname;
        this.price = price;
        breedID = ModelDAO.highestTableIndex("breeds")+1;
    }

    public String getBreedname() {
        return breedname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getBreedID() {
        return breedID;
    }

    public void update(int breedID, String breedname, BigDecimal price) {

    }

}
