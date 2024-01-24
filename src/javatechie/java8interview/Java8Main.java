package javatechie.java8interview;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Java8Main {

    public static void main(String[] args) {

       /* Function<Integer, Integer> function = (t)-> t*t;
        System.out.println(function.apply(5));

        System.out.println();*/

        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        map.put(1, null);
        System.out.println(map);
    }
}
