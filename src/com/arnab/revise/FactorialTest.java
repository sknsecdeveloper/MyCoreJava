package com.arnab.revise;

public class FactorialTest {

    public static void main(String[] args) {



        System.out.println(getFactorial(4));
        System.out.println(getFactRec(1));
    }

    public static int getFactorial(int n) {

      if(n == 0 || n == 1)
          return 1;

      int fact = 1;
      for(int i =n; i>1; i--) {
          fact = fact*i;
      }

      return fact;

    }

    public static int getFactRec(int n) {

        if(n == 1 || n == 0)
            return 1;
        return n*getFactRec(n-1);
    }
}
