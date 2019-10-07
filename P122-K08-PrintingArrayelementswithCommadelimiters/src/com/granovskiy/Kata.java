package com.granovskiy;

public class Kata {
    public static String printArray(Object[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(",");
            sb.append(array[i]);
        }
        return sb.toString();
        //  return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
