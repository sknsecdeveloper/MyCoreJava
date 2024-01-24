package javatechie.java8interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyOfEachCharInString {

    public static void main(String[] args) {

        String str = "abcdabgdabcqbq";

        Map<Object, Object> map = Stream.of(str.split("")).collect(Collectors.toMap(ch -> UUID.randomUUID().toString(), ch->ch));
        //System.out.println(map);

        Map<String,Long> charCountMap = Stream.of(str.split("")).collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        //System.out.println(charCountMap);

        Map<Character, Integer> eachCharCountMap = new HashMap<>();
        for(char ch : str.toCharArray()) {
            if(eachCharCountMap.containsKey(ch)) {
                eachCharCountMap.put(ch, eachCharCountMap.get(ch)+1);
            } else {
                eachCharCountMap.put(ch, 1);
            }
        }
        //System.out.println();
        IntStream.rangeClosed(1, 10).forEach(t-> System.out.println(Thread.currentThread().getName()+t));

        IntStream.rangeClosed(1,10).parallel().forEach(t-> System.out.println("Parallel :"+Thread.currentThread().getName()+t));

        System.out.println("Available processor : "+Runtime.getRuntime().availableProcessors());
    }
}
