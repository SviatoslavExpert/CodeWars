package com.granovskiy;

public class Kata {
    public static String CalculateAge(int birth, int yearTo) {
        int result = Math.abs(yearTo - birth);
        if (yearTo - birth == 1) return "You are " + result + " year old.";
        if (yearTo - birth > 1) return "You are " + result + " years old.";
        if (yearTo == birth) return "You were born this very year!";
        if (birth - yearTo == 1) return "You will be born in " + result + " year.";
        if (birth - yearTo > 1) return "You will be born in " + result + " years.";
        return "Uknown info";
    }

    public static void main(String[] args) {
        System.out.println(CalculateAge(2012, 2016));
        System.out.println(CalculateAge(1989, 2016));
    }
}
