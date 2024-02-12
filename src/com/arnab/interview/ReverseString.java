package com.arnab.interview;

//import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] x) {

        int n = 10;

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(a+" "+b);
        for(int i=2; i<n; i++) {

            c = a+b;
            a = b;
            b =c;
            System.out.print(" "+c);

        }




        String str = "Subhash Kumar";




       /* //Map<Character, List<Character>> charMap =
                str.chars().mapToObj(c-> Character.valueOf((char) c)).collect(Collectors.groupingBy(c->c))
                        .entrySet().str

*/        String vowels = "aeiou";



        System.out.println(str.contains("a"));;

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());



    }
}
