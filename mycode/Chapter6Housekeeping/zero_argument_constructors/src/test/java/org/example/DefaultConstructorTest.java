package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultConstructorTest {

    DefaultConstructor defaultConstructor;
    @BeforeEach
    void setUp() {
        defaultConstructor = new DefaultConstructor();
    }

    @Test
    void getX() {
        assertEquals(0, defaultConstructor.getX());
    }

    @Test
    void setX() {
        defaultConstructor.setX(5);
        assertEquals(5, defaultConstructor.getX());
    }
}