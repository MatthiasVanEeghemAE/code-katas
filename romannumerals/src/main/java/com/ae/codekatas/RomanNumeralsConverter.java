package com.ae.codekatas;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsConverter {

    public static void main(String[] args) {
    }

    private Map<Integer, String> decimalToRoman;

    public RomanNumeralsConverter() {
        decimalToRoman = new TreeMap<Integer, String>(Collections.reverseOrder());
        decimalToRoman.put(1000, "M");
        decimalToRoman.put(500, "D");
        decimalToRoman.put(100, "C");
        decimalToRoman.put(50, "L");
        decimalToRoman.put(10, "X");
        decimalToRoman.put(5, "V");
        decimalToRoman.put(1, "I");
    }

    public String toRomanNumeral(int input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Integer, String> entry : decimalToRoman.entrySet()) {
            int decimal = entry.getKey();
            String romanCharacter = entry.getValue();

            while (input % decimal < input) {
                stringBuilder.append(romanCharacter);
                input -= decimal;
            }
        }

        return stringBuilder.toString();
    }
}

