package com.interview.leetcode.october;

import java.util.List;
import java.util.ArrayList;

public class InsertInterval_Prob57 {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) return intervals;
        List<Interval> res = new ArrayList<>();
        int i = 0;

        /*This means that the intervals under consideration are starting beyond current intervals, simply put in output*/
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            res.add(intervals.get(i++));
        }

        /*Interval start is less than the end of current interval*/
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        res.add(newInterval);

        /*We have added our interval at right place, just copy the remaining elements*/
        while (i < intervals.size()) {
            res.add(intervals.get(i++));
        }
        return res;
    }


}
