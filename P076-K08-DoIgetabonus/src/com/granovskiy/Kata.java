package com.granovskiy;

public class Kata {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus) return"£" + salary * 10;
        return "£" + salary;
        // return "\u00A3" + (bonus ? 10 : 1) * salary;
    }
}
