package com.granovskiy;

public class Positive {
    public static int sum(int[] arr){
        int result = 0;
        for (int e : arr) {
            if (e > 0) {
                result += e;
            }
        }
        return result;
        //  return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}
