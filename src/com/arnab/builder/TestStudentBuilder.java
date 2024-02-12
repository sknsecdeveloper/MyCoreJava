package com.arnab.builder;

import java.util.Arrays;

public class TestStudentBuilder {

    public static void main(String[] args) {

        Student student = new StudentBuilder()
                .setId(123)
                .setName("subhash")
                .setRollNo("23")
                .setDepartment("IT")
                .getStudent();

        Arrays.asList(student).forEach(System.out::println);

        System.out.println(student);


        Family family = new FamilyBuilder()
                .setId(123)
                .setName("subhash")
                .setHeadCount(8)
                .build();
        System.out.println(family);



    }
}
