package com.interview.leetcode.november.design;

import java.util.HashMap;
import java.util.Map;

public class Logger {

    Map<String,Integer> hmap;
    int size;

    /** Initialize your data structure here. */
    public Logger() {
        hmap = new HashMap<>();
        size = 10;
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {

        if(hmap.get(message) ==null)
        {
            hmap.put(message,timestamp);
            return true;
        }

        int previousTime = hmap.get(message);

        if(timestamp-previousTime <10)
            return false;

        hmap.put(message, timestamp);
        return true;

    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
