package com.interview.leetcode.september.treemapRevision.practiceTwo;

import com.interview.leetcode.september.treemapRevision.model.EmployeeTwo;

import java.util.Arrays;
import java.util.Comparator;

public class SortEmployees {

    private EmployeeTwo[] employees;

    private int count = 0;

    public SortEmployees(int count)
    {
        this.employees = new EmployeeTwo[count];
    }

    public void putEmployee(EmployeeTwo e)
    {
        this.employees[this.count++] = e;
    }

    public void displayEmployees()
    {
        System.out.println("The contents of the array are : ");
        for(EmployeeTwo e: this.employees)
            System.out.println(e);
    }

    public void sortEmployeeList(Comparator c)
    {
        Arrays.sort(this.employees,c);
    }

    public static void main(String argv[])
    {
        SortEmployees s = new SortEmployees(5);

        EmployeeTwo e1 = new EmployeeTwo("Ab",22,1500);
        EmployeeTwo e2 = new EmployeeTwo("Bc",23,1600);
        EmployeeTwo e3 = new EmployeeTwo("Nb",55,1800);
        EmployeeTwo e4 = new EmployeeTwo("Ck",56,1700);
        EmployeeTwo e5 = new EmployeeTwo("Ld",29,1110);

        s.putEmployee(e1);
        s.putEmployee(e2);
        s.putEmployee(e3);
        s.putEmployee(e4);
        s.putEmployee(e5);

        s.displayEmployees();

        s.sortEmployeeList(new SortEmployeeByAge());
        s.displayEmployees();

        s.sortEmployeeList(new SortEmployeeBySalary());
        s.displayEmployees();

    }
}
