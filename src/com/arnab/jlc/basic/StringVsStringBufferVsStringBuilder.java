package com.arnab.jlc.basic;

public class StringVsStringBufferVsStringBuilder {

    public static void concatString(String s1) {
        s1 = s1 + "forgeeks";
    }
    public static void concatStringBuilder(StringBuilder s2) {
        s2 = s2.append("forgeeks");
    }

    public static void concatStringBuffer(StringBuffer s3) {
        s3 = s3.append("forgeeks");
    }


    public static void main(String[] args) {
        /*String s1 = "geeks";
        concatString(s1);
        System.out.println(s1);*/

        StringBuilder s2 = new StringBuilder("geeks");
        concatStringBuilder(s2);
        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("geeks");
        concatStringBuffer(s3);
        System.out.println(s3);

        String s1 = "Subhash";
        s1 = s1 + " Kumar";
        System.out.println(s1);

    }

}

