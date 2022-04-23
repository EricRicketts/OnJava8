package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    Flower flower;
    @BeforeEach
    void setUp() {
        flower = new Flower();
    }

    @Test
    void testZeroArgumentConstructorCallsTwoArgumentConstructor() {

    }

}