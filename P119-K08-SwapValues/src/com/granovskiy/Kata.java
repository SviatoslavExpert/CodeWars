package com.granovskiy;

public class Kata {
    public Object[] arguments = new Object[2];

    public void Swapper(final Object[] args){
        arguments[0] = args[0];
        arguments[1] = args[1];
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}
