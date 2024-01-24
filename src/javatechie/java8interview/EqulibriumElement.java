package javatechie.java8interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqulibriumElement {

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 0};

        List<Integer> list = Arrays.stream(arr).mapToObj(n -> Integer.valueOf(n))
                .collect(Collectors.toList());
        System.out.println(list);

        int arrlength = arr.length;


        for(int i=1; i<=arrlength-1; i++) {

            int leftSum = list.subList(0,i).stream().mapToInt(n->n).sum();
            int rightSum = list.subList(i+1,arrlength).stream().mapToInt(n->n).sum();

            if(leftSum==rightSum) {
                System.out.println(arr[i]);
            }
        }



    }
}
