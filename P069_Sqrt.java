/*
    https://leetcode.com/problems/sqrtx/

    Implement int sqrt(int x).

    Compute and return the square root of x.

    @tags: Math, Binary Search
*/

public class P069_Sqrt{
	public int mySqrt(int x) {
        long low = 0, high = x;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid*mid>x){
                high = mid-1;
            }else if(mid*mid<=x&&(mid+1)*(mid+1)>x){
                return (int)mid;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
