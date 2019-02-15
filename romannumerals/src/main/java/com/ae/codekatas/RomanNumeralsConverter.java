package com.ae.codekatas;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {

	public static void main(String[] args) {
	}

	private Map<Integer, String> decimalToRoman;

	public RomanNumeralsConverter() {
		decimalToRoman = new HashMap<Integer, String>();
		decimalToRoman.put(1, "I");
		decimalToRoman.put(2, "II");
		decimalToRoman.put(3, "III");
		decimalToRoman.put(4, "IV");
		decimalToRoman.put(5, "V");
		decimalToRoman.put(6, "VI");
		decimalToRoman.put(7, "VII");
		decimalToRoman.put(8, "VIII");
		decimalToRoman.put(9, "IX");
		decimalToRoman.put(10, "X");
	}

	public String toRomanNumeral(int decimal) {
		return decimalToRoman.get(decimal);
	}
}

