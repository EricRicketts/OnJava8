package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    Tree tree;
    @BeforeEach
    void setUp() {
        tree = new Tree(50);
    }

    @Test
    @DisplayName("Explicit Constructor overrides zero argument constructor")
    void getHeight() {
        assertEquals(50, tree.getHeight());
    }

    @Test
    void setHeight() {
        tree.setHeight(25);
        assertEquals(25, tree.getHeight());
    }
}