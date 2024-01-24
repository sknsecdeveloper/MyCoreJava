package interview;

public class Fibonacci {

    public static void main(String[] args) {

        int n =10;
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a+" "+b);

        for(int i = 1 ; i<=10; i++ ) {

            sum = a+b;
           a = b;
           b = sum;

            System.out.print(" "+sum);

        }

    }
}
