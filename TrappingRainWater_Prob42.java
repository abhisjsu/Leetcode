package com.interview.leetcode.october;

public class TrappingRainWater_Prob42 {

    public int trapSolvedByOther(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right)
        {
            if (height[left] < height[right])
            {
                leftMax = Math.max(height[left], leftMax);
                res += leftMax - height[left];
                left++;
            }
            else
            {
                rightMax = Math.max(height[right], rightMax);
                res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String argv[])
    {
        TrappingRainWater_Prob42 p = new TrappingRainWater_Prob42();
        int input[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = p.trapSolvedByOther(input);

        System.out.println(result);
    }
}
