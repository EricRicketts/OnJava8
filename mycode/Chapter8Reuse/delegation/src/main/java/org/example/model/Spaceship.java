package org.example.model;

public class Spaceship {

    public SpaceShipControls controls = new SpaceShipControls();
    private String name;

    public Spaceship(String name) { this.name = name; }

    public String getName() {
        return name;
    }
}
