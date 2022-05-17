package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Mugs;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testInstanceInitializersCalledBeforeConstructors() {
        Mugs mugs = new Mugs();
        int[] expected = new int[]{1, 3};
        int[] results = new int[]{mugs.getMug1().getMarker(), mugs.getMug2().getMarker()};
        assertArrayEquals(expected, results);
    }
}
