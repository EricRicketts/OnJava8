package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoSynthesisTest {

    NoSynthesis noSynthesis;
    @BeforeEach
    void setUp() {
        noSynthesis = new NoSynthesis(1);
    }

    @Test
    void getX() {
        assertEquals(1, noSynthesis.getX());
    }

    @Test
    void setX() {
        noSynthesis.setX(2);
        assertEquals(2, noSynthesis.getX());
    }
}
/*
    If the developer specifies a constructor, any constructor then Java will not provide a default constructor.
    The specified constructor is NOT constrained, it does not have to be a no argument constructor.
*/