package com.interview.leetcode.september.treemapRevision.model;

public class EmployeeTwo {

    private String name;

    private int age;

    private int salary;

    public EmployeeTwo(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeTwo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
