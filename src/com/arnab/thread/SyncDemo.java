package com.arnab.thread;

public class SyncDemo {

    public static void main(String[] args) {

        Display display = new Display();

        MyThread thread1 = new MyThread(display,"Dhoni");
        thread1.start();

        MyThread thread2 = new MyThread(display,"Yuvraj");
        thread2.start();
    }
}
