package com.granovskiy;

public class Kata {
    public static double find_average(int[] array){
        double result = 0.0;
        for (int e : array) {
            result += e;
        }
        return result / array.length;
    }
}
