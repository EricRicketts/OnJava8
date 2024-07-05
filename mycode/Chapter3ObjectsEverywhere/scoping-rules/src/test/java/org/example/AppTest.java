package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  @DisplayName("variables are scoped by block")
  public void testVariablesScopedByBlock() {
    { int x = 10;
      {
        int y = 11;
        assertEquals(y, 11);
        assertEquals(x, 10);
      }
      assertEquals(x, 10);
      // cannot make an assertion for y being out of scope
      // compiler flags the variable y before the test is run
    }
    { int x = 10;
      {
        int y = 11;
        assertEquals(y, 11);
        assertEquals(x, 10);
        // we cannot do => int x = 10; Java does not allow redeclaration in an inner scope
        // with a variable of the same name in an outer scope
        x = 12; // we can reassign within an inner
        assertEquals(12, x);
      }
        assertEquals(12, x); // retains value in outer scope after reassignment
    }
  }
}