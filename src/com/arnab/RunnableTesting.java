package com.arnab;

import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RunnableTesting extends Thread{

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RunnableTesting runnableTesting = new RunnableTesting();
        runnableTesting.start();

        Thread thread = new Thread(new CustomRunnable());
        thread.start();



        Thread threadAnms = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Runnable runnableTest =
            () -> {
                System.out.println("");
            };

        Callable callable =
            () -> {
                return null;
            };


        Predicate predicate= (o) -> false;

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return null;
            }
        };

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {

            }
        };

















        int x = 10;

        Thread callableThread = new Thread(new FutureTask<>(()->
        {
            System.out.println("Callable running");
            return x;
        }
                ));

        callableThread.start();

        //Thread pool

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(
                () -> System.out.println(
                "Executor runnable is running"
        ));

        Future<Integer> integerFuture = executorService.submit(
                () -> {
                    //Thread.sleep(5000);
                    System.out.println("executorService callable running");
                    return x;
                }
        );

        System.out.println(integerFuture.get());


        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(

                () -> {
                    try {
                        System.out.println("Thread Name : "+Thread.currentThread().getName());
                        Thread.sleep(5000);
                        System.out.println("Thread Name : "+Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread Name : "+Thread.currentThread().getName());
                    System.out.println("executorService callable running");
                    return x;
                }

        );

        System.out.println("Thread Name : "+Thread.currentThread().getName());
        completableFuture.complete(123);
        System.out.println(completableFuture.get().toString());


























    }
}
