package arnab.thread.communicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TestWaitNotify {

    Object object = new Object();
    int count = 1;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture.runAsync(()-> System.out.println(""), executorService);
        int a = 10;
        CompletableFuture<Integer> completableFuture =  CompletableFuture.supplyAsync(()->a*a, executorService);
       // completableFuture.complete()


        TestWaitNotify testWaitNotify = new TestWaitNotify();
        Thread threadHi = new Thread(() -> {
            try {
                testWaitNotify.printHi();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread threadHello = new Thread(() -> {
            try {
                testWaitNotify.printHi();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        threadHi.setName("even");
        threadHi.setName("odd");

        threadHi.start();
        threadHello.start();

    }


    public synchronized void printHi() throws InterruptedException {
        while (count<=10)
        {
            if(count%2==0 && Thread.currentThread().getName().equals("even")) {
                synchronized (this){
                    System.out.println(count);
                    count++;
                    wait();

                }
            }
            if(count%2!=0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (this) {
                    System.out.println(count);
                    count++;
                    //wait();
                    notify();
                }
            }

        }
    }
}




