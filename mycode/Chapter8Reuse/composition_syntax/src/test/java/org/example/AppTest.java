package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Bath;
import org.example.model.BathHouse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    Bath bath;
    BathHouse bathHouse;
    @BeforeEach
    public void setUp() {
        bath = new Bath("Relaxed");
        bathHouse = new BathHouse(bath);
    }

    @Test
    public void testDifferentInitializationsOfBath() {
        String[] expected = new String[]{"Happy", "Relaxed", "Sad"};
        String[] results = new String[]{bath.getS1(), bath.getS2(), bath.getS3()};
        assertArrayEquals(expected, results);
    }

    @Test
    public void testBathHouseIsComposedOfBaths() {
        assertTrue(bathHouse.getBaths().get(0) instanceof Bath);
    }
}
