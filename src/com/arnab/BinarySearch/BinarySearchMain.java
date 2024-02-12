package com.arnab.BinarySearch;

public class BinarySearchMain {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySerach(arr,3));

    }

    static int binarySerach(int[] sortedArr, int target) {

        int start = 0;
        int end = sortedArr.length-1;

        while (start <= end) {

            // int mid = (start + end)/2;
            int mid = start + (end-start)/2;

            if(target < sortedArr[mid]) {
                end = mid -1;
            }
            else if(target > sortedArr[mid]) {
                start = mid + 1;
            }
            else if(target == sortedArr[mid]) {
                return mid;
            }
        }

        return -1;
    }
}
