package com.arnab.revise;

public class Sum2Num {
    public static void main(String[] args) {



        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);

        int temp =0;
        temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

        int x =10;
        int y = 100;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println(x+"  "+y);




    }
}
