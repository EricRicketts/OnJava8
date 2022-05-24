package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.pastry.ChocolateChipCookie;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testProtectedAccess() {
        ChocolateChipCookie cookie = new ChocolateChipCookie();
        String expected = "Chomping the Chocolate Chip Cookie and Biting into the cookie";
        assertEquals(expected, cookie.chomp());
    }
}
