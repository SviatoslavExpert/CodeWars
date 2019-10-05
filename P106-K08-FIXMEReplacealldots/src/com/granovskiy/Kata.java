package com.granovskiy;

public class Kata {
    public static String replaceDots(final String str) {
        return str.replaceAll("[.]", "-");
    }

    public static void main(String[] args) {
        System.out.println(replaceDots("one.two.three"));
    }
}
