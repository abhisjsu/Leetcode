package com.interview.leetcode.october;

import java.util.ArrayList;
import java.util.List;

public class FactorCombination_Prob254 {

    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(res, list, n, 2);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, int n, int start) {
        if (n == 1) {
            if (list.size() <= 1) {
                return;
            }
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            System.out.println(n+" % "+i);
            if (n % i == 0) {
                list.add(i);
                helper(res, list, n / i, i);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String argv[])
    {
        FactorCombination_Prob254 p = new FactorCombination_Prob254();
        List<List<Integer>> list = p.getFactors(32);

        for(List l: list)
        {
            System.out.println(l);
        }
    }
}
