package com.granovskiy;

public class Kata {
    public static String[] kataExampleTwist() {
        int n = 1000;
        String[] websites = new String[n];
        for (int i = 0; i < n; i++) {
            websites[i] = "codewars";
        }
        return websites;
        // Arrays.fill(websites,"codewars");
    }
}
