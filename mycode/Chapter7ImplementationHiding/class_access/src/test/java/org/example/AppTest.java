package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.lunch.Lunch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    Lunch lunch;
    @BeforeEach
    public void setUp() {
        lunch = new Lunch();
    }

    @Test
    public void testStaticMethodUsedToCreateObject() {
        assertEquals("f() in Soup1", lunch.testSoup1() );
    }

    @Test
    public void testSingleton() {
        assertTrue(lunch.testSoup2() );
    }
}
