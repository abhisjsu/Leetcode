Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true

class Solution {
    public boolean isPalindrome(String s) {

        char input[] = s.toUpperCase().toCharArray();

        int start = 0;
        int end = input.length-1;

        while(start<=end)
        {
            char startChar = input[start];
            char endChar = input[end];

            boolean checkAlphaNumericStart =    (startChar >= 'a' && startChar <= 'z') ||
                                                (startChar >= 'A' && startChar <= 'Z') ||
                                                (startChar >= '0' && startChar <= '9');

            boolean checkAlphaNumericEnd =  (endChar >= 'a' && endChar <= 'z') ||
                                            (endChar >= 'A' && endChar <= 'Z') ||
                                            (endChar >= '0' && endChar <= '9');

            if(!checkAlphaNumericStart)
            {
                start++;
                continue;
            }

            if(!checkAlphaNumericEnd)
            {
                end--;
                continue;
            }

            if(input[start++]!=input[end--])
                return false;
        }


        return true;
    }
}
