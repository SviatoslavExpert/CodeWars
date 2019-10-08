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
    };

    public static void main(String[] args) {
        System.out.println(whatIs(42));
        System.out.println(whatIs(42 * 42));
    }
}
