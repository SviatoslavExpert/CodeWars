package com.granovskiy;

public class Kata {
    public static String HQ9(char code) {
        if ('H' == code) return "Hello World!";
        if ('Q' == code) return Character.toString(code);
        StringBuffer sb = new StringBuffer();
        if ('9' == code) {
            for (int i = 99; i > 1; i--) {
                sb.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n");
                sb.append("Take one down and pass it around, ").append(i - 1);
                if (i - 1 == 1) {
                    sb.append(" bottle of beer on the wall.\n");
                } else {
                    sb.append(" bottles of beer on the wall.\n");
                }
            }
            sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
            sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n");
            sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
            sb.append("Go to the store and buy some more, 99 bottles of beer on the wall.");
            return sb.toString();
        }
        return null;
    }
}
