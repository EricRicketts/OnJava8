package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class BathHouse {
    private List<Bath> baths = new ArrayList<>();
    public BathHouse(Bath bath) { this.baths.add(bath); }

    public List<Bath> getBaths() {
        return baths;
    }

    public void addBath(Bath bath) { this.baths.add(bath); }
}
