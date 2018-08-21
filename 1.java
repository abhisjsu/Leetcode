/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        Map<Integer,Integer> hmap = new HashMap<>();
        int result[] = new int[2];
        int lengthnums = nums.length;
        int diffIndex;
        
        for(int i=0;i<lengthnums;i++)
        {
            diffIndex = hmap.get(target-nums[i]);
            System.out.println(nums[i]+","+diffIndex);
            if(diffIndex!=0)
            {
                    result[1] = i;
                    result[0] = diffIndex;
                    
                    return result;
            }
            else
            {
                hmap.put(nums[i],i);
            }
        }
        
        return result;

    }
}