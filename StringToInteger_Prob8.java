package com.interview.leetcode.september;

public class StringToInteger_Prob8 {

    public int myAtoi(String str) {

        if (str ==null || str.length()<1)
            return 0;

        char input[] = str.toCharArray();
        int sign = 1;
        int i = 0;
        int len = input.length;

        for(i=0;i<len;i++)
        {
            if(input[i]=='-') {
                sign = -1;
                break;
            }
        }

        long result = 0;

        if(sign == 1)
            i = 0;

        for(int j=i;j<len;j++)
        {
            if(!Character.isDigit(input[j]))
                return (int)(sign*result);

            result = result*10 + (input[j] -'0');
        }

        return (int)(sign*result);

    }

    public static void main(String argv[])
    {
        StringToInteger_Prob8 s = new StringToInteger_Prob8();

        int len = s.myAtoi("-987");
        System.out.println(len);

    }
}
