/*
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

    Say you have an array for which the ith element is the price of a given 
    stock on day i.

    Design an algorithm to find the maximum profit. You may complete at most 
    two transactions.

    Note:
    You may not engage in multiple transactions at the same time (ie, you must 
    sell the stock before you buy again).

    @tags: Array, Dynamic Programming
*/

public class P123_BestTimeToBuyAndSellStockIII{
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0){
            return 0;
        }
        int[][] dp = new int[3][n];
        int maxProfitToday = 0;
        for(int i = 1 ;i<n;i++){
            maxProfitToday = Math.max(0,maxProfitToday+prices[i]-prices[i-1]);
            dp[1][i] = Math.max(dp[1][i-1],maxProfitToday);
        }

        int exp = dp[1][0]-prices[0];
        // Max(fi) dp[1][fi] + prices[i]-prices[fi]
        // = Max(fi) dp[1][fi]-prices[fi] //exp
        for(int i = 1;i<n;i++){
            exp = Math.max(exp,dp[1][i]-prices[i]);
            dp[2][i] = Math.max(dp[2][i-1],prices[i]+exp);
        }
        return dp[2][n-1];

    }
}
