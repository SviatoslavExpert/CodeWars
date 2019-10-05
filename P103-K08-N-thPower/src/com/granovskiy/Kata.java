package com.granovskiy;

public class Kata {
    public static int nthPower(int[] array, int n) {
        return array.length > n ? (int) Math.pow(array[n], n) : -1;
    }

    public static void main(String[] args) {
        System.out.println(nthPower(new int[] {1,2}, 2));
        System.out.println(nthPower(new int[] {3,1,2,2}, 3));
        System.out.println(nthPower(new int[] {3,1,2}, 2));
    }
}
