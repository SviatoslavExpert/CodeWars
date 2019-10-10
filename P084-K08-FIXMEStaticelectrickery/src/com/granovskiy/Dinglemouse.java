package com.granovskiy;

public class Dinglemouse {

    private static int ONE_HUNDRED = 100; // Declare this first!

    public static final Dinglemouse INST = new Dinglemouse();

    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
