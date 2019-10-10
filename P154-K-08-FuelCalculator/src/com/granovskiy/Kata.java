package com.granovskiy;

public class Kata {
    public static double fuelPrice(int litres, double pricePerLiter) {
        if (litres < 12) return litres * (pricePerLiter - litres / 2 * 0.05);
        return litres * (pricePerLiter - 0.25);
    }
}
