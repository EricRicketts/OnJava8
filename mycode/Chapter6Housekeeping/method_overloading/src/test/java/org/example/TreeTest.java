package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TreeTest {

    Tree firstTree, secondTree;
    @BeforeEach
    void setUp() {
        firstTree = new Tree();
        secondTree = new Tree(25);
    }

    @Test
    @DisplayName("If overloaded constructors are defined you must explicitly call a zero argument constructor")
    public void testZeroArgumentConstructor() {
        assertEquals(0, firstTree.getHeight());
    }

    @Test
    @DisplayName("If overloaded constructors are defined you must call the appropriate constructor")
    public void testSingleArgumentConstructor() {
        assertEquals(25, secondTree.getHeight());
    }
}
