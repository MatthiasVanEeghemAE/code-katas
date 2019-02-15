package com.ae.codekatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class StringCalculatorTest {

    @Test
    public void addEmptyStringTest() {
        Assertions.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void addOneNumberTest() {
        Assertions.assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void addMultipleNumbersTest() {
        Assertions.assertEquals(348, StringCalculator.add("1,2,345"));
    }

    @Test
    public void addMultipleNumbersWithNewlineAndCommaTest() {
        Assertions.assertEquals(348, StringCalculator.add("1\n2,345"));
    }

    @Test
    public void customDelimiterTest() {
        Optional<String> customDelimiter = StringCalculator.getCustomDelimiter("//;\n1;2");
        Assertions.assertTrue(customDelimiter.isPresent());
        Assertions.assertEquals(";", customDelimiter.get());
    }
}

