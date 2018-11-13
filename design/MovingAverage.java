package com.interview.leetcode.november.design;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    int size;
    int sum;
    int count;

    Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {

        this.size = size;
        sum =0;
        count =0;
        queue = new LinkedList<>();
    }

    public double next(int val) {

        if(this.count<this.size)
        {
            queue.add(val);
            sum+= val;
            count++;
        }
        else
        {
            /**
            1. remove the last element from the queue
            2. remove the same value from the sum
            3. add new element to the queue
            4. add to the same to sum
            **/

            int last = queue.poll();
            sum-=last;
            queue.add(val);
            sum+=val;
        }

        return (double)sum/count;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */