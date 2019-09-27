package com.granovskiy;

public class Bob {
    public static int enough(int cap, int on, int wait){
        int result = 0;
        if (cap - on - wait == 0) {
            return result;
        }
        if (cap - on < wait) {
            result = Math.abs(cap - on - wait);
        }
        return result;
        //  return Math.max(0, wait + on - cap);
    }

    public static void main(String[] args) {
        System.out.println(enough(100, 60, 50));
    }
}
