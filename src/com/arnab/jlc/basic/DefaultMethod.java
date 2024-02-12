package com.arnab.jlc.basic;

interface Demo1 {
    public default void print(){
        System.out.println("Default method called.");
    }
}
interface Demo2 {
    public default void print(){
        System.out.println("Default method called.");
    }
}

class DriverClass implements Demo1, Demo2 {

    @Override
    public void print() {
        Demo1.super.print();
    }
}

public class DefaultMethod {
}
