package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OverloadingOrderTest {

    String expected;

    @Test
    void testFStringFirst() {
        expected = "String is: Foo int is: 1";
        assertEquals(expected, OverloadingOrder.f("Foo", 1));
    }

    @Test
    void testFIntFirst() {
        expected = "Int is: 1 String is: Foo";
        assertEquals(expected, OverloadingOrder.f(1, "Foo"));
    }
}
