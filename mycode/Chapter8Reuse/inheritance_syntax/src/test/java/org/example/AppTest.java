package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.cleaners.Cleanser;
import org.example.cleaners.Detergent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    Cleanser cleanser;
    Detergent detergent;
    String expected;
    @BeforeEach
    public void setUp() {
        cleanser = new Cleanser();
        detergent = new Detergent();
    }

    @Test
    public void testCleanser() {
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        expected = "Cleanser dilute() apply() scrub()";
        assertEquals(expected, cleanser.toString());
    }

    @Test
    public void testDetergent() {
        expected = "Cleanser dilute() Detergent.scrub() scrub() apply() foam()";
        detergent.dilute();
        detergent.scrub();
        detergent.apply();
        detergent.foam();
        assertEquals(expected, detergent.toString());
    }
}
