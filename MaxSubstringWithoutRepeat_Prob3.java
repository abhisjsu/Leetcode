package com.interview.leetcode.september;

import java.util.Map;
import java.util.HashMap;

public class MaxSubstringWithoutRepeat_Prob3 {

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int i =0;
        int j=0;
        int len = s.length();
        char input[] = s.toCharArray();

        Map<Character,Integer> hmap = new HashMap<>();

        for(i=0;i<len;i++)
        {
            if(hmap.containsKey(input[i]))
            {
                j = Math.max(j, hmap.get(input[i])+1);
            }
            maxLength = Math.max(maxLength,i-j+1);
            hmap.put(input[i],i);
        }
        System.out.println("The max length is "+maxLength);
        return maxLength;
    }

//    public void testString()
//    {
//        System.out.println("aaaaabccekaaa".indexOf("abccek"));
//    }

    public static void main(String argv[])
    {
        MaxSubstringWithoutRepeat_Prob3 m = new MaxSubstringWithoutRepeat_Prob3();
        m.lengthOfLongestSubstring("abcabcbb");
    }
}
