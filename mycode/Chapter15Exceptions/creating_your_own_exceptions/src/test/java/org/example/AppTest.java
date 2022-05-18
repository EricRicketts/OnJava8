package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.exceptions.FullConstructors;
import org.example.exceptions.MyException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    FullConstructors fullConstructors;
    @BeforeEach
    public void setUp() {
        fullConstructors = new FullConstructors();
    }

    @Test
    public void testThrowZeroArgumentException() {
        MyException thrown = assertThrows(MyException.class, () -> fullConstructors.f());
        assertEquals(MyException.class, thrown.getClass());
    }

    @Test
    public void testThrowSingleArgumentException() {
        MyException thrown = assertThrows(MyException.class, () -> fullConstructors.g());
        assertEquals("Originated in g()", thrown.getMessage());
    }
}
