package org.example;

import model.DataOnly;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

  DataOnly dOnly;
  @BeforeEach
  public void init() {
  dOnly = new DataOnly();
  };

  @Test
  @DisplayName("create an instance from a class")
  public void testCreateInstanceFromClass() {
    Object[] expected = {10, 10.00, false};
    Object[] result = {dOnly.getI(), dOnly.getD(), dOnly.getB()};
    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("method return type is int")
  public void testMethodReturnTypeIsInt() {
  assertEquals(15, dOnly.addToI(5));
  }

  @Test
  @DisplayName("void return type adds to double field")
  public void testVoidMethodAddsToDoubleField() {
    dOnly.addToD(5.00);
    assertEquals(15.00, dOnly.getD());
  }

  @Test
  @DisplayName("static methods do not need an instance")
  public void testStaticMethodsDoNotNeedAnInstance() {
    int[] expected = {5, 15};
    int[] results = {DataOnly.getStaticI(), 0};
    DataOnly.setStaticI(15);
    results[1] = DataOnly.getStaticI();

    assertArrayEquals(expected, results);
  }
}
