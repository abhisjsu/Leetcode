package com.interview.leetcode.november;

import com.interview.leetcode.october.Interval;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms2 {

    public class IntervalCompare implements Comparator<Interval>
    {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }


    public int minMeetingRooms(Interval[] intervals) {

        int count = 1;
        int len = intervals.length-1;

        Arrays.sort(intervals, new IntervalCompare());

        for(int i=0;i<len;i++)
        {
            if(intervals[i+1].start < intervals[i].end)
                count++;
        }

        return count;
    }
}
