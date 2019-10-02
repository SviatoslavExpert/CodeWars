package com.granovskiy;

public class Kata {
    public static String toAlternativeString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                stringBuilder.append(Character.toLowerCase(string.charAt(i)));
            }
            if (Character.isLowerCase(string.charAt(i))) {
                stringBuilder.append(Character.toUpperCase(string.charAt(i)));
            }
            if (string.charAt(i) == ' ') {
                stringBuilder.append(' ');
            }
            if (string.charAt(i) == '<') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == '=') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == '>') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == '.') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == ',') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == '?') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == ':') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == '!') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == ';') {
                stringBuilder.append(string.charAt(i));
            }
            if (string.charAt(i) == '/') {
                stringBuilder.append(string.charAt(i));
            }
            if (Character.isDigit(string.charAt(i))) {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("123"));
    }
}
