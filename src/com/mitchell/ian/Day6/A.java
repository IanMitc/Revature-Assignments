package com.mitchell.ian.Day6;

import java.util.ArrayList;
import java.util.List;

public class A extends Marks {
    List<Double> grades = new ArrayList<>();

    public A(double firstGrade, double secondGrade, double thirdGrade) {
        grades.add(firstGrade);
        grades.add(secondGrade);
        grades.add(thirdGrade);
    }


    @Override
    public double getPercentage() {
        return Average.getAverage(grades);
    }
}
