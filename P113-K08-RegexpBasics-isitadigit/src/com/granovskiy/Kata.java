package com.granovskiy;

public class Kata {
    public static boolean isDigit(String s) {
        int number = 0;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return number >= 0 && number <= 9;
        //  return s.matches("[0-9]");
    }
}
