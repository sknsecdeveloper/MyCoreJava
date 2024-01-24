package jlc.basic;

public class UnreachableStatement {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i is " + i);
            i++;
            break;
        }
        System.out.println("i is not 10");
    }
}