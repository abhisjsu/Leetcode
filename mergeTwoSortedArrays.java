package com.interview.leetcode.october;

public class mergeTwoSortedArrays {


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;

        int len1 = nums1.length;
        int len2 = nums2.length;

        while(i<len1 && j<len2)
        {
            if(nums1[i] ==0)
            {
                nums1[i++] = nums2[j++];
            }
            else if(nums1[i]<=nums2[j])
                i++;
            else
            {
                for(int k=i;k<len1-1;k++)
                {
                    nums1[k+1] = nums1[k];
                }
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
    }

    public static void main(String argv[])
    {
        mergeTwoSortedArrays m = new mergeTwoSortedArrays();
        int input1[] = {1,2,8,0,0,0};
        int input2[] = {3,10,12};

        m.merge(input1,3,input2,3);

        for(int i: input1)
            System.out.println(i);

    }


}

