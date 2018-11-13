package com.interview.leetcode.november;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {

        Map<Character,Integer> hmap = new HashMap<>();

        char jewels[] = J.toCharArray();
        char stones[] = S.toCharArray();

        for(int i=0;i<stones.length;i++)
        {
            if(hmap.get(stones[i])!=null)
            {
                int prevcount = hmap.get(stones[i]);
                hmap.put(stones[i],prevcount+1);
            }
            else
            {
                hmap.put(stones[i],1);
            }
        }

        int jewelCount =0;

        for(int i=0;i<jewels.length;i++)
        {
            if(hmap.get(jewels[i])!=null)
                jewelCount +=hmap.get(jewels[i]);
        }

        return jewelCount;

    }
}
