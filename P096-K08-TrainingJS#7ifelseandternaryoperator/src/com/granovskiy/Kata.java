package com.granovskiy;

public class Kata {
    public static int saleHotdogs(final int n) {
        return n < 5 ? 100 * n : (n >= 5 && n < 10) ? 95 * n : n >= 10 ? 90 * n : 90 * n;
        //  return ( n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90 ) * n;
    }
}
