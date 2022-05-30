package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Cartoon;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    Cartoon cartoon;
    @BeforeEach
    public void setUp() {
        cartoon = new Cartoon("Simpsons");
    }

    @Test
    public void testInitializations() {
        String[] expected = new String[]{"initialized Art", "computer graphics", "Simpsons"};
        String[] results = new String[]{cartoon.getS(), cartoon.getInstrument(), cartoon.getTvShow()};
        assertArrayEquals(expected, results);
    }
}

/*
    Notice the chain of events, Drawing inherited from Art which had no explicit constructor, but Drawing called
    it so the private variable s was initialized, the getS method was inherited along with the field s.  Cartoon
    inherited from Drawing and in Cartoon an explicit call was made to the parent constructor so to set the
    instrument field.
*/
