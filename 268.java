/*
268. Missing Number
DescriptionHintsSubmissionsDiscussSolution
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
*/

class Solution {
    public int missingNumber(int[] nums) {

        int result = 0;
        int length = nums.length;

        for(int i=0;i<=length;i++)
            result^=i;

        for(int i=0;i<length;i++)
            result^=nums[i];

        return result;

    }
}
