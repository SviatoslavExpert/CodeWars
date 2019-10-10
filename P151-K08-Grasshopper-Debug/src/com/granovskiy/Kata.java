package com.granovskiy;

public class Kata {
    public static String weatherInfo(int temp) {
        double c = (temp - 32) * 5.0 / 9;
        if (c > 0) {
            return String.format("%s is above freezing temperature", c);
        } else {
            return String.format("%s is freezing temperature", c);
        }
    }
}
