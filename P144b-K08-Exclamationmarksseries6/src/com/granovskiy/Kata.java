package com.granovskiy;

public class Kata {
    public static String remove(String s, int n) {
        String result = "";
        int count = 0;
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
/*                if (s.charAt(i) == '!' && count <= n) {
                    builder.deleteCharAt(i);
                    //result = String.valueOf();
                    count++;
                }*/
            System.out.println("Hello");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("!Hi", 1));
    }
}
