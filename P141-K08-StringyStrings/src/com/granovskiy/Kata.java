package com.granovskiy;

public class Kata {
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sb.append("1");
            }
            if (i % 2 != 0) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringy(18));
    }
}
