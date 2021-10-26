package com.mitchell.ian.Day6;

public class Q4Marks {
    public static void main(String[] args) {
        A studentA = new A(32.7, 45, 99);
        B studentB = new B(78, 89, 92, 68);

        System.out.printf("The average for Student A is %.2f.\n", studentA.getPercentage());
        System.out.printf("The average for Student B is %.2f.\n", studentB.getPercentage());
    }
}
