package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitializeValuesTest {

    InitializeValues initializeValues;
    Object[] expected, results;
    @BeforeEach
    void setUp() {
        initializeValues = new InitializeValues();
    }

    @Test
    void testIntegralDefaultValues() {
        Byte byteInit = 0;
        Short shortInit = 0;
        Integer intInit = 0;
        Long longInit = 0L;
        expected = new Object[]{byteInit, shortInit, intInit, longInit};
        results = new Object[]{initializeValues.b, initializeValues.s,
                initializeValues.i, initializeValues.l};
        assertArrayEquals(expected, results);
    }

    @Test
    void testFloatDefaultValues() {
        Float floatInit = 0.0F;
        Double doubleInit = 0.0;
        expected = new Object[]{floatInit, doubleInit};
        results = new Object[]{initializeValues.f, initializeValues.d};
        assertArrayEquals(expected, results);
    }

    @Test
    void testBooleanDefaultValue() {
        assertFalse(initializeValues.t);
    }

    @Test
    void testCharDefaultValue() {
        assertEquals('\u0000', initializeValues.c);
    }

    @Test
    void testReferenceDefaultValue() {
        assertNull(initializeValues.initializeValues);
    }
}