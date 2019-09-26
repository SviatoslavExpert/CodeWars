package com.granovskiy;

import java.util.Arrays;

public class MonkeyCounter {
    private static int[] monkeyCount(final int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(12)));
    }
}
