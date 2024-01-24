package javatechie.java8interview;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {
    public static void main(String[] args) {

        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        //list = new ArrayList<>();
        final int a = 10;
         //a = 16;
    }
}
