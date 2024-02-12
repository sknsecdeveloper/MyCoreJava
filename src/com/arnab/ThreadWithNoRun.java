package com.arnab;

public class ThreadWithNoRun extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ThreadWithNoRun noRun = new ThreadWithNoRun();
        noRun.startProcessing();






    }

    public void startProcessing(){
        ThreadWithNoRun withNoRun =new ThreadWithNoRun();

        Thread thread1 = new Thread(() -> {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                withNoRun.process();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }


    public void process() throws InterruptedException {
        wait();
    }
}
