package com.granovskiy;

public class Kata {
    public static String updateLight(String current) {
        if (current == "red") return "green";
        if (current == "green") return "yellow";
        return "red";
    }
}
