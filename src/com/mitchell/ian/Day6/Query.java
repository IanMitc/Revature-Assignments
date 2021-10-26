package com.mitchell.ian.Day6;

import java.util.Scanner;

public class Query {
    static public int askForInt(String question) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print(question + ": ");
        if(!scanner.hasNextInt())
            throw new Exception("Please Enter a valid Integer");
        return scanner.nextInt();
    }

    static public double askForDouble(String question) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question + ": ");
        if(!scanner.hasNextDouble())
            throw new Exception("Please Enter a valid Number");
        return scanner.nextDouble();
    }

    static public String askForString(String question) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question + ": ");
        if(!scanner.hasNextLine())
            throw new Exception("Please Enter a valid input");
        return scanner.nextLine();
    }
}
