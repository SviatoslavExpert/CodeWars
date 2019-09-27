package com.granovskiy;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[0];
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) counter++;
            if (input[i] < 0) sum += input[i];
        }
        if (counter != 0 && sum != 0) {
            int[] result2 = new int[2];
            result2[0] = counter;
            result2[1] = sum;
            return result2;
        }
        return result;
    }
}
