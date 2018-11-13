package com.interview.leetcode.september;

public class PlusOne_Prob66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

        for(int i=len -1;i>=0;i--)
        {
            if (digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i] =0;
            }
        }

        int output[] = new int[len+1];
        output[0] = 1;
        return output;
    }

    public void display(int input[])
    {
        for (int i : input)
            System.out.print(i+" ");
    }

    public static void main(String argv[])
    {
        PlusOne_Prob66 p = new PlusOne_Prob66();
        int input[] = {9,9,9,9};

        input = p.plusOne(input);
        p.display(input);
    }
}
