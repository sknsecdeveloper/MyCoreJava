package com.arnab.thread;

public class Display {

    public synchronized void wish(String name) {


        for(int i=0; i<10; i++) {
            System.out.print("good morning : ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}
