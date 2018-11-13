package com.interview.leetcode.october;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.offerLast(i);
            if ((i + 1) >= k) {
                res[i + 1 - k] = nums[deque.peek()];
            }
        }
        return res;
    }


    public static void main(String argv[])
    {
        SlidingWindowMaximum p = new SlidingWindowMaximum();
        int nums[] ={2,1,-3,4,7,5,8,-1,6};

        nums =p.maxSlidingWindow(nums,3);

        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }


}
