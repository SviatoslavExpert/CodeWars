package com.granovskiy;

public class Kata {
    public static Integer calculateTip(double amount, String rating) {
        String ratingString = rating.toLowerCase();
        if (ratingString.equals("terrible")) return 0;
        if (ratingString.equals("poor")) return (int) Math.round(amount * 0.05);
        if (ratingString.equals("good")) return (int) Math.round(amount * 0.1);
        if (ratingString.equals("great")) return (int) Math.round(amount * 0.15);
        if (ratingString.equals("excellent"))  return (int) Math.round(amount * 0.2);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(calculateTip(30d, "poor"));
        System.out.println(calculateTip(20d, "Excellent"));
        System.out.println(calculateTip(20d, "hi"));
        System.out.println(calculateTip(107.65, "GReat"));
    }
}
