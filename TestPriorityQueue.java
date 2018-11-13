package com.interview.leetcode.october;

import java.util.PriorityQueue;

public class TestPriorityQueue {


    public static void main(String argv[])
    {
        int size;

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("K");
        priorityQueue.add("a");
        priorityQueue.add("Z");

        priorityQueue.add("A");
        priorityQueue.add("B");
        priorityQueue.add("D");

        priorityQueue.add("b");
        priorityQueue.add("x");
        priorityQueue.add("m");

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}
