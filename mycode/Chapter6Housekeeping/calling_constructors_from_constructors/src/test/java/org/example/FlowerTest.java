package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    Flower flower;
    String[] expected;
    String[] results;
    @BeforeEach
    void setUp() {
        flower = new Flower();
    }

    @Test
    void testZeroArgumentConstructorCallsTwoArgumentConstructor() {
        expected = new String[]{"Zero argument constructor calls two argument constructor",
                "two argument constructor with a String followed by an int"};
        results = new String[]{flower.zeroArgConstructor, flower.twoArgConstructor};
        assertArrayEquals(expected, results);
    }

    @Test
    void testThisUsedForSingleArgumentConstructorCall() {
        expected = new String[]{"constructor with single argument, int only, petalCount = 47"};
        results = new String[]{flower.singleArgConstrInt};
        assertArrayEquals(expected, results);
    }

}