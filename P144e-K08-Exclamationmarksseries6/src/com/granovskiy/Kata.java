package com.granovskiy;

public class Kata {
    public static String remove(String s, int n) {
        for (int i = 0; i < n; i++)
            s = s.replaceFirst("!", "");
        return s;
    }

    public static void main(String[] args) {
        System.out.println(remove("Hi!", 1));
        System.out.println(remove("Hi!", 100));
        System.out.println(remove("Hi!!!", 1));
        System.out.println(remove("Hi!!!", 100));
        System.out.println(remove("!Hi", 1));
        System.out.println(remove("Hi!!!", 1));
    }
}
