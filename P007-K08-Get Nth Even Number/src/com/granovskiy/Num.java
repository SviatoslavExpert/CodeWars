package com.granovskiy;

public class Num {
    private static int nthEven(int n) {
        int count = 0;
        int i = 0;
        while(i < n) {
            i++;
            count += 2;
        }
        return count - 2;
    }

    public static void main(String[] args) {
        System.out.println(nthEven(1298734));
    }
}
