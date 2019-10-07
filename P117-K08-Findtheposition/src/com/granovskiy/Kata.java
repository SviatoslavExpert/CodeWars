package com.granovskiy;

public class Kata {
    public static String position(char alphabet) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == alphabet) {
                result = i + 1;
            }
        }
        return "Position of alphabet: " + result;
    }
}
