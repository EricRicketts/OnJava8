package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemonstrateThisTest {

    DemonstrateThis demonstrateThis;
    @BeforeEach
    void setUp() {
        demonstrateThis = new DemonstrateThis();
        demonstrateThis.setI(5);
    }

    @Test
    void testGetI() {
        assertEquals(5, demonstrateThis.getI());
    }

    @Test
    void testObjectInstance() {
        assertEquals(demonstrateThis, demonstrateThis.objectInstance());
    }

    @Test
    void testNonEqualObjects() {
        DemonstrateThis object = new DemonstrateThis();
        assertNotEquals(object, demonstrateThis.objectInstance());
    }
}
/*
    In Java the "this" keyword provides a reference to the current object being manipulated.
*/