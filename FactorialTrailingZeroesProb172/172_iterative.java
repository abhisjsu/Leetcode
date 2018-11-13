/*
172. Factorial Trailing Zeroes
DescriptionHintsSubmissionsDiscussSolution
Given an integer n, return the number of trailing zeroes in n!.


First iteration Computes the number of factors of 5
Second iteration computes the number of factors of 25 and so on..

Beat %age = 6.98%
*/
class Solution {
    public int trailingZeroes(int n) {

    if (n < 0)
		return -1;

	int count = 0;

    while(n>0)
    {
            n/=5;
            count+=n;
    }

	return count;

    }
}
