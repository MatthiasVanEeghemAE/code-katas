package com.ae.codekatas;

import java.util.Optional;

public class StringCalculator {

    public static void main(String[] args) {
    }

    public static int add(String numbers) {
        if (numbers.length() == 0)
            return 0;

        int sum = 0;

        for(String numberAsString : numbers.split(",|\\n")) {
            int number = Integer.parseInt(numberAsString);
            sum += number;
        }

        return sum;
    }

    public static Optional<String> getCustomDelimiter(String input) {
        if (input.startsWith("//")) {
            String inputWithoutSlashes = input.substring(2);
            String customDelimiter = inputWithoutSlashes.split("\n", 2)[0];
            return Optional.of(customDelimiter);
        }

        return Optional.empty();
    }
}

