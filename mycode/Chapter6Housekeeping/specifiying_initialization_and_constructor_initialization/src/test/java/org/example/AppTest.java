package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.InitialValuesAndConstructor;
import org.example.model.InitialValuesOnly;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    InitialValuesOnly initialValuesOnly;
    InitialValuesAndConstructor initialValuesAndConstructor;
    @BeforeEach
    public void setUp() {
        initialValuesOnly = new InitialValuesOnly();
    }

    @Test
    public void testInitialValuesOnlyIntInitialization() {
        assertEquals(4, initialValuesOnly.getI());
    }

    @Test
    public void testInitialValuesOnlyDoubleInitialization() {
        assertEquals(4.0, initialValuesOnly.getD());
    }

    @Test
    public void testZeroArgumentConstructorLongInitialValues() {
        initialValuesAndConstructor = new InitialValuesAndConstructor();
        assertEquals(1L, initialValuesAndConstructor.getLng());
    }

    @Test
    public void testZeroArgumentConstructorBoolInitialValues() {
        initialValuesAndConstructor = new InitialValuesAndConstructor();
        assertFalse(initialValuesAndConstructor.getBool());
    }

    @Test
    public void testConstructorsOverrideInitialValues() {
        initialValuesAndConstructor = new InitialValuesAndConstructor(2L, true);
        Object[] expected = new Object[]{2L, true};
        Object[] results = new Object[]{initialValuesAndConstructor.getLng(), initialValuesAndConstructor.getBool()};
        assertArrayEquals(expected, results);
    }
}
