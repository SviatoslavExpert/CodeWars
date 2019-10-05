package com.granovskiy;

public class Kata {
    public static Integer calculateTip(double amount, String rating) {
        String s = rating.toLowerCase();
        if (s.equals("terrible")) return 0;
        if (s.equals("poor")) return (int) Math.ceil(amount * 0.05);
        if (s.equals("good")) return (int) Math.ceil(amount * 0.1);
        if (s.equals("great")) return (int) Math.ceil(amount * 0.15);
        if (s.equals("excellent"))  return (int) Math.ceil(amount * 0.2);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(calculateTip(30d, "poor"));
        System.out.println(calculateTip(20d, "Excellent"));
        System.out.println(calculateTip(20d, "hi"));
        System.out.println(calculateTip(107.65, "GReat"));
    }
}
