package org.example;
import org.example.InheritingExceptions;
import org.example.SimpleException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InheritingExceptionsTest {

    InheritingExceptions inheritedExceptions;
    @BeforeEach
    void setUp() {
        inheritedExceptions = new InheritingExceptions();
    }

    @Test
    public void testCustomException() {
        Exception exception = assertThrows(SimpleException.class, () -> { inheritedExceptions.f(); });
        String expected = "This is a simple exception";
        assertEquals(expected, exception.getMessage());
    }

}