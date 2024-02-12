package com.arnab.thread.communicate;

public class OddEvenBasicThread {


    public static void main(String[] args) {

        OddEvenBasicThread basicThread = new OddEvenBasicThread(10);

        new Thread(()-> basicThread.oddPrinter(), "ODD THREAD").start();
        new Thread(()-> basicThread.oddPrinter(), "ODD THREAD").start();
        new Thread(()-> basicThread.evenPrinter(), "EVEN THREAD").start();


    }

    private int maxCount;
    private int count =0;

    public OddEvenBasicThread(int maxCount) {
        this.maxCount = maxCount;
    }

    public synchronized void oddPrinter()  {
        while(count<=maxCount) {
            if(count%2==0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName()+" "+count);
            count++;
            notify();
        }
    }

    public synchronized void evenPrinter()  {
        while (count<=maxCount){
            if(count%2!=0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName()+" "+count);
            count++;
            notify();
        }
    }

}
