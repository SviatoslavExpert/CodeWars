package com.granovskiy;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sBuilder.append(string);
        }
        return sBuilder.toString();
    }
}
