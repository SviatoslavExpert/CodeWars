package com.granovskiy;

public class Kata {
    public static int[] digitize(long n) {
        String string = Long.toString(n);
        int size = string.length();
        String[] strings = string.split("");
        int [] ints = new int [size];
        for(int i=0; i< size; i++) {
            ints[size - 1 - i] = Integer.parseInt(strings[i]);
        }
        return ints;
/*        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
*/
    }

    public static void main(String[] args) {
        digitize(2087682542985L);
    }
}
