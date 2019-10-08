package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int lastNumber = numbers[numbers.length - 1];
        int firstNumber = numbers[0];
        int[] array = new int[lastNumber - firstNumber + 1];
        for (int i = 0; i <= (lastNumber - firstNumber); i++) {
            array[i] = firstNumber + i;
        }
        System.out.println(Arrays.toString(array));
        return array;
        //  return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }

    public static void main(String[] args) {
        pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9});
        pipeFix(new int[]{1, 2, 3, 12});
        pipeFix(new int[]{6, 9});
        pipeFix(new int[]{-1, 4});
        pipeFix(new int[]{1, 2, 3});
    }
}
