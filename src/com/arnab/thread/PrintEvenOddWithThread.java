package com.arnab.thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrintEvenOddWithThread {

    public static void main(String[] args) {

        List<Integer>  nums = Arrays.asList(7,2,6,7,1,8);
        LinkedList<Integer> integers = new LinkedList<>(nums);



        Thread oddThraed = new Thread(() ->
                nums.stream().filter(n-> n%2!=0)

        );

        //evenThraed.start();
        oddThraed.start();





    }
}
