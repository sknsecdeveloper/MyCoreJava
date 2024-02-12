package com.arnab;

public class Test {

     final int y = 22;


    public static void main(String[] args) {



      // new MemoryInit();

       // System.out.println(MemoryInit.a);
        //MemoryInit.m1Static();

        final int count = 10;
        //System.out.println(count);

        //System.out.println(new Test().y);

        Test test = new Test();
        test.print();






    }

    public void print(){
        //System.out.println(new Test().y);
        Test test = new Test();
        //test.y = 30;

        System.out.println(test.y);


    }
}
