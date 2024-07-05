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
    dOnly.addToI(5);
    assertEquals(15, dOnly.getI());
  }

  @Test
  @DisplayName("void return type adds to double field")
  public void testVoidMethodAddsToDoubleField() {
    dOnly.addToD(5.55);
    assertEquals(15.5500, dOnly.getD());
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

  @Test
  @DisplayName("static methods used to update a field")
  public void testStaticMethodsAndInstances() {
    DataOnly.setStaticI(10);
    assertEquals(10, DataOnly.getStaticI());
    /*
      I was originally confused by the books example.  I now understand.  The book declared => static i = 47;
      there was no private accessor, so it was package private meaning it could be used in the same package.
      The getStaticI() method is private meaning it can only be accessed in the DataOnly class.
     */
  }
}
