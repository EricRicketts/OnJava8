package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.foo_bar.BarNext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    BarNext barNext;
    @BeforeEach
    public void setUp() {
        barNext = new BarNext();
        barNext.setK(5);
        barNext.setI(4);
        BarNext.setZ(6);
    }

    @Test
    public void testSubclassCanAccessPrivateMembersThroughPublicMethods() {
        int[] expected = new int[]{4, 6};
        int[] results = new int[]{barNext.getI(), BarNext.getZ()};
        assertArrayEquals(expected, results);
    }
}
