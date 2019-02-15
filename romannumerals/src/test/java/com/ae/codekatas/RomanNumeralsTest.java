package com.ae.codekatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RomanNumeralsTest {

	private RomanNumeralsConverter converter;

	@BeforeAll
	public void setup() {
		converter = new RomanNumeralsConverter();
	}

	@Test
	public void decimalOneCorrectRomanNumeral() {
		Assertions.assertEquals("I", converter.toRomanNumeral(1));
	}

	@Test
	public void simpleAdditionTest() {
		Assertions.assertEquals("II", converter.toRomanNumeral(2));
		Assertions.assertEquals("III", converter.toRomanNumeral(3));
	}

	@Test
	public void twoDigitDecimalTest() {
		Assertions.assertEquals("XV", converter.toRomanNumeral(15));
	}

	@Test
	public void simpleSubstractionTest() {
		Assertions.assertEquals("IX", converter.toRomanNumeral(9));
	}

	@Test
	public void complexNumberTest() {
		Assertions.assertEquals("MMXIX", converter.toRomanNumeral(2019));
	}
}

