package com.arnab.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestFilterOptional {

    public static void main(String[] args) {

        int[] nums = {1,4,6,3,6,3,0,1};

        Arrays.stream(nums).boxed().filter(n-> n%2==0).collect(Collectors.toList()).forEach(System.out::println);

    }
}
