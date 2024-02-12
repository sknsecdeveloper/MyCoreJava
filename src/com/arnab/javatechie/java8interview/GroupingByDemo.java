package com.arnab.javatechie.java8interview;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("subhash","puja","raju", "shiva");
        Map map = names.stream().collect(Collectors.groupingBy(t-> t.length()));
        Map map1 = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);


        String str = "subhash";
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for(char c : str.toCharArray()){
            if(!set.add(c)) {
                System.out.println("First repeating char : "+c);
                break;
            }

        }

        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            } else charCount.put(c,1);
        }

        for(char c : str.toCharArray()) {
            if(charCount.get(c)==1){
                System.out.println("First non repeating char : "+c);
                break;
            }
        }

        //1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

        List<Integer> integers = Arrays.asList(0,15,8,49,25,98,32);
        List<Integer> evenIntegers  = integers.stream().filter(n->n%2==0).collect(Collectors.toList());
        evenIntegers.forEach(System.out::println);

        // Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> numbers = Arrays.asList(10,15,8,49,98,25,98,8,32);
        List<Integer> numbers1 = /*numbers.stream().filter(n->
                Integer.valueOf(n.toString().charAt(0))==Integer.valueOf(1)
                ).collect(Collectors.toList());*/

                //numbers.stream().filter(n-> n.toString().charAt(0)=='1').collect(Collectors.toList());

                numbers.stream().filter(n-> n.toString().startsWith("1")).collect(Collectors.toList());

        numbers1.forEach(System.out::println);


        //How to find duplicate elements in a given integers list in java using Stream functions?
        long distinctCount = numbers.stream().distinct().count();
        if( distinctCount != numbers.size()) {
            System.out.println("Duplicate is there");
        }
         //print all duplicate value
        Set<Integer> set1 = new HashSet<>();
        numbers.stream().filter(n-> !set1.add(n)).collect(Collectors.toList()).forEach(System.out::println);

        //max value
        Optional<Integer> maxValueoptional = numbers.stream().max(
                (x,y) -> x.compareTo(y)
        );

        if(maxValueoptional.isPresent()) {
            System.out.println("Max Value : "+maxValueoptional.get());
        }

        List<Employee> employees = Arrays.asList(new Employee(1,"subhash", 50000),
                new Employee(2,"puja", 40000),
                new Employee(3, "kishan", 35000));

        Optional<Employee> empOptional = employees.stream().max(
                (x, y) -> Double.compare(x.getSalary(), y.getSalary())
        );
        if(empOptional.isPresent()) {
            System.out.println(empOptional.get().getSalary());
        }

        String name = employees.stream().max(
                (x,y) -> x.getName().compareTo(y.getName())
        ).get().getName();
        System.out.println(name);

        //Given a String, find the first non-repeated character in it using Stream functions?

        String myName = "subhash kumar";

        Map<Character, Integer> myMap = new HashMap<>();
        for(Character c : myName.toCharArray()) {
            if(myMap.containsKey(c)) {
                myMap.put(c, myMap.get(c)+1);
            } else myMap.put(c,1);
        }
        for(Character c : myName.toCharArray()) {
            if(myMap.get(c) == 1) {
                System.out.println("First non repeating character : "+c);
                break;
            }
        }

        int n =10;
        Supplier supplier = () -> n;
        System.out.println(supplier.get());

        Consumer consumer = (t) -> System.out.println("Consumer : "+t);
        consumer.accept(17);

        Predicate<Integer> predicate = (num) -> num%2==0;
        System.out.println(predicate.test(10));

        Function<Integer, Integer> function = (x) -> (x*x);
        System.out.println(function.apply(7));






    }
}
