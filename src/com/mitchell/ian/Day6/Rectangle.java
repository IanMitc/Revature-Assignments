package com.mitchell.ian.Day6;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) throws Exception {
        if (width <= 0 || length <= 0)
            throw new Exception("A Rectangles Sides Can Not Be 0 or less.");

        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }
}
