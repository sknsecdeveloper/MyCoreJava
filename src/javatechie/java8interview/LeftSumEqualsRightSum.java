package javatechie.java8interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftSumEqualsRightSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,9,6};
        int n = arr.length;
        findEquilibriumElement(arr, n);

    }

    public static void findEquilibriumElement(int[] arr, int n) {

        List<Integer> arrList = Arrays.stream(arr).mapToObj(e ->Integer.valueOf(e)).collect(Collectors.toList());
        for(int i =1; i<n; i++) {

            int leftSum = arrList.subList(0,i).stream().mapToInt(x->x).sum();
            int rightSum = arrList.subList(i+1,n).stream().mapToInt(x->x).sum();

            if(leftSum==rightSum){
                System.out.println(arr[i]);
            }

        }

    }
}
