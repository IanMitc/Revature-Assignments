package com.mitchell.ian.Day6;

import java.util.ArrayList;
import java.util.List;

public class B extends Marks {
    List<Double> grades = new ArrayList<>();

    public B(double firstGrade, double secondGrade, double thirdGrade, double fourthGrade) {
        grades.add(firstGrade);
        grades.add(secondGrade);
        grades.add(thirdGrade);
        grades.add(fourthGrade);
    }

    @Override
    public double getPercentage() {
        return Average.getAverage(grades);
    }
}
