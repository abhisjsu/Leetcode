package com.interview.leetcode.october;

public class FindCombination {

    public boolean checkCombination(int input[], int target, int start, int result)
    {

        boolean plus = false;
        boolean minus = false;

        for(int i = start;i<input.length;i++)
        {
            if(result + input[i] == target ||
            result - input[i] == target)
                return true;

            plus = checkCombination(input,target,i+1,result + input[i]);
            minus = checkCombination(input,target,i+1,result - input[i]);

            System.out.println(start +" , "+plus +" , "+minus);

            return plus || minus;

        }

        return false;
    }

    public static void main(String argv[])
    {
        FindCombination p = new FindCombination();
        int input[] = {1,13,57,17,19,35};

        System.out.println(p.checkCombination(input,-42,0,0));
    }
}
