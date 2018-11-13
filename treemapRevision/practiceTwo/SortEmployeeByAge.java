package com.interview.leetcode.september.treemapRevision.practiceTwo;

import com.interview.leetcode.september.treemapRevision.model.EmployeeTwo;

import java.util.Comparator;

public class SortEmployeeByAge implements Comparator<EmployeeTwo> {

    @Override
    public int compare(EmployeeTwo o1, EmployeeTwo o2) {
        return o1.getAge() - o2.getAge();
    }
}
