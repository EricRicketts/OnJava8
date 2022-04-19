package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PrimitiveOverloadingTest {

    PrimitiveOverloading primitiveOverloading;
    String expected;
    @BeforeEach
    void setUp() {
        primitiveOverloading = new PrimitiveOverloading();
    }


    @Test
    void testChar() {
        expected = "f1(char) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)";
        assertEquals(expected, primitiveOverloading.testChar());
    }

    @Test
    void testByte() {
        expected = "f1(byte) f2(byte) f3(short) f4(int) f5(long) f6(float) f7(double)";
        assertEquals(expected, primitiveOverloading.testByte());
    }

    @Test
    void testShort() {
        expected = "f1(short) f2(short) f3(short) f4(int) f5(long) f6(float) f7(double)";
        assertEquals(expected, primitiveOverloading.testShort());
    }

    @Test
    void testInt() {
        expected = "f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)";
        assertEquals(expected, primitiveOverloading.testInt());
    }

    @Test
    void testLong() {
        expected = "f1(long) f2(long) f3(long) f4(long) f5(long) f6(float) f7(double)";
        assertEquals(expected, primitiveOverloading.testLong());
    }

    @Test
    void testFloat() {
        expected = "f1(float) f2(float) f3(float) f4(float) f5(float) f6(float) f7(double)";
        assertEquals(expected, primitiveOverloading.testFloat());
    }

    @Test
    void testDouble() {
        expected = "f1(double) f2(double) f3(double) f4(double) f5(double) f6(double) f7(double)";
        assertEquals(expected, primitiveOverloading.testDouble());
    }
}
/*
    this is a really important test suite to show how promotion takes place when primitives are passed to
    overloaded methods.

    Let's take the case of testByte, the variable x in the method is byte x = 1.  In the f1 functions x is
    promoted to f1(byte x), in the f2 functions it matches f2(byte x) in the f3 and beyond x is promoted to
    the first function: f4(int x), f5(long x), f6(float x), and f7(double x)

    The author notes char is a bit different if it cannot find an exact match of the parameter it is
    automatically promoted it int.
*/