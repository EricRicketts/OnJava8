package org.example;

import model.Letter;
import model.PassObject;
import model.Tank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AppTest {

  Tank t1, t2;
  @BeforeEach
  public void setUp() {
    t1 = new Tank();
    t2 = new Tank();
  }

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

  @Test
  @DisplayName("operator assignment, primitives are stored by value")
  public void testPrimitivesAreStoredByValue() {
    int a = 1, b = 2, c = 3;
    int[] expected = {1, 2, 3};
    int[] results = {a, b, c};
    assertArrayEquals(expected, results);
  }

  @Test
  @DisplayName("operator assignment, equal objects have equal references")
  public void testEqualObjectsHaveTheSameReferences() {
    boolean firstCheckOfEquality = (t1 == t2);
    t1 = t2;
    boolean secondCheckOfEquality = (t1 == t2);
    boolean[] expected = {false, true};
    boolean[] results = {firstCheckOfEquality, secondCheckOfEquality};
    assertArrayEquals(expected, results);
  }

  @Test
  @DisplayName("operator assignment, references to one value with object assignment")
  public void testObjectAssignment() {
    t1.setLevel(9);
    t2.setLevel(47);
    int[] expected = {9, 47, 47, 47, 27, 27};
    int[] results = {t1.getLevel(), t2.getLevel(), 0, 0, 0, 0};
    t1 = t2;
    results[2] = t1.getLevel();
    results[3] = t2.getLevel();
    t1.setLevel(27);
    results[4] = t1.getLevel();
    results[5] = t2.getLevel();

    assertArrayEquals(expected, results);
  }

  @Test
  @DisplayName("object references passed to method arguments")
  public void testObjectReferencesPassedToMethodArguments() {
    Letter l = new Letter();
    l.setC('a');
    char[] expected = {'a', 'z'};
    char[] results = {l.getC(), 'a'};
    PassObject po = new PassObject();
    po.f(l);
    results[1] = l.getC();

    assertArrayEquals(expected, results);
  }
}
