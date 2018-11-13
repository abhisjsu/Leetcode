package com.interview.leetcode.october;

import java.util.Arrays;
/*
Implement an algorithm to determine if a string has all unique characters. What if you
can not use additional data structures?

Date : 11th October 2018
*/
public class Prob1_AllUniqueCharacters {

    /*
    * Making use of Cache of to keep record of elements that have been previously occurred
    * ASCII value of the character has been used to keep the track
    * Space Complexity : O(N)
    * Time Complexity : O(N)
    */
    public boolean allUniqueWithCache(String s)
    {
        boolean set[] = new boolean[256];

        char input[] = s.toCharArray();

        for(char ch:input)
        {
            int current = ch;
            if(Character.isLetterOrDigit(ch))
            {
                if(set[current]==true)
                    return false;
                else
                    set[current] = true;
            }
        }

        return true;
    }

    /*
     * Convert the String input to character array, and sort it using Arrays.sort
     * Match the consecutive elements in the sorted and return false if the match has occured
     * Space Complexity : O(N)
     * Time Complexity : O(N)
     */
    public boolean allUniqueWithoutCache(String s)
    {
        char input[] = s.toCharArray();
        Arrays.sort(input);
        int len = input.length;

        for(int i =1;i<len;i++)
        {
            if(input[i]==input[i-1])
                return false;
        }

        return true;
    }

    /*
     * Select the character at a particular index and check if it is there in elements to the right
     * Since the elements on the left have been already compared in the previous iterations
     * If the match is found then return false
     * Space Complexity : O(1)
     * Time Complexity : O(N*N)
     */
    public boolean allUniqueIterative(String s)
    {
        int len = s.length();

        for(int i= 0;i<len;i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                for (int j = i + 1; j < len; j++) {
                    if (s.charAt(i)==s.charAt(j))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String argv[])
    {
        Prob1_AllUniqueCharacters p = new Prob1_AllUniqueCharacters();
        String inputs[] ={ "abcdefghgijklmn", "helo"};

        for(String input :inputs)
        {
            System.out.println(input+" : "+p.allUniqueWithCache(input));
            System.out.println(input+" : "+p.allUniqueWithoutCache(input));
            System.out.println(input+" : "+p.allUniqueIterative(input));
        }

    }
}
