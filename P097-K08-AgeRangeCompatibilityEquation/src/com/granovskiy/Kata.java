package com.granovskiy;

public class Kata {
    public static String datingRange(int age) {
        int min;
        int max;
        if (age < 15) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        } else {
            min = (int) ((age / 2) + 7);
            max = (int) ((age - 7) * 2);
        }
        return min + "-" + max;
    }

    public static void main(String[] args) {
        System.out.println(datingRange(17));
    }
}
