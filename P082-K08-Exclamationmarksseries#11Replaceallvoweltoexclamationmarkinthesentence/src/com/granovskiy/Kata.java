package com.granovskiy;

public class Kata {
    public static String replace(final String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        char[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i < chars.length; i++) {
                if (s.toCharArray()[j] == chars[i]) {
                    stringBuilder.replace(j, j + 1, "!");
                }
            }
        }
        return stringBuilder.toString();
        //  return s.replaceAll("[aeiouAEIOU]", "!");
    }

    public static void main(String[] args) {
        System.out.println(replace("ABCDE"));
    }
}
