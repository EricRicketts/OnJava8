package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AppTest {

  @Test
  @DisplayName("operator precedence")
  public void testOperatorPrecedence() {
    int x = 1, y = 2, z = 3;
    int a = x + y - 2/2 + z;
    int b = x + (y - 2)/(z + 2);
    int[] expected = {5, 1};
    int[] results = {a, b};
    assertArrayEquals(expected, results);
  }
}
