package com.ae.codekatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

	@Test
	public void decimalOneCorrectRomanNumeral() {
		Assertions.assertEquals("I", RomanNumerals.toRomananNumeral(1));
	}

	@Test
	public void decimalTwoThreeAndFourAreCorrect() {
		Assertions.assertEquals("II", RomanNumerals.toRomananNumeral(2));
		Assertions.assertEquals("III", RomanNumerals.toRomananNumeral(3));
		Assertions.assertEquals("IV", RomanNumerals.toRomananNumeral(4));
	}
}

