package com.granovskiy;

public class Kata {
    public static String[] fixTheMeerkat(String[] arr) {
        String tmp = arr[0];
        arr[0] = arr[2];
        arr[2] = tmp;
        return arr;
        // return new String[] {arr[2], arr[1], arr[0]};
    }
}
