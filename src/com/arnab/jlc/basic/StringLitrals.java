package com.arnab.jlc.basic;

public class StringLitrals {
    public static void main(String[] args) {

        /*String str = null;
        System.out.println(str);
        System.out.println(str.length());*//*

        String str1 = "subhash";
        String str2 = "subhash";

        String str3 = new String("subhash");

        //System.out.println(str1==str2); //true
        //System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));*/

        String str1 = "java";
        String str2 = "java";

        String s1 = new String("java");
        String s2 = new String("java");


        System.out.println(str1.equals(s1));

    }


}
