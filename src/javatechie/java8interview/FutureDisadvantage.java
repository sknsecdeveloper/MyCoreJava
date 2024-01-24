package javatechie.java8interview;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureDisadvantage {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future future = executorService.submit(
                () -> {
                    System.out.println("Thread name : "+Thread.currentThread().getName());
                    //delay(1);
                    return Arrays.asList(1,2,3,4);
                }
        );

        //List<Integer> list = (List<Integer>) future.get();
        //System.out.println(list);


    }

    public static void delay(int minute) throws InterruptedException {
        TimeUnit.MINUTES.sleep(minute);
    }
}
