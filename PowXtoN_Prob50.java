package com.interview.leetcode.september;

/*
Implement pow(x, n), which calculates x raised to the power n (xn).
*/

public class PowXtoN_Prob50 {

    public double myPowRecursive(double N, int pow)
    {
        if(pow ==0)
            return 1.0;
        if(pow %2 ==0)
            return myPowRecursive(N,pow/2)*myPowRecursive(N,pow/2);
        else
            return N*myPowRecursive(N,pow-1);
    }

    public double computeHelperPower(double x, int n)
    {
        if(n>0)
            return myPowRecursive(x,n);
        else
            return 1/myPowRecursive(x,(-1)*n);
    }

    public double myPow(double x, int n) {
        if(n ==0)
            return 1.0;

        return computeHelperPower(x,n);
    }


    public static void main(String argv[])
    {
        PowXtoN_Prob50 p = new PowXtoN_Prob50();

        System.out.println(p.myPow(2.00000, 10));
        System.out.println(p.myPow(2.10000, 3));
        System.out.println(p.myPow(2.00000, -2));
    }
}
