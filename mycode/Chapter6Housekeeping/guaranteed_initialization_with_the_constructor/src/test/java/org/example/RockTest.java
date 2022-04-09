package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RockTest {

    @Test
    @DisplayName("Classes come with zero argument constructor")
    public void testZeroArgumentConstructor() {
        Rock rock = new Rock();
        assertEquals("class org.example.Rock", rock.getClass().toString());
    }
}
