package com.granovskiy;

public class Kata {
    public int pythagoreanTriple(int[] triple) {
        int max = Math.max(Math.max(triple[0], triple[1]), triple[2]);
        if (triple[0] == max) {
            if (Math.pow(triple[0], 2) == Math.pow(triple[1], 2) + Math.pow(triple[2], 2)) return 1;
        }
        if (triple[1] == max) {
            if (Math.pow(triple[1], 2) == Math.pow(triple[0], 2) + Math.pow(triple[2], 2)) return 1;
        }
        if (triple[2] == max) {
            if (Math.pow(triple[2], 2) == Math.pow(triple[0], 2) + Math.pow(triple[1], 2)) return 1;
        }
        return 0;
    }

/*    int a = triple[0] * triple[0];
    int b = triple[1] * triple[1];
    int c = triple[2] * triple[2];
    return ((a + b == c) || (a + c == b) || (b + c == a)) ? 1 : 0;*/
}
