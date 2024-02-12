package com.arnab.thread;

public class SingletonDoubleNullCheck {

    public static volatile SingletonDoubleNullCheck singletonDoubleNullCheck;

    private SingletonDoubleNullCheck(){}

    public static SingletonDoubleNullCheck getInstance() {


        if(singletonDoubleNullCheck == null) {
            //t2
            synchronized (SingletonDoubleNullCheck.class) {
                //t1
                if(singletonDoubleNullCheck == null) {
                    singletonDoubleNullCheck = new SingletonDoubleNullCheck();
                }
            }

        }

        return singletonDoubleNullCheck;
    }


}
