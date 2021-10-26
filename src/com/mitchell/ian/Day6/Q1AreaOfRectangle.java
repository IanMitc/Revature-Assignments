package com.mitchell.ian.Day6;

public class Q1AreaOfRectangle {
    public static void main(String[] args) {
        double width;
        double length;
        double area = 0;
        Rectangle rectangle;
        boolean validInput = false;

        while (!validInput) {
            try {
                width = Query.askForDouble("Enter the width of the Rectangle");
                length = Query.askForDouble("Enter the length of the Rectangle");

                rectangle = new Rectangle(width, length);
                area = rectangle.getArea();

                validInput = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try Again.");
            }
        }

        System.out.println("The approximate area of the rectangle is " + (int) area);

    }
}
