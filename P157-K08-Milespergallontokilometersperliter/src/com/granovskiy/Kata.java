package com.granovskiy;

public class Kata {
    private static final float LITER = 4.54609188f;
    private static final float KILOMETER = 1.609344f;

    public static float mpgToKPM(final float mpg) {
        return Float.parseFloat(String.format("%.2f", mpg * KILOMETER / LITER ));
    }
}
