package com.interview.leetcode.november.design;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    Map<Integer,Boolean> hmap;

    /** Initialize your data structure here. */
    public TwoSum() {

        hmap = new HashMap<>();

    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        this.hmap.put(number,true);

    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {

        if(this.hmap.size()<2)
            return false;

        for(int key:this.hmap.keySet())
        {
            if(this.hmap.get(value-key)!=null)
                return true;
        }

        return false;

    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */