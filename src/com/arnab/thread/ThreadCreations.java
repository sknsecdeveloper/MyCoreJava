package com.arnab.thread;

import java.util.concurrent.*;

public class ThreadCreations {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Extend Thread
        // Implement Runnable
        Thread threadRunnable = new Thread(() -> System.out.println("Runnable thread running"), "thread name ");
        threadRunnable.start();

        //Executor framework
        Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> System.out.println("executor executing through execute() method"));

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> System.out.println("ExecutorService (Runnable) running through submit method"));
        Future<String>  stringFuture = executorService.submit(() -> "object to return. Executor service running through submit with Callable instance");
        System.out.println(stringFuture.get());


        //Completable
        CompletableFuture completableFutureRunnable = CompletableFuture.runAsync(() -> System.out.println("CompletableFuture.runAsync with runnable instance"));

        CompletableFuture completableFutureCallable = CompletableFuture.supplyAsync(() -> "object to retun. Completable running through supplyAsync with Callable instance");
    }


}
