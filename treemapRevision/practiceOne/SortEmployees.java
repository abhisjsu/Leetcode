package com.interview.leetcode.september.treemapRevision.practiceOne;

import com.interview.leetcode.september.treemapRevision.model.Employee;

import java.util.Arrays;

public class SortEmployees {

    private Employee[] employees;

    private int count = 0;

    public SortEmployees(int count)
    {
        this.employees = new Employee[count];
    }

    public void putEmployee(Employee e)
    {
        this.employees[this.count++] = e;
    }

    public void displayEmployees()
    {
        System.out.println("The contents of the array are : ");
        for(Employee e: this.employees)
            System.out.println(e);
    }

    public void sortEmployeeList()
    {
        Arrays.sort(this.employees);
    }

    public static void main(String argv[])
    {
        SortEmployees s = new SortEmployees(5);

        Employee e1 = new Employee("Ab",22,1500);
        Employee e2 = new Employee("Bc",23,1600);
        Employee e3 = new Employee("Nb",55,1200);
        Employee e4 = new Employee("Ck",56,1050);
        Employee e5 = new Employee("Ld",29,1110);

        s.putEmployee(e1);
        s.putEmployee(e2);
        s.putEmployee(e3);
        s.putEmployee(e4);
        s.putEmployee(e5);

        s.displayEmployees();

        s.sortEmployeeList();

        s.displayEmployees();
    }


}
