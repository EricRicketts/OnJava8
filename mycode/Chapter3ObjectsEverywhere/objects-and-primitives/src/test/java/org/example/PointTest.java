package org.example;

import model.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {

    private Point p1, p2;

    @BeforeEach
    public void setUp() {
        p1 = new Point(5.50, 10.50);
        p2 = new Point(10.50, 15.50);
    }

    @Test
    public void testGetXAndGetY() {
        Double[] expected = new Double[]{5.50, 10.50};
        Double[] results = new Double[]{p1.getX(), p1.getY()};

        Assertions.assertArrayEquals(expected, results);
    }
}
