package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -(array[i]);
        }
        return array;
        //  return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[] {-1,-2,-3,-4,-5})));
    }
}
