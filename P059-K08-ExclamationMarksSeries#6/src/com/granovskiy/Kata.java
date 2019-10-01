package com.granovskiy;

public class Kata {
    private static String remove(String s, int n){
        String result = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!' && count <= n) {
                result += s.replace("!", "");
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(remove("Hi!", 100));
    }
}
