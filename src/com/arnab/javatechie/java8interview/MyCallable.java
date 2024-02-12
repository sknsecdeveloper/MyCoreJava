package com.arnab.javatechie.java8interview;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer> {

    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    public Integer call(){

        int fact =1;
        for (int i = n; i>1; i--){
            fact = fact*i;
        }
        System.out.println(fact);
        return fact;

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable myCallable = new MyCallable(4);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //executorService.
        Future<Integer> future = executorService.submit(myCallable);
        int x = 10;
        Future<Integer> result1 =  executorService.submit(() -> x*x );
        Future<Integer> result2 =  executorService.submit(() -> x*x );

        executorService.submit(()-> System.out.println("Runnable lamda"));
        System.out.println(future.get());

        executorService.shutdown();

    }
}
