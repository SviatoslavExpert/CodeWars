package com.granovskiy;

public class Kata {
    public static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
        //  return  n*(n+1)/2;
        //  return IntStream.rangeClosed(1,n).sum();
    }
}
