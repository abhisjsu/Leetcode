/*

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Beat %age = 16.07%
*/

class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.equals("") || haystack.equals(needle))
            return 0;

        if(haystack.equals(""))
            return -1;

        int hlength = haystack.length();
        int nlength = needle.length();

        int lastIndex = hlength-nlength +1;

        for(int i=0;i<lastIndex;i++)
        {
            for(int j=0;j<nlength;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
                if(haystack.charAt(i+j)==needle.charAt(j) && j==nlength-1)
                    return i;
            }
        }


        return -1;

    }
}
