package org.example;

import model.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {

    private Point p1, p2;
    Double[] expected, results;

    @BeforeEach
    public void setUp() {
        p1 = new Point(5.50, 10.50);
        p2 = new Point(10.50, 15.50);
    }

    @Test
    public void testGetXAndGetY() {
        expected = new Double[]{5.50, 10.50};
        results = new Double[]{p1.getX(), p1.getY()};

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testSetXAndSetY() {
        p2.setX(6.60);
        p2.setY(16.60);
        expected = new Double[]{6.60, 16.60};
        results = new Double[]{p2.getX(), p2.getY()};

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testEquals() {
        p2.setX(5.50);
        p2.setY(10.50);

        Assertions.assertTrue(p1.equals(p2));
    }
}
