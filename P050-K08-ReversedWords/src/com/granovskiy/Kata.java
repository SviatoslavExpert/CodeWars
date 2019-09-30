package com.granovskiy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String reverseWords(String str){
        String result = "";
        String[] strings = str.split(" ", 6);
        for (int i = 0; i < strings.length; i++) {
            result += strings[strings.length - 1 - i]  + " ";
        }
        result = result.trim();
        return result;
/*
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
*/
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The world is nice"));
    }
}
