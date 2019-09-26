package com.granovskiy;

public class Kata {
    public static String integrate(int coefficient, int exponent) {
        return Integer.toString(coefficient / ++exponent) + "x^" + Integer.toString(exponent);
    }
}
