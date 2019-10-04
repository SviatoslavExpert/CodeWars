package com.granovskiy;

import java.util.Collections;
import java.util.List;

public class Kata {
    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;
        //     return textbooks.stream()
        //                    .sorted(String.CASE_INSENSITIVE_ORDER)
        //                    .collect(toList());
    }
}
