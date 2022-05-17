package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testArrayStaticInitialization() {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = a1;
        assertArrayEquals(new int[]{1, 2, 3}, a2);
    }

    @Test
    public void testArrayDynamicInitialization() {
        String[] s = new String[3];
        s[0] = "foo";
        s[1] = "bar";
        s[2] = "foobar";
        String[] expected = new String[]{"foo", "bar", "foobar"};
        assertArrayEquals(expected, s);
    }
}
