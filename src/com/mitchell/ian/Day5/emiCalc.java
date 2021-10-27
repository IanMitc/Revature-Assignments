package com.mitchell.ian.Day5;

import java.util.Scanner;

public class emiCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double loanAmount;
        double interest;
        int tenure;

        System.out.print("Enter Loan Amount: ");
        loanAmount = scanner.nextDouble();
        System.out.print("Enter Interest Rate: ");
        interest = scanner.nextDouble();
        System.out.print("Enter Tenure: ");
        tenure = scanner.nextInt();

        System.out.printf("EMI: %.2f", calculateEMI(loanAmount, interest, tenure));
        scanner.close();
    }

    private static double calculateEMI(double loanAmount, double interest, int tenure) {
        // Change Annual Percentage rate to a monthly decimal rate
        double monthlyInterest = interest / 1200;
        return loanAmount * monthlyInterest * Math.pow(1 + monthlyInterest, tenure) / (Math.pow(1 + monthlyInterest, tenure) - 1);
    }
}
