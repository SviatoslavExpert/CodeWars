package com.granovskiy;

public class Solution {
    public static boolean check(Object[] a, Object x) {
        for (Object e : a) {
            if (e.equals(x)) return true;
        }
        return false;
        // return Arrays.asList(a).contains(x);
    }
}
