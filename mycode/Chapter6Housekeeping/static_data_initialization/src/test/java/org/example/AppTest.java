package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.example.model.StaticInitialization;
import org.example.model.Table;
import org.example.model.Cupboard;

public class AppTest {

    StaticInitialization staticInitialization;
    int[] expected;
    int[] results;
    @BeforeEach
    public void setUp() {
        staticInitialization = new StaticInitialization();
    }
    @Test
    public void testTableStaticVariablesOnlyInitializedOnce() {
        expected = new int[]{1, 2};
        results = new int[]{Table.bowl1.getInstanceMarker(), Table.bowl2.getInstanceMarker()};
        assertArrayEquals(expected, results);
    }

    @Test
    public void testCupboardStaticVariablesOnlyInitializedOnce() {
        expected = new int[]{4, 5};
        results = new int[]{Cupboard.bowl4.getInstanceMarker(), Cupboard.bowl5.getInstanceMarker()};
        assertArrayEquals(expected, results);
    }

    @Test
    public void staticFieldsInitializedBeforeConstructor() {
        String[] expected = new String[]{"f2(1)", "f3(1)"};
        String[] results = new String[]{staticInitialization.getTableString(),
                staticInitialization.getCupboardString()};
        assertArrayEquals(expected, results);
    }
}
