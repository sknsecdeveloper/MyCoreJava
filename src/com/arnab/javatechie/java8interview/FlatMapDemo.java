package com.arnab.javatechie.java8interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<User> users = Stream.of(
                new User("subhash", "32323", Arrays.asList("a","b","c" )),
                new User("suresh", "1111", Arrays.asList("z","y","x"))
        ).collect(Collectors.toList());

        List<List<String>> allemails = users.stream().map(user -> user.getEmails()).collect(Collectors.toList());

        System.out.println(allemails);

        List<String> flatMapEmails = users.stream().flatMap(user -> user.getEmails().stream()).collect(Collectors.toList());
        System.out.println(flatMapEmails);

    }


}
