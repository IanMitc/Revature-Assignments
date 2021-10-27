package com.mitchell.ian.Day5;

import java.util.Scanner;

class Calculator {
    static public double calculate(double firstNumber, double secondNumber, int action) {
        switch (action) {
            case 1:
                return (firstNumber + secondNumber);
            case 2:
                return (firstNumber - secondNumber);
            case 3:
                return (firstNumber * secondNumber);
            case 4:
                return (firstNumber / secondNumber);
        }

        return Double.NaN;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        int action;

        System.out.print("Enter First Number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        secondNumber = scanner.nextDouble();
        System.out.println("Select Option:\n" +
                "1 - Add\n" +
                "2 - Subtract\n" +
                "3 - Multiple\n" +
                "4 - Divide");
        action = scanner.nextInt();

        System.out.print("Result: " + Calculator.calculate(firstNumber, secondNumber, action));
        scanner.close();
    }
}
