package com.granovskiy;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Kata {
/*    public static List<String> sort(List<String> textbooks) {
        textbooks.replaceAll(String::toLowerCase);
        Collections.sort(textbooks);
        return textbooks;
    }
*/

    public static List<String> sort(List<String> textbooks) {
        //textbooks.replaceAll(String::toLowerCase);
        for (String word : textbooks) {
            word = word.toLowerCase();
        }
        Collections.sort(textbooks);
        return textbooks;
    }
}
