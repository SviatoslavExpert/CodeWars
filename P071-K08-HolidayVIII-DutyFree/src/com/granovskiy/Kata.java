package com.granovskiy;

public class Kata {
    public static int dutyFree(int normPrice, int discount, int hol) {
        double x = normPrice * discount;
        double y = hol;
        return (int)(y / (x / 100));
        //  return hol*100/(normPrice*discount);
    }

    public static void main(String[] args) {
        System.out.println(dutyFree(17,10,500));
    }
}
