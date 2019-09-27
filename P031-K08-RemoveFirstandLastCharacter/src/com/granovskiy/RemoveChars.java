package com.granovskiy;

public class RemoveChars {
    public static String remove(String str) {
        char[] chars = str.toCharArray();
        char[] charsNew = new char [chars.length - 2];
        for (int i = 0; i < charsNew.length; i++) {
            charsNew[i] = chars[i + 1];
        }
        return String.copyValueOf(charsNew);
        //return str.substring(1, str.length() - 1);
    }
}
