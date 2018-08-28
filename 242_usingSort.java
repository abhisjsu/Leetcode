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

Beat : 37.37%
*/

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;

        if(s.length()==0 && t.length()==0)
            return true;

        char input1[] = s.toCharArray();
        char input2[] = t.toCharArray();

        Arrays.sort(input1);
        Arrays.sort(input2);

        if((new String(input1).equals(new String(input2))))
            return true;
        else
            return false;

    }
}
