package interview;

import java.util.*;
import java.util.stream.*;

public class SecondHighestNumberArray {

    public static void main(String[] args) {

        int[] numArray = {2,9,2,6,5,10,3};
        Arrays.sort(numArray);
        System.out.println(numArray[numArray.length-2]);


        int sechigh = Arrays.stream(numArray).boxed().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList()).get(1);
        System.out.println("sechigh : "+sechigh);

        int secHighest = find2ndHighNumForLoop(numArray);
        System.out.println(secHighest);


    }

    public static int find2ndHighNumForLoop(int[] numArray) {

        int highest = 0;
        int secondHighest = 0;

        if(numArray.length<2) {
            return -1;
        }

        for(int n : numArray) {
            if(n>highest) {
               secondHighest = highest;
               highest = n;
            } else if (n> secondHighest && n<highest) {
                secondHighest = n;
            }
        }

        return secondHighest;

    }

    public static int findSecondHighestNumberArray(int[] numArray) {
        int secondHighest = Arrays.stream(numArray).mapToObj(n->Integer.valueOf(n))
                .sorted(
                        (a,b)-> b.compareTo(a)
                )
                .distinct()
                .skip(1)
                .findFirst().orElse(-1);
        System.out.println(secondHighest);
        return secondHighest;
    }
}
