package com.granovskiy;

public class Kata {
    public static String repeatString(final Object toRepeat, final int n) {
        StringBuilder sb = new StringBuilder();
        if (toRepeat instanceof String) {
            for (int i = 0; i < n; i++) {
                sb.append(toRepeat);
            }
            return sb.toString();
        }
        return "Not a string";
    }

    public static void main(String[] args) {
        System.out.println(repeatString("Hello ", 5));
    }
}
