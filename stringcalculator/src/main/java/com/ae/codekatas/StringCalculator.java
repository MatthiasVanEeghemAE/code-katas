package com.ae.codekatas;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

    public static int add(String inputString) {
        if (inputString.length() == 0)
            return 0;

        Pair<String, String> customDelimiterAndRest = getCustomDelimiterAndRest(inputString);
        String customDelimiter = customDelimiterAndRest.getKey();
        String defaultDelimiters = ",|\\n";

        if (customDelimiter.length() > 0) {
            defaultDelimiters += "|" + customDelimiter;
        }

        List<Integer> numbers = getNumbersFromInputUsingRegex(customDelimiterAndRest.getValue(), defaultDelimiters);
        return addNumbers(numbers);
    }

    private static int addNumbers(List<Integer> numbers) {
        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;

        for (Integer number : numbers) {
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

    private static List<Integer> getNumbersFromInputUsingRegex(String input, String regex) {
        return Arrays.stream(input.split(regex))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
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

