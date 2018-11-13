package com.interview.leetcode.october;

import java.util.*;

public class MergeIntervals_Prob56 {

    class IntervalComparator implements Comparator<Interval>
    {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> output = new ArrayList<>();
        Stack<Interval> stack = new Stack<>();

        Collections.sort(intervals,new IntervalComparator());

        for(Interval i: intervals)
        {
            if(!stack.isEmpty())
            {
                Interval top = stack.peek();

                if(i.start<=top.end)//merge
                {
                    if(top.end<i.end)
                    {
                        top = stack.pop();
                        stack.push(new Interval(top.start,i.end));
                    }

                }
                else//don't merge, just push
                {
                    stack.push(i);
                }
            }
            else
            {
                stack.push(i);
            }
        }

        while(!stack.isEmpty())
            output.add(stack.pop());

        return output;

    }

    public static void main()
    {

    }
}
