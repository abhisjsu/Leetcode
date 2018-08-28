/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

Beat: 17.17
*/

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;

        if(s.length()==0 && t.length()==0)
            return true;

        Map<Character,Integer> map = new HashMap<>();

        char input1[] = s.toCharArray();
        char input2[] = t.toCharArray();
        int length =input1.length;

        for(int i=0;i<length;i++)
        {
            if(map.containsKey(input1[i]))
                map.put(input1[i],map.get(input1[i])+1);
            else
                map.put(input1[i],1);
        }

        for(int i=0;i<length;i++)
        {
            if(map.containsKey(input2[i]))
            {
                int val = map.get(input2[i]);
                if(val ==1)
                    map.remove(input2[i]);
                else
                    map.put(input2[i],map.get(input2[i])-1);
            }

            else
                return false;

        }

        if(map.size()==0)
            return true;
        else
            return false;


    }
}
