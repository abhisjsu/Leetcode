package com.interview.leetcode.october;

import java.util.*;

public class ThreeSum_Prob15 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);

        for(int i =0;i<nums.length -2;i++)
        {
            int j =i+1;
            int k = nums.length -1;

            while(j<k)
            {

                int sum = nums[i] + nums[k] + nums[j];
//                System.out.println(nums[i]+" , "+nums[j]+" , "+nums[k]);
                if(sum ==0)
                {
                    List<Integer> current = new ArrayList<>();
                    System.out.println(nums[i]+" , "+nums[j]+" , "+nums[k]);
                    current.add(nums[i]);
                    current.add(nums[j]);
                    current.add(nums[k]);
                    j++;
                    k--;
                    output.add(current);
                }
                else if(sum > 0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }

        }


        return output;

    }

    public static void main(String argv[]) {
        int input[] = {-1, 0, 1, 2, -1, -4};
        ThreeSum_Prob15 p = new ThreeSum_Prob15();

        List<List<Integer>> output = p.threeSum(input);

        for (List<Integer> t : output) {
            System.out.println(t);

        }
    }

}
