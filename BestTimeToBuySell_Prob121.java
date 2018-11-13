package com.interview.leetcode.september;

/*
* 121. Best Time to Buy and Sell Stock

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.*/


public class BestTimeToBuySell_Prob121 {

    public int maxProfit(int[] prices) {

        int len = prices.length;

        if(prices ==null || len < 2)
            return 0;

        int minVal  = prices[0];
        int profit = 0;


        for(int i=0;i<len;i++)
        {
            int current = prices[i];

            minVal = Math.min(minVal, current);
            profit = Math.max(profit, current -minVal);
        }

        return profit;


    }

    public static void main(String argv[])
    {
        BestTimeToBuySell_Prob121 p= new BestTimeToBuySell_Prob121();
        int input[] = {7,1,5,3,6,4};
        int val = p.maxProfit(input);

        System.out.println(val);
    }
}
