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
/*
        if("Terrible".equalsIgnoreCase(rating))   return 0;
        if("Poor".equalsIgnoreCase(rating))       return (int)Math.ceil(0.05*amount);
        if("Good".equalsIgnoreCase(rating))       return (int)Math.ceil(0.10*amount);
        if("Great".equalsIgnoreCase(rating))      return (int)Math.ceil(0.15*amount);
        if("Excellent".equalsIgnoreCase(rating))  return (int)Math.ceil(0.20*amount);
        return null;
*/
    }

    public static void main(String[] args) {
        System.out.println(calculateTip(30d, "poor"));
        System.out.println(calculateTip(20d, "Excellent"));
        System.out.println(calculateTip(20d, "hi"));
        System.out.println(calculateTip(107.65, "GReat"));
    }
}
