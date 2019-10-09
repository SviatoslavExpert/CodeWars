package com.granovskiy;

public class Kata {
    public static String smash(String... words) {
        StringBuilder builder = new StringBuilder();
        for (String e : words) {
            builder.append(e + " ");
        }
        return builder.toString().trim();
        // return String.join(" ", words);
    }
}
