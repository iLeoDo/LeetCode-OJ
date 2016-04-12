/*
    https://leetcode.com/problems/powx-n/

    Implement pow(x, n).

    @tags: Math, Binary Search
*/

public class P050_Pow{
    /**
     * Recursive
     */
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            n = -n;
            x = 1/x;
        }
        if(n%2==0){
            double t = myPow(x,n/2);
            return t*t;
        }else{
            double t = myPow(x,n/2);
            return x * t * t;
        }

    }

    /**
     * Iterative
     */
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            double old = n;
            n = -n;
            if(n==old){
                n = n -1;
                x = x * x;
            }
            x = 1/x;
        }
        double ans = 1;
        while(n>0){
            if(n%2==1) ans *= x;
            x *= x;
            n >>= 1;
        }
        return ans;

    }

}
