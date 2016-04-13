/*
    You are climbing a stair case. It takes n steps to reach to the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can
    you climb to the top?

    @tags: Dynamic Programming
 */
public class P070_ClimbingStairs{

    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }

        int oneToI = 2;
        int twoToI = 1;
        int all = 0;
        for(int i = 3; i<=n; i++){
            all = oneToI + twoToI;
            twoToI = oneToI;
            oneToI = all;
        }
        return all;
    }

    /**
     * Recursive (Time Limit Exceeded)
     */
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

}
