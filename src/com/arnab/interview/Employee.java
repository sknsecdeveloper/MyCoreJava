package com.arnab.interview;

import java.math.BigDecimal;

public class Employee implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee();

        Student student = new Student(123,"arnab");
        employee.setId(123);
        employee.setName("Subhash");
        employee.setStudent(student);

        Employee cloneEmployee = (Employee) employee.clone();
        cloneEmployee.getStudent().setName("chitti");

        System.out.println(employee);
        System.out.println(cloneEmployee);

        System.out.println(employee == cloneEmployee);





    }

    private int id;
    private String name;
    private String dept;
    private BigDecimal salary;

    private Student student;

    public Employee() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Employee(int id, String name, String dept, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", student=" + student +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
