package com.keisse.project.model;

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

    public String getBreedname() {
        return breedname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void update(int breedID, String breedname, BigDecimal price) {

    }

}
