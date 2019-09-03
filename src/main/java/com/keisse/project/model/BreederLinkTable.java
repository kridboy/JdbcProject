package com.keisse.project.model;

public class BreederLinkTable {
    final int BreederID;
    final int BreedID;

    public BreederLinkTable(int breederID, int breedID) {
        BreederID = breederID;
        BreedID = breedID;
    }

    public int getBreederID() {
        return BreederID;
    }

    public int getBreedID() {
        return BreedID;
    }
}
