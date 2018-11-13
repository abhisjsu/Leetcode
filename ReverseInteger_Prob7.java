package com.interview.leetcode.september;

public class ReverseInteger_Prob7
{
    public int reverse(int x)
    {
        long result = 0;
        int orig = x;

        while(x>0)
        {
            result = result*10 + x%10;
            x = x/10;

            if(result > Integer.MAX_VALUE ||
                result < Integer.MIN_VALUE){
                return 0;
            }
        }

        System.out.println("Original number: "+orig+" Reveresed number "+result);

        return (int)result;
    }


    public static void main(String argv[])
    {
        ReverseInteger_Prob7 r = new ReverseInteger_Prob7();
        r.reverse(1234);
        r.reverse(8987);
    }
}
