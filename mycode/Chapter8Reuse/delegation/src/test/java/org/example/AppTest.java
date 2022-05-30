package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Spaceship;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    Spaceship spaceship;
    @BeforeEach
    public void setUp() {
        spaceship = new Spaceship("Galaxy");
    }

    @Test
    public void testSpaceshipUpControls() {
        assertEquals("Moving up 5", spaceship.controls.up(5));
    }
}

/*
    This is composition but by delegating the controls to the SpaceShipControl object I can decide what I want
    to do in the Spaceship class regarding controls.  I do not have to choose all controls, I can choose to use
    a subset of the controls.
*/
