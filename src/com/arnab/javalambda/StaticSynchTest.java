package com.arnab.javalambda;

public class StaticSynchTest {

    public static void main(String[] args) {

        StaticSynchTest synchTest = new StaticSynchTest();
        for(int i =0; i<20; i++ ) {

            Thread thread = new Thread(() -> {
                try {
                    synchTest.nonstaticmethod();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.setName("Arnab_nonstatic__"+i);
            thread.start();

            Thread thread2 = new Thread(() -> {
                try {
                    StaticSynchTest.staticmethod();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread2.setName("Arnab_static__"+i);
            thread2.start();
        }


    }


    public static void staticmethod() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("staticmethod");
        System.out.println("Thread name =========  :"+Thread.currentThread().getName());
    }

    public  synchronized void nonstaticmethod() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("nonstaticmethod");
        System.out.println("Thread name =========  :"+Thread.currentThread().getName());
    }

}
