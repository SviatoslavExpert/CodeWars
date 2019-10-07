package com.granovskiy;

public class Kata {
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
        //  return Stream.of(str.split(" ")).mapToInt(s -> s.length()).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findLongest("The quick white fox jumped around the massive dog"));
    }
}
