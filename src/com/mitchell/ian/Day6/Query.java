package com.mitchell.ian.Day6;

import java.util.Scanner;

public class Query {
    static public int askForInt(String question, Scanner scanner) throws Exception {
        System.out.print(question + ": ");
        if (!scanner.hasNextInt()) {
            scanner.next();
            throw new Exception("Please Enter a valid Integer");
        }
        return scanner.nextInt();
    }

    static public double askForDouble(String question, Scanner scanner) throws Exception {
        System.out.print(question + ": ");
        if (!scanner.hasNextDouble()) {
            scanner.next();
            throw new Exception("Please Enter a valid Number");
        }
        return scanner.nextDouble();
    }

    static public String askForString(String question, Scanner scanner) throws Exception {
        System.out.print(question + ": ");
        if (!scanner.hasNextLine()) {
            scanner.next();
            throw new Exception("Please Enter a valid input");
        }
        return scanner.nextLine();
    }
}
