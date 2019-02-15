package com.ae.codekatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void addEmptyString() {
        Assertions.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void addOneNumber() {
        Assertions.assertEquals(1, StringCalculator.add("1"));
    }
}

