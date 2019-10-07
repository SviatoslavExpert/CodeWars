package com.granovskiy;

public class Kata {
    public int min(int[] list) {
        int minimum = list[0];
        for (int i = 0; i < list.length; i++) {
            if (minimum > list[i]) {
                minimum = list[i];
            }
        }
        return minimum;
    }

    public int max(int[] list) {
        int maximium = list[0];
        for (int i = 0; i < list.length; i++) {
            if (maximium < list[i]) {
                maximium = list[i];
            }
        }
        return maximium;
        //  return Arrays.stream(list).min().getAsInt();
        //  return Arrays.stream(list).max().getAsInt();
    }
}
