/*
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

    Say you have an array for which the ith element is the price of a given 

    stock on day i.

    If you were only permitted to complete at most one transaction (ie, buy one 
    and sell one share of the stock), design an algorithm to find the maximum 
    profit.

    @tags: Array, Dynamic Programming
*/

public class P121_BestTimeToBuyAndSellStock{

    /**
     * Dynamic Programming
     */
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int[] min = new int[prices.length];
        int maxProfit = 0;
        min[0] = prices[0];

        for(int i=1; i<prices.length;i++){
            min[i] = Math.min(min[i-1],prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-min[i]);
        }
        return maxProfit;
    }

    /**
     * Kadane's Algorithm : Maximum subarray problem
     */
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int maxProfit = 0, maxProfitToday = 0;

        for(int i=1; i<prices.length;i++){
            maxProfitToday = Math.max(0,maxProfitToday+prices[i]-prices[i-1]);
            maxProfit = Math.max(maxProfit,maxProfitToday);
        }
        return maxProfit;
    }

}
