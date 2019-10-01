package com.granovskiy;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String result = "";
        int k = nb_petals - (int)(Math.floor(nb_petals / 6)) * 6;
        if (k == 1) result = "I love you";
        if (k == 2) result = "a little";
        if (k == 3) result = "a lot";
        if (k == 4) result = "passionately";
        if (k == 5) result = "madly";
        if (k == 6 || k % 6 == 0) result = "not at all";
        return result;
        //      String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
        //      return arr[nb_petals%6];
    }

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(552));
    }
}
