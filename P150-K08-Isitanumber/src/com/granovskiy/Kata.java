package com.granovskiy;

public class Kata {
    public boolean isDigit(String s) {
        boolean result1 = false;
        boolean result2 = false;
        try {
            Integer.parseInt(s);
            result1 = true;
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a valid integer number");
        }
        try {
            Float.parseFloat(s);
            result2 = true;
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a valid float number");
        }
        return result1 || result2;
    }
}
