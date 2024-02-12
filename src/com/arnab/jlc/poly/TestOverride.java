package com.arnab.jlc.poly;

class X{
    void calculate(int a, int b){
        System.out.println("Class X");
    }
}

class Y extends X{
    void calculate(int a, int b){
        System.out.println("Class Y");
    }
}

class Z extends Y{
    void calculate(int a, int b){
        System.out.println("Class Z");
    }
}


public class TestOverride {
    public static void main(String[] args) {
        X x = new Y();
        x.calculate(1,2);

        Y y = (Y) x;// x is instance of Y so no issye in casting
        y.calculate(3,4);

        Z z = (Z)y; // y is instance of Y so can't cast to Z
        z.calculate(5,6);
    }
}
