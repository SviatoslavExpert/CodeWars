package com.granovskiy;

public class Kata {
    public static int noBoringZeros(int n) {
        if (n == 0) return n;
        while (n % 10 == 0) {
            n = n / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(14500));
    }
}
