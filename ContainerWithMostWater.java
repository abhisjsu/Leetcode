package com.interview.leetcode.november;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int start =0;
        int end = height.length -1;
        int maxWater =0;

        while(start<end)
        {
            int currentWater =0;
            if(height[start]<height[end])
            {
                currentWater = height[start]*(end-start);
                start++;
            }
            else
            {
                currentWater = height[end]*(end-start);
                end--;
            }

            maxWater = Math.max(maxWater,currentWater);
        }

        return maxWater;
    }
}
