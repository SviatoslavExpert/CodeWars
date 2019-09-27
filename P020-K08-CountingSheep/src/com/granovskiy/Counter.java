package com.granovskiy;

/*
Consider an array of sheep where some sheep may be missing
        from their place. We need a function that counts
        the number of sheep present in the array
        (true means present).
*/
public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean e : arrayOfSheeps) {
            if (e != null && e) {
                counter++;
            }
        }
        return counter;
    }
}
