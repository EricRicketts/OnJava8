package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
  }
}