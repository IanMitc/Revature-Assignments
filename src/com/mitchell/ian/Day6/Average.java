package com.mitchell.ian.Day6;

import java.util.List;

public class Average {
    public static double getAverage(List<Double> numbers) throws ArithmeticException {
        double sum = 0;
        int count = numbers.size();

        if (count == 0) {
            throw new ArithmeticException("Divide by 0");
        }

        for (Double number : numbers)
            sum += number;

        return sum / count;
    }
}
