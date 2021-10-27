package com.mitchell.ian.Day6;

import java.util.Scanner;

public class Q2Hello {
    public static void main(String[] args) {
        String name = "";
        int rollId = 0;
        String interests = "";
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            try {
                name = Query.askForString("Enter your name", scanner);
                rollId = Query.askForInt("Enter your roll ID", scanner);
                interests = Query.askForString("Enter your interests", scanner);
                validInput = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try Again.");
            }
        }

        System.out.println("Hey, my name is " + name
                + " and my roll number is " + rollId
                + ". My field of interest are " + interests
                + ".");
    }
}
