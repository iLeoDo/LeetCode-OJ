/*
	https://leetcode.com/problems/factorial-trailing-zeroes/

	Given an integer n, return the number of trailing zeroes in n!.

	Note: Your solution should be in logarithmic time complexity.

	@tags: Math
*/

public class P172_FactorialTrailingZeroes{
    public int trailingZeroes(int n) {
        int cnt = 0;
        while(n>0){
            cnt += n/5;
            n/=5;
        }
        return cnt;
    }
}
