package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.OverloadingVarArgs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testVarArgsAcceptsVariableNumberOfInputs() {
        String s1 = OverloadingVarArgs.f1('c', "foo", "bar");
        String s2 = OverloadingVarArgs.f1(1.1, "fizz", "buzz", "fizzbuzz");
        String[] expected = new String[]{"c foo bar", "1.1 fizz buzz fizzbuzz"};
        String[] results = new String[]{s1, s2};

        assertArrayEquals(expected, results);
    }
}
