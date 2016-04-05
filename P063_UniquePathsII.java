
public class P063_UniquePathsII{

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;

        int[] dp = new int[width];
        dp[0] = 1;
        for(int[] row : obstacleGrid){
            for(int i=0; i<width;i++){
                if(row[i]==1){
                    dp[i]=0;
                }else if(i>0){
                    dp[i] = dp[i]+dp[i-1];
                }
            }
        }
        return dp[width-1];
    }

    /**
     * In-Place Version;
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int i=0;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]==1){
                break;
            }else{
                obstacleGrid[i][0]=-1;
            }
        }
        for(int i=0;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i]==1){
                break;
            }else{
                obstacleGrid[0][i]=-1;
            }
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[i].length;j++){
                if( obstacleGrid[i][j]==1){
                    continue;
                }
                int up = obstacleGrid[i-1][j];
                int left = obstacleGrid[i][j-1];
                if(up==1&&left!=1){
                    obstacleGrid[i][j] = left;
                }else if(up!=1&&left==1){
                    obstacleGrid[i][j] = up;
                }else if(up==1&&left==1){
                    obstacleGrid[i][j] = 1;
                }else{
                    obstacleGrid[i][j] = up+left;
                }

            }
        }
        return Math.max(0,-obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]);
    }

}
