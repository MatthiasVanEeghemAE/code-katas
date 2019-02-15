package com.ae.codekatas;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static void main(String[] args) {
    }

    public static int add(String numbers) {
        if (numbers.length() == 0)
            return 0;

        Pair<String, String> customDelimiterAndRest = getCustomDelimiterAndRest(numbers);
        String customDelimiter = customDelimiterAndRest.getKey();
        String input = customDelimiterAndRest.getValue();
        String regex = ",|\\n";

        if (customDelimiter.length() > 0) {
            regex += "|" + customDelimiter;
        }

        return doAdditionWithRegex(input, regex);
    }

    private static int doAdditionWithRegex(String input, String regex) {
        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;

        for (String numberAsString : input.split(regex)) {
            int number = Integer.parseInt(numberAsString);

            if (number < 0) {
                negativeNumbers.add(number);
            } else if (number <= 1000) {
                sum += number;
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new NegativeNumberException("Encountered the following negatives: " + negativeNumbers);
        }

        return sum;
    }

    public static Pair<String, String> getCustomDelimiterAndRest(String input) {
        if (input.startsWith("//")) {
            String inputWithoutSlashes = input.substring(2);
            String[] split = inputWithoutSlashes.split("\n", 2);
            return new Pair<>(split[0], split[1]);
        }

        return new Pair<>("", input);
    }
}

