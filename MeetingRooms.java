package com.interview.leetcode.november;

import com.interview.leetcode.october.Interval;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public class IntervalComparator implements Comparator<Interval>
    {
        public int compare(Interval i1, Interval i2)
        {
            return i1.start - i2.start;
        }
    }

    public boolean canAttendMeetings(Interval[] intervals) {

        Arrays.sort(intervals, new IntervalComparator());
        int len = intervals.length;
        for(int i = 0;i<len-1;i++)
        {
            if(intervals[i+1].start<intervals[i].end)
                return false;
        }

        return true;
    }
}
