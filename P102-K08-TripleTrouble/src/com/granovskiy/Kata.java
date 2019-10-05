package com.granovskiy;

public class Kata {
    public static String tripleTrouble(String one, String two, String three) {
        String[] arrayOne = one.split("");
        String[] arrayTwo = two.split("");
        String[] arrayThree = three.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayOne.length; i++) {
            sb.append(arrayOne[i]);
            sb.append(arrayTwo[i]);
            sb.append(arrayThree[i]);
        }
        return sb.toString();
    }
/*
    StringBuilder sb = new StringBuilder(s1.length()*3);
    for (int i=0; i<s1.length(); i++) {
        sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
    }
    return sb.toString();
*/

    public static void main(String[] args) {
        System.out.println(tripleTrouble("love", "swim", "here"));
    }
}
