package com.interview.leetcode.october;

public class ProductExceptSelf_Prob238 {

    public void test()
    {
        int i = 10;
        int j = i++;
        int k =  j++;

        System.out.println(" \n "+i+" , "+j+" , "+k);
    }


    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int output[] = new int[len];

        int product = 1;

        for(int i=0;i<len;i++)
        {
            output[i] = product;
            product*= nums[i];
        }

        for(int i:output)
            System.out.print(i+" ");

        product = 1;

        for (int i = len-1;i>=0;i--)
        {
            output[i] *= product;
            product*=nums[i];
        }

        System.out.print("\nFinal Output : ");

        for(int i:output)
            System.out.print(i+" ");

        return output;
    }

    public static void main(String argv[])
    {
        ProductExceptSelf_Prob238 p = new ProductExceptSelf_Prob238();
        int input[] = {1,2,3,4};

        p.productExceptSelf(input);
        p.test();
    }
}
