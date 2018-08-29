/*
Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

*/

class Solution {

    public boolean checkPrime(int n)
    {
        int sqrt = (int)Math.sqrt(n)+1;
        for(int i=3;i<sqrt;i=i+2)
        {
            if(n%i==0)
                return false;
        }

        return true;
    }

    public int countPrimes(int n) {
        if(n<=2)
            return 0;

        int count = 1;
        for(int i = 3;i<n;i=i+2)
        {
            if(checkPrime(i))
                count++;

        }

        return count;
    }
}
