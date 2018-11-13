package com.interview.leetcode.november.design;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

    Queue<Integer> queue;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.queue = new LinkedList<>();

        while(iterator.hasNext())
            this.queue.add(iterator.next());
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return this.queue.peek();
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {

        return this.queue.poll();
    }

    @Override
    public boolean hasNext() {

        return !this.queue.isEmpty();
    }
}
