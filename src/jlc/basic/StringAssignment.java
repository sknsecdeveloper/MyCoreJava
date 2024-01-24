package jlc.basic;

public class StringAssignment {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java1");
        String s3 = "java";
        String s4 = "javaaaa";

        StringBuffer s5 = new StringBuffer("javabuffer");

        System.out.println(s1=s2);
        System.out.println(s3=s4);

        System.out.println(s1=s5.toString());
    }
}
