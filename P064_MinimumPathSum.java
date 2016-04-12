/*
    https://leetcode.com/problems/minimum-path-sum/

    Given a m x n grid filled with non-negative numbers, find a path from top 
    left to bottom right which minimizes the sum of all numbers along its path.

    Note: You can only move either down or right at any point in time.

    @tags: Array, Dynamic Programming
*/

public class P064_MinimumPathSum{
    public int minPathSum(int[][] grid){
        int lenR = grid.length;
        int lenC = grid[0].length;
        int[] dp = new int[lenC];

        for(int r=0;r<lenR;r++){
            for(int i = 0; i<lenC; i++){
                if(i==0){ //first column
                    dp[i] = dp[0] + grid[r][i];
                }else{ // other columns
                    if(r==0){ // first row
                        dp[i] = dp[i-1]+grid[r][i];
                    }else{ // other rows
                        dp[i] = Math.min(dp[i-1],dp[i])+grid[r][i];
                    }
                }
            }
        }
        return dp[lenC-1];
    }
}
