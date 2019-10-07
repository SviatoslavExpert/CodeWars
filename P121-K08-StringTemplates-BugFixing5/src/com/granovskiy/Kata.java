package com.granovskiy;

public class Kata {
    public static String buildString(String... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("I like ");
        for (String x : args) {
            sb.append(x + ", ");
        }
        String temp = sb.toString();
        String result = temp.substring(0, temp.length() - 2);
        if (args.length == 0) return result = temp.substring(0, temp.length() - 3) + "!";
        return result.trim() + "!";
    }
/*

    public static String buildString(String... args) {
        String answ = "I like ";
        for (int i = 0; i < args.length; i++) {
            if (i > 0)
                answ += ", ";
            answ += args[i];
        }
        return answ + "!";
    }
*/

    public static void main(String[] args) {
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
        System.out.println(buildString("Cheese", "Milk"));
        System.out.println(buildString("Chocolate"));
        System.out.println(buildString(""));
    }
}
