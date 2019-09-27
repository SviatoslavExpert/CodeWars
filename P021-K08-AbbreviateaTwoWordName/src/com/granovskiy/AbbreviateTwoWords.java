package com.granovskiy;

/*
Write a function to convert a name into initials.
This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot seperating them.
It should look like this:
Sam Harris => S.H
*/
public class AbbreviateTwoWords {
    private static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) +"." + names[1].charAt(0)).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("P Favuzzi"));
    }
}
