package com.granovskiy;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().charAt(0) == 'r'
                ? name + " plays banjo"
                : name + " does not play banjo";
    }

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Romeo"));
    }
}
