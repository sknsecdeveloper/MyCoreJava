package com.arnab.builder;

public class StudentBuilder {

    private int id;
    private String name;
    private String rollNo;
    private String department;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(String rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Student getStudent(){
        return  new Student(id,name,rollNo,department);
    }
}
