package com.interview.leetcode.october;

/*
Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
five characters, including the null character.)

Date : 11th October 2018
*/
public class Prob2_ReverseString {

    /*
     * Making use of Cache of to keep record of elements that have been previously occurred
     * ASCII value of the character has been used to keep the track
     * Space Complexity : O(N), we using an additional character array
     * Time Complexity : O(N), Getting the output in the single iteration
     */
    public String reverseInputString(String s)
    {
        char input[] = s.toCharArray();
        int start = 0;
        int end = s.length() -1;

        while(start<end)
        {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }
        return new String(input);
    }

    public static void main(String argv[])
    {
        Prob2_ReverseString p = new Prob2_ReverseString();

        String inputs[] ={ "abcdefghgijklmn", "hello", "abcd"};

        for(String input :inputs)
        {
            System.out.println(input+" : "+p.reverseInputString(input));
        }
    }

}
