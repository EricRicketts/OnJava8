package org.example;

import model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

  @Test
  @DisplayName("objects compared by reference primitives by value")
  public void testObjectsComparedByReferencePrimitivesByValue() {
    Integer i1 = 127;
    Integer i2 = 127;
    Integer i3 = Integer.valueOf(127);
    Integer i4 = Integer.valueOf(127);
    int i5 = 127;
    int i6 = 127;

    boolean[] results = {i1 == i2, i1.equals(i2), i3 == i4, i3.equals(i4), i5 == i6};
    boolean[] expected = {true, true, true, true, true};

    assertArrayEquals(expected, results);
  }

  @Test
  @DisplayName("modifying the equals method")
  public void testModifyEqualsMethod() {
    boolean[] expected = {false, true};
    ValA a0 = new ValA();
    ValA a1 = new ValA();
    a0.setI(10);
    a1.setI(10);

    ValB b0 = new ValB();
    ValB b1 = new ValB();
    b0.setI(10);
    b1.setI(10);

    boolean[] results = {a0.equals(a1), b0.equals(b1)};

    assertArrayEquals(expected, results);
  }

  @Test
  @DisplayName("boolean operators")
  public void testBooleanOperators() {
    int x = 58;
    int y = 55;
    boolean[] results = {x > y, y < x, x >= y, y <= x, !(x == y), y != x};
    boolean[] expected = {true, true, true, true, true, true};

    assertArrayEquals(expected, results);
  }

  @Test
  @DisplayName("short circuiting logical expressions")
  public void testShortCircuitLogicalExpressions() {
    int x = 58;
    int y = 56;
    int z = 59;
    ShortCircuit sc = new ShortCircuit();
    sc.xAndYAndZ(x, y, z);
    assertEquals("z <= x", sc.getLastOperation());
  }

  @Test
  @DisplayName("convert numbers to strings")
  public void testConvertNumbersToStrings() {
    String x = "" + 3;
    String y = "sum is: " + (1 + 2 + 3);
    String[] expected = {"3", "sum is: 6"};
    String[] results = {x, y};

    assertArrayEquals(expected, results);
  }
}
