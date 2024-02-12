package com.arnab.javatechie.java8interview;

public class CreateThread extends Thread {

    public void run() {
        System.out.println("thread running....");
    }

    public static void main(String[] args) {

        Thread thread = new CreateThread();
        thread.run();
    }

}

