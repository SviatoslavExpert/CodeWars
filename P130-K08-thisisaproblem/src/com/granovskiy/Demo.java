package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        NameMe nameMe = new NameMe("John", "Doe");
        System.out.println(nameMe.getFirstName());
        System.out.println(nameMe.getLastName());
        System.out.println(nameMe.getFullName());
    }
}
