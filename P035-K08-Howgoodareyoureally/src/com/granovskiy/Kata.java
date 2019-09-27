package com.granovskiy;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int e : classPoints) {
            sum += e;
        }
        sum += yourPoints;
        sum = sum / (classPoints.length + 1);
        return yourPoints > sum;
        // return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{2, 3}, 5));
    }
}
