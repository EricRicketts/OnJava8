package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.example.model.Cups;
import org.example.model.Cup;

public class AppTest {

    Cups cups;
    @BeforeEach
    public void setUp() {
        cups = new Cups();
    }
    @Test
    public void testStaticBlocksRunOnce() {
        int[] expected = new int[]{1, 2};
        int[] results = new int[]{Cups.cup1.getMarker(), Cups.cup2.getMarker()};
        assertArrayEquals(expected, results);
    }
}
