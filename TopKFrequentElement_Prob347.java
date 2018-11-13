package com.interview.leetcode.october;

import java.util.*;

public class TopKFrequentElement_Prob347 {

    class RepeatComparator implements Comparator<Integer>
    {
        Map<Integer,Integer> hmap;
        RepeatComparator(Map<Integer,Integer> hmap)
        {
            this.hmap = hmap;
        }

        @Override
        public int compare(Integer o1, Integer o2) {

            int countOne = hmap.get(o1);
            int countTwo = hmap.get(o2);
            return countTwo-countOne;
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> output = new ArrayList<>();

        Map<Integer, Integer> hmap = new HashMap<>();

        for(int num:nums)
        {
            int put = 1;
            if(hmap.containsKey(num))
            {
                put = hmap.get(num)+1;
            }

            hmap.put(num,put);
        }

        Set<Integer> keySet = hmap.keySet();


        PriorityQueue<Integer> queue = new PriorityQueue<>(keySet.size(), new RepeatComparator(hmap));

        for(int key: keySet)
        {
            queue.add(key);
        }

        for(int i=0;i<k;i++)
        {
            output.add(queue.poll());
        }

        return output;
    }

    public static void main(String argv[])
    {
        TopKFrequentElement_Prob347 p = new TopKFrequentElement_Prob347();
        int input[] = {1,1,1,1,1,1,2,2,2,3,3,3,3,3,3,4};

        System.out.println(p.topKFrequent(input,2));
    }


}
