package com.granovskiy;

/*
Character recognition software is widely used to digitise printed texts.
Thus the texts can be edited, searched and stored on a computer.
When documents (especially pretty old ones written with a typewriter),
are digitised character recognition softwares often make mistakes.
S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake.
*/
public class Correct {
    public static String correct(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '5') {
                chars[i] = 'S';
            }
            if (chars[i] == '0') {
                chars[i] = 'O';
            }
            if (chars[i] == '1') {
                chars[i] = 'I';
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
    }
}
