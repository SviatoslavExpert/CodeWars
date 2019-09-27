package com.granovskiy;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int minimum = args[0];
        for (int e : args) {
            if (minimum > e) {
                minimum = e;
            }
        }
        return minimum;
    }
}
