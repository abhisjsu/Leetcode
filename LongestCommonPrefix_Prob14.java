package com.interview.leetcode.september;

public class LongestCommonPrefix_Prob14 {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0)
            return "";

        String prefix  = strs[0];
        int len = strs.length;

        for(int i=0;i<len;i++)
        {
            if(strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
                i =0;
            }

        }

        return prefix;
    }


}

