package com.granovskiy;

public class Kata {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return (String)p[1];
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
            {123, "Cool"},
            {123456789, "extreme"},
    };

    public static void main(String[] args) {
        System.out.println(whatIs(42));
        System.out.println(whatIs(42 * 42));
        System.out.println(whatIs(123));
        System.out.println(whatIs(123456789));
    }
}
