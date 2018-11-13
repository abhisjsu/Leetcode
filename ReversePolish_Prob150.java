package com.interview.leetcode.october;

import java.util.Stack;
/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate
to a result and there won't be any divide by zero operation.
Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation:
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

* */
public class ReversePolish_Prob150 {

    public static Stack<Integer> stack = new Stack<>();

    static int evalRPN(String[] tokens) {

        int first = 0;
        int second = 0;
        int result = 0;

        for(String token : tokens)
        {
            switch (token)
            {
                case "+":
                    second  = stack.pop();
                    first = stack.pop();
                    result = first + second;
                    stack.push(result);
                    break;

                case "-":
                    second  = stack.pop();
                    first = stack.pop();
                    result = first - second;
                    stack.push(result);
                    break;

                case "/":
                    second  = stack.pop();
                    first = stack.pop();
                    result = first / second;
                    stack.push(result);
                    break;

                case "*":
                    second  = stack.pop();
                    first = stack.pop();
                    result = first * second;
                    stack.push(result);
                    break;

                default:
                    int current = Integer.parseInt(token);
                    stack.push(current);
            }
        }

        return stack.pop();
    }

    public static void main(String argv[])
    {
        String input[] = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        int result = evalRPN(input);

        System.out.println("The result is "+result);

    }
}
