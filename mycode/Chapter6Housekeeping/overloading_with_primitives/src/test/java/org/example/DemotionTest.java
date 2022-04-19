package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemotionTest {

    Demotion demotion;
    String expected;
    @BeforeEach
    void setUp() {
        demotion = new Demotion();
    }

    @Test
    void testDouble() {
        expected = "f1(double) f2(float) f3(long) f4(int) f5(short) f6(byte) f7(char)";
        assertEquals(expected, demotion.testDouble());
    }
}
/*
    This is another important test regarding primitive demotion and overloaded methods.  Notice in the code
    for testDouble, I had to explicitly demote each of the arguments except the f1 function which already had
    double as an argument.
*/