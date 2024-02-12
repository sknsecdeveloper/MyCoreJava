package com.arnab.javalambda;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "subhash",
                "arnab",
                "chitti",
                "ajay"
        );

        String  s =names.stream().filter(a-> a.startsWith("d")).findAny().orElseGet(() -> "NOT FOUND");
        System.out.println(s);

        names.forEach(
                n-> System.out.println(n)
        );

    }
}
