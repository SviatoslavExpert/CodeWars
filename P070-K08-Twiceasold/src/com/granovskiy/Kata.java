package com.granovskiy;

public class Kata {
    public static int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs((dadYears - sonYears) * 2 - dadYears);
        //  return Math.abs((sonYears*2)-dadYears);
    }
}
