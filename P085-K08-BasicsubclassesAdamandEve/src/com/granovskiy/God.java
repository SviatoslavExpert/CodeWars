package com.granovskiy;

public class God {
    public static Human[] create(){
        Man man = new Man();
        Woman woman = new Woman();
        return new Human[] {man, woman};
    }
}

class Human {
}

class Man extends Human {
}

class Woman extends Human {
}


