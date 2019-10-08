package com.granovskiy;

public class Kata {
    public static String slope(int[] points) {
        int result = 0;
        try {
            result = (points[3] - points[1]) / (points[2] - points[0]);
        } catch (ArithmeticException e) {
            return "undefined";
        }
        return String.valueOf(result);
/*      int rise = points[1] - points[3];
        int run = points[0] - points[2];
        return run == 0 ? "undefined" : String.valueOf(rise/run);
*/
    }

    public static void main(String[] args) {
        System.out.println(slope(new int[]{19, 3, 20, 3}));
        System.out.println(slope(new int[]{-7, 2, -7, 4}));
        System.out.println(slope(new int[]{10, 50, 30, 150}));
        System.out.println(slope(new int[]{15, 45, 12, 60}));
        System.out.println(slope(new int[]{10, 20, 20, 80}));
        System.out.println(slope(new int[]{-10, 6, -10, 3}));
    }
}
