package com.ae.codekatas;

import javafx.util.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Pair<String, String> customDelimiter = StringCalculator.getCustomDelimiterAndRest("//;\n1;2");
        Assertions.assertEquals(";", customDelimiter.getKey());
    }

    @Test
    public void addMultipleNumbersWithCustomDelimiterLineTest() {
        Assertions.assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void negativeNumberThrowsException() {
        Assertions.assertThrows(NegativeNumberException.class, () -> StringCalculator.add("-1,2"), "Should throw an exception");
    }

    @Test
    public void negativeNumbersThrowsExceptionAndArePresentInTheMessage() {
        try {
            StringCalculator.add("-1,-2,3,4");
        } catch(NegativeNumberException e) {
            Assertions.assertEquals("Encountered the following negatives: [-1, -2]", e.getMessage());
        }
    }

    @Test
    public void numbersAbove1000AreIgnored() {
        Assertions.assertEquals(3, StringCalculator.add("1,1001,2"));
    }

}

