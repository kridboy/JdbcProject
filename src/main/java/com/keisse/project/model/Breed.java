package com.keisse.project.model;

import java.util.List;

public class Breed {
final String Breedname;
final String Price;

    public Breed(String breedname, String price) {
        Breedname = breedname;
        Price = price;
    }

    public String getBreedname() {
        return Breedname;
    }

    public String getPrice() {
        return Price;
    }
}
