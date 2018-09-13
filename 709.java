/*
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.



Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"

Beat %age: 100%

Algorithm: Calculate the difference in the ASCII values of 'A' and 'a'
  if any upper case character is encountered in the input add that difference to it.
*/

class Solution {
    public String toLowerCase(String str) {

        int difference  = 'a' - 'A';

        char input[] = str.toCharArray();

        int length = input.length;

        for(int i=0;i<length;i++)
        {
            if(input[i]>='A' && input[i]<='Z')
                input[i] = (char)((int)input[i] + difference);
        }

        return new String(input);

    }
}
