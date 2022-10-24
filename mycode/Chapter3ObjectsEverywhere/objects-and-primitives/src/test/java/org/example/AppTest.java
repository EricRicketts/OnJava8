package org.example;

import model.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class AppTest {

  public String expected;

  @Test
  @DisplayName("primitives are held by the variable directly")
  public void testPrimitiveValuesAreStoredInTheVariable() {
    int foo = 10;
    assertEquals(foo, 10);
  }

  @Test
  @DisplayName("objects are held by variable references")
  public void testObjectsAreVariableReferences() {
    Data d1 = new Data(10);
    Data d2 = new Data(10);

    assertNotEquals(d1, d2);
  }

}
