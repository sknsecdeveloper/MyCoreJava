package com.arnab.interview;

import java.util.Arrays;
import java.util.List;

public class ListSum {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,1,3);
        nums.stream().mapToInt(n-> n).sum();

        int[] arr = {2,2,4,6};

        Arrays.stream(arr).sum();



    }
}
