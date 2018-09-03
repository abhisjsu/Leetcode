/*
172. Factorial Trailing Zeroes
DescriptionHintsSubmissionsDiscussSolution
Given an integer n, return the number of trailing zeroes in n!.

Recursive version 

Beat %age = 6.98%
*/

class Solution {

    public int computeZeroes(int n)
    {
        if(n ==0)
            return 0;

        return n/5 + computeZeroes(n/5);
    }

    public int trailingZeroes(int n) {

    if (n < 0)
		return -1;

	int count = this.computeZeroes(n);

	return count;

    }
}
