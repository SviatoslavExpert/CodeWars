package com.granovskiy;

public class Kata {
    public static int findAverage(int[] nums) {
        int sum = 0;
        for (int e : nums) {
            sum += e;
        }
        return sum / nums.length;
    }
}
