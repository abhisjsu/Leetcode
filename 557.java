/*

557. Reverse Words in a String III

Given a string, you need to reverse the order of characters in each word within a sentence while
still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.

Beat %age: 61.7%

Solution: 1. Split the String by space delimiter
          2. Reverse each of the given String through the helper function reversed.
          3. Concatenate these individual Strings and return the trimmed String
*/


class Solution {
    public String reversed(String inp)
    {
        char input[] = inp.toCharArray();

        int start =0;
        int end = input.length -1;

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

    public String reverseWords(String s) {

        String input[] = s.split(" ");

        int length = input.length;

        for(int i = 0;i< length;i++)
        {
            input[i] = this.reversed(input[i]);
        }

        StringBuffer output = new StringBuffer();

        for(int i=0;i<length;i++)
        {
            output.append(input[i]+" ");
        }

        return new String(output).trim();
    }
}
