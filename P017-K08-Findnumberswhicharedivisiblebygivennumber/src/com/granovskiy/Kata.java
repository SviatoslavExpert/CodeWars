package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                counter++;
            }
        }
        int[] array = new int[counter];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0 && array[j] == 0) {
                array[j] = numbers[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        int[] someArray = {0,1,2,3,4,5,6};
        divisibleBy(someArray,4);
    }
}
/*
return Arrays.stream(numbers)
        .filter(i -> (i % divider) == 0)
        .toArray();
*/
