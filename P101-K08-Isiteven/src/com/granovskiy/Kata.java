package com.granovskiy;

public class Kata {
    public static boolean isEven(double n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(2));
    }
}
