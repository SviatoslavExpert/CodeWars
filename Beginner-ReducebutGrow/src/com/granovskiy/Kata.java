package com.granovskiy;

import java.util.stream.IntStream;

public class Kata {
    public static int grow(int[] x){
        int result = 1;
        for (int e : x) {
            result *= e;
        }
        return result;
    }
    //  return IntStream.of(x).reduce(1, (a, b) -> a * b);
    //  return Arrays.stream(x).reduce(1 ,(a, b) -> a * b);

    public static void main(String[] args) {
        grow(new int[] {2,3,4});
    }
}
