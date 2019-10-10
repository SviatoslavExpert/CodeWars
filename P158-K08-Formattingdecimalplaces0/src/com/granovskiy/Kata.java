package com.granovskiy;

public class Kata {
    public static double TwoDecimalPlaces(double number) {
        String stringValue = String.format("%.2f", number);
        double result = Double.parseDouble(stringValue);
        return result;
    }
}
