package com.interview.leetcode.october;

import java.util.*;

public class MergeIntervalsRevision {

    class IntervalComparator implements Comparator<Interval>
    {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }


    public List<Interval> merge(List<Interval> intervals)
    {
        List<Interval> output = new ArrayList<>();
        Stack<Interval> stack = new Stack<>();

        for(Interval i:intervals)
        {

            if(stack.isEmpty() || stack.peek().end < i.start)
                stack.push(i);
            else
            {

                Interval top = stack.pop();
                top.end = Math.max(top.end,i.end);
                stack.push(top);
            }
        }

        while(stack.isEmpty())
        {
            output.add(stack.pop());
        }

        return output;
    }

    public List<Interval> merge2(List<Interval> intervals) {

        LinkedList<Interval> output = new LinkedList<>();

        Collections.sort(intervals, new IntervalComparator());

        for(Interval i:intervals)
        {

            if(output.isEmpty() || (output.getLast().end < i.start))
                output.addLast(i);
            else
            {

                Interval top = output.getLast();
                top.end = Math.max(top.end,i.end);
            }
        }

        return output;

    }
}



