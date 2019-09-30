package com.granovskiy;

public class Kata {
    public static String fakeBin(String numberString) {
        char[] chars = numberString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.getNumericValue(chars[i]) < 5) chars[i] = '0';
            if (Character.getNumericValue(chars[i]) >= 5) chars[i] = '1';
        }
        return new String(chars);
        //  return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("8510476510456"));
    }
}
