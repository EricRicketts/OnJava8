package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Burrito;
import org.example.model.Spiciness;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    Burrito burrito;
    @BeforeEach
    public void setUp() {
        burrito = new Burrito(Spiciness.NOT);
    }

    @Test
    public void testOrdinalPositions() {
        assertEquals(0, burrito.getDegree().ordinal());
    }

    @Test
    public void testEnumToString() {
        assertEquals("NOT", burrito.getDegree().toString());
    }
}
