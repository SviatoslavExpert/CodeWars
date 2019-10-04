package com.granovskiy;

public class Kata {
    public static String bmi(double weight, double height) {
        if (weight / (height * height) <= 18.5) return "Underweight";
        if (weight / (height * height) <= 25.0) return "Normal";
        if (weight / (height * height) <= 30.0) return "Overweight";
        return "Obese";
    }
}
