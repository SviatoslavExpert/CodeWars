package com.granovskiy;

public class Kata {
    public static String sayHello(String[] name, String city, String state) {
        if (name.length == 2)
            return "Hello, " + name[0] + " " + name[1] + "! " + "Welcome to " + city + ", " + state + "!";
        if (name.length == 3)
            return "Hello, " + name[0] + " " + name[1] + " " + name[2] + "! " + "Welcome to " + city + ", "
                    + state + "!";
        return "";
        // return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
    }

    public static void main(String[] args) {
        System.out.println(sayHello(new String[] {"Mike", "Wilson"}, "Boston" , "Massachusetts"));

    }
}
