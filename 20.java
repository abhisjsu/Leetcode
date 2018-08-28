/*

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Beat Percentage: 17.26

*/

class Solution {
    public boolean isValid(String s) {

        char input[] = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(Character c: input)
        {
            switch(c)
            {
                case '{':
                    stack.push('}');
                    break;

                case '(':
                    stack.push(')');
                    break;

                case '[':
                    stack.push(']');
                    break;

                default:
                    if(stack.empty() || stack.pop()!=c)
                        return false;

            }
        }

        return stack.empty();
    }
}
