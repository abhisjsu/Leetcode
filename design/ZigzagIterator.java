package com.interview.leetcode.november.design;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator {

    Queue<Integer> first;
    Queue<Integer> second;
    boolean odd;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.first = new LinkedList<>(v1);
        this.second = new LinkedList<>(v2);
        this.odd = true;
    }

    public int next() {

        int result =0;

        if(!this.first.isEmpty() && !this.second.isEmpty())
        {
            if(this.odd)
                result = this.first.poll().intValue();
            else
                result = this.second.poll().intValue();
        }
        else if(!this.first.isEmpty())
            result = this.first.poll().intValue();
        else
            result = this.second.poll().intValue();

        this.odd = !this.odd;

        System.out.println(result);

        return result;

    }

    public boolean hasNext() {
        return (!this.first.isEmpty() || !this.second.isEmpty());
    }

}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */
