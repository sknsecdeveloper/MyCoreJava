package com.arnab.override;

public class Child1 extends Parent1{

    @Override
    public Integer add(int a, int b) throws RuntimeException {
       Integer integer = a+b;
       return integer;
    }
}
