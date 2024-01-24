package arnab.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ArnabThread {

    public static void main(String[] args) {

    new Thread(() -> {
        throw new RuntimeException("exception in run method");
    }).start();

    ExecutorService executorService = Executors.newFixedThreadPool(2);
    executorService.submit(()-> "subhash");

    CompletableFuture completableFuture = CompletableFuture.supplyAsync(()->  Arrays.asList(2,4,53,3));
        try {
            List<Integer>  nums = (List<Integer>) completableFuture.get();
            System.out.println(nums);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }



        ArnabThread arnabThread = new ArnabThread();
   arnabThread.testmethod();

    }

    public void testmethod(){

        Object object = new Object();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println(list.get(7));

        AtomicInteger index = new AtomicInteger(0);

        Thread even = new Thread(()->{
            while (true) {
                synchronized(this){
                    while(index.get()<list.size()) {
                        while(index.get()<list.size() && list.get(index.get())%2!=0) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        if(index.get()<list.size()){
                            System.out.println("Printing Even"+ list.get(index.get()));
                            index.getAndIncrement();
                        }
                        notify();
                    }
                }
            }

        });
        Thread odd = new Thread(()->{
            while (true) {
                synchronized(this){
                    while(index.get()<list.size()) {

                        while( index.get()<list.size() && list.get(index.get())%2==0)
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        if(index.get()<list.size()){
                            System.out.println("Printing odd"+ list.get(index.get()));
                            index.getAndIncrement();
                            System.out.println("odd else notify");
                            notify();
                        }
                    }
                }
            }
        });

        even.start();
        odd.start();
    }
}
