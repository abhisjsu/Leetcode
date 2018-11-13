/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only
once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input
array in-place with O(1) extra memory.

Checked this solution from youtube
*/

class RemoveDuplicatesProb26 {
    public int removeDuplicates(int[] nums) {

        int length  = nums.length;
        int unique = 1;

        for(int i =1;i<length;i++)
        {
            if(nums[i-1]!=nums[i])
            {
                nums[unique++] = nums[i];
            }
        }

        return unique;

    }
}
