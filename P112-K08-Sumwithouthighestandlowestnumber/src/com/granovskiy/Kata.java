package com.granovskiy;

public class Kata {
    public static int sum(int[] numbers) {
        if (numbers.length == 0 || numbers.length == 1) return 0;
        int max = numbers[0];
        int min = numbers[0];
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) numbers[i] = 0;
            break;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) numbers[i] = 0;
            break;
        }
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
