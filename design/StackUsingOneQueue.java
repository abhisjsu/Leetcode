package com.interview.leetcode.november.design;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

    Queue<Integer> q = new LinkedList<>();

    void push(int val)
    {
        int size = q.size();

        q.add(val);
        for(int i= 0;i<size;i++)
        {
            q.add(q.poll());
        }
    }

    int pop()
    {
        return this.q.poll();
    }

    public static void main(String argv[])
    {
        StackUsingOneQueue s = new StackUsingOneQueue();
        s.push(10);
        System.out.println(s.q);

        s.push(20);
        System.out.println(s.q);

        s.push(30);
        System.out.println(s.q);

        s.push(40);
        System.out.println(s.q);

        s.pop();
        System.out.println(s.q);

        s.pop();
        System.out.println(s.q);

    }
}
