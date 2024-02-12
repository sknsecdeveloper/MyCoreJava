package com.arnab.BinarySearch;

public class CeillingNumber {

    public static void main(String[] args) {

        int[] arr = {1,4,6,9,13,15,19};
        System.out.println(ceillingNumber(arr, 21));

    }

    static int ceillingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]) {
            return  -1;
        }

        while(start<=end) {
            int mid = start + (end -start)/2;
            int midElement = arr[mid];

            if(target == midElement) {
                return target;
            } else if (target < midElement) {
                end = mid -1;
            } else if (target > midElement) {
                start = mid +1;
            }
        }

        return arr[start];
    }
}
