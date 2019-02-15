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

    @Test
    public void addMultipleNumbers() {
        Assertions.assertEquals(348, StringCalculator.add("1,2,345"));
    }

    @Test
    public void addMultipleNumbersWithNewlineAndComma() {
        Assertions.assertEquals(348, StringCalculator.add("1\n2,345"));
    }
}

