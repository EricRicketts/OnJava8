package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TreeTest {

    Tree firstTree, secondTree;
    String expected;
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

    @Test
    @DisplayName("In addition to constructors methods can be overloaded, here is a zero argument method")
    public void testZeroArgumentMethodInfo() {
        expected = "The tree is 25 feet tall.";
        assertEquals(expected, secondTree.info());
    }

    @Test
    @DisplayName("In addition to constructors methods can be overloaded, here is a one argument method")
    public void testOneArgumentMethodInfo() {
        expected = "Overloaded method.  The tree is 25 feet tall.";
        assertEquals(expected, secondTree.info("Overloaded method.  "));
    }
}
