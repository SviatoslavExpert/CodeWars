package com.granovskiy;

public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            result += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result += arr2[i];
        }
        return result;
    }
    //  return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    //  return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
}
