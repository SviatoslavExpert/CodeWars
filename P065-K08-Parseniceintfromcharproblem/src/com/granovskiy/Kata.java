package com.granovskiy;

public class Kata {
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
        //  return Character.getNumericValue(herOld.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }
}
