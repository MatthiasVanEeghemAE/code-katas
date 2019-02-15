package com.ae.codekatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

	@Test
	public void decimalOneCorrectRomanNumeral() {
		Assertions.assertEquals("I", RomanNumerals.toRomananNumeral(1));
	}
}

