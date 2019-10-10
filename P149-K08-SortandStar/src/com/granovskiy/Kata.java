package com.granovskiy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String twoSort(String[] s) {
        String result = "";
        List<String> list = new ArrayList<String>();
        for (String e : s) {
            list.add(e);
        }
        Collections.sort(list);
        result = list.get(0).replace("", "***");
        result = result.substring(3, result.length() - 3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(twoSort(new String[]
                {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }
}
