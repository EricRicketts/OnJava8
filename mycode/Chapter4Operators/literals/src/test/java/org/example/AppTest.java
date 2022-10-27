package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

  private static final int b = 0B1111;
  private static final int o = 07777;
  private static final int x = 0XFFFF;

  @Test
  @DisplayName("hexadecimal, octal and binary literals")
  public void testHexadecimalOctalAndBinaryLiterals() {
    int[] expected = {15, 4095, 65535};
    int[] results = {b, o, x};

    assertArrayEquals(expected, results);
  }

  @Test
  @DisplayName("using underscores")
  public void testUsingUnderscores() {
    int a = 100_456_789;
    assertEquals(100456789, a);
  }

  @Test
  @DisplayName("exponential notation")
  public void testExponentialNotation() {
    double d1 = 1.39e-2;
    double d2 = 1.39e2;
    double[] expected = {0.0139, 139};
    double[] results = {d1, d2};
    assertArrayEquals(expected, results);
  }
}
