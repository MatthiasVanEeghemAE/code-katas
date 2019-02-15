package com.ae.codekatas;

public class StringCalculator {

    public static void main(String[] args) {
    }

    public static int add(String numbers) {
        int sum = 0;

        for(String numberAsString : numbers.split(",|\\n")) {
            int number = Integer.parseInt(numberAsString);
            sum += number;
        }

        return sum;
    }
}

