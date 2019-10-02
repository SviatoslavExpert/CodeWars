package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
/*        int s = 1;
        int k = 0;
        do {
            s += 2;
        } while(s < 100);
        System.out.print("s= "+s);*/

/*        int s = 1;
        for(int i = 5; i > 0; i--) {
            s += i;
            if(i != 0) { break; } }
        System.out.print("s = " + s);*/

        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a == true) {
            if (b == true) {
                if (c == true) {
                    System.out.println("1");
                } else System.out.println("2");
            } else if (a && (b = c)) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        }
    }
}
