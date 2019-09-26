package com.granovskiy;

public class Kata {
    public static int[] getSize(int w, int h, int d) {
        int[] array = {2 * w * d + 2 * d * h + 2 * w * h, w * d * h};
        return array;
        //  return new int[] {2*(w*h + h*d + d*w), w*h*d};
    }
}
