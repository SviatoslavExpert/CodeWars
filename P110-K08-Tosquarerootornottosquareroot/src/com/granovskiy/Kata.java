package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[] { 4, 3, 9, 7, 2, 1 })));
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[] { 100, 101, 5, 5, 1, 1 })));
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[] { 1, 2, 3, 4, 5, 6 })));
    }
}
