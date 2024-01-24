package interview;

public class Factorial {

    public static void main(String[] args) {

        int n = 4;
        int factorial = 1;
        for(int i = n; i>1; i--) {
            factorial = factorial*i;
        }
        //
        System.out.println(factorial);

        //System.out.println(factorial(4));
    }

  public static int findFactorial(int num) {
        if(num==0 || num ==1) {
            return num;
        }
        return num*findFactorial(num-1);
  }
}
