package com.granovskiy;

import java.util.Arrays;

public class Kata {
    public static String remove(String s, int n){

        String result = "";
        int count = 0;
        int size = s.length();
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i <= size; i++) {
            if (builder.charAt(i) == '!' && count <= n) {
                builder = builder.deleteCharAt(i);
                count++;
                //size--;
            }
        }
        return String.valueOf(builder);
    }

    public static void main(String[] args) {
        System.out.println(remove("Hi!!!", 100));
    }
}
