package com.arnab.javatechie.java8interview;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(
                ()-> {
                    System.out.println("HI");
                    System.out.println("Thread : "+Thread.currentThread().getName());
                }, Executors.newFixedThreadPool(10)
        );
        Object result =  completableFuture.get();
        System.out.println(result);


        CompletableFuture completableFuture2 = CompletableFuture.supplyAsync(
                ()-> "Hi"
        );
        Object object = completableFuture2.get();
        System.out.println(object);

        int n = 10;

        CompletableFuture<Integer> resultCompletableFuture1 =  CompletableFuture.supplyAsync(()-> {
            int x = 9;
            return x*x;
        }, Executors.newFixedThreadPool(2));

        CompletableFuture<Integer> resultCompletableFuture2 =  CompletableFuture.supplyAsync(()-> {
            int x = 9;
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Inside resultCompletableFuture2 : "+x*x);
            return x*x;
        }, Executors.newFixedThreadPool(2));
        System.out.println(resultCompletableFuture2.isDone());
        //System.out.println(resultCompletableFuture2.get());
        if(!resultCompletableFuture2.isDone()) {
            resultCompletableFuture2.complete(81);// Complete manually
        }
        System.out.println(resultCompletableFuture2.isDone());

        //Chain multiple CompletableFuture in Single future
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Subhash");
        CompletableFuture<String> future2 =  future1.thenApplyAsync(future1Result -> future1Result + " kumar");
        System.out.println(future2.get());



        //Segregate result from multiple CompletableFuture
        CompletableFuture<String> futureResult1 = CompletableFuture.supplyAsync(()->"First");
        CompletableFuture<String> futureResult2 = CompletableFuture.supplyAsync(()->"Second");
        CompletableFuture<String> futureResult3 = CompletableFuture.supplyAsync(()->"third");
        CompletableFuture<Void> combinedFutureResultVoid = CompletableFuture.allOf(futureResult1,futureResult2,futureResult3);
        CompletableFuture<String> combinedFutureResult = combinedFutureResultVoid.thenApplyAsync(
                (v) -> futureResult1.join()+" "+futureResult2.join()+" "+futureResult3.join()
        );
        String resultCombined = combinedFutureResult.get();
        System.out.println(resultCombined);

















    }
}
