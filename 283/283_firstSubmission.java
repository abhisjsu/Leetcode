
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative
order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

*/

class Solution {
    public void moveZeroes(int[] nums) {

        int numsLength = nums.length;
        int i =0, j =0;
        int temp = 0;
        int zero  =0 , nonzero  =0;


        for(i=0;i<numsLength;i++)
        {
            if(nums[i]==0)
            {
                for(j=i+1;j<numsLength;j++)
                {
                    if(nums[j]!=0)
                    {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    break;
                    }
                }
                
            }
        }



    }
}
