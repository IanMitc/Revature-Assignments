package com.mitchell.ian.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3Average {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        double average = 0;
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        while (!validInput) {
            try {
                double response = Query.askForDouble("Enter number 1", scanner);
                numbers.add(response);
                response = Query.askForDouble("Enter number 2", scanner);
                numbers.add(response);
                response = Query.askForDouble("Enter number 3", scanner);
                numbers.add(response);

                average = Average.getAverage(numbers);

                validInput = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try Again.");
            }
        }

        System.out.println("The average is " + average);
    }
}
