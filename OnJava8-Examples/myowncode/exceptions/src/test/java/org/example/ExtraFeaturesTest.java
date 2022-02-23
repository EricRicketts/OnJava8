package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraFeaturesTest {

    String expected;
    @BeforeEach
    void setUp() {
        expected = "";
    }

    @Test
    void testExtraFeaturesF() {
        Exception exception = assertThrows(MyException.class, ExtraFeatures::f);
        expected = "Detail Message: 0 null";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void testExtraFeaturesG() {
        Exception exception = assertThrows(MyException.class, ExtraFeatures::g);
        expected = "Detail Message: 0 Originated in g()";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void testExtraFeaturesH() {
        Exception exception = assertThrows(MyException.class, ExtraFeatures::h);
        expected = "Detail Message: 47 Originated in h()";
        assertEquals(expected, exception.getMessage());
    }
}