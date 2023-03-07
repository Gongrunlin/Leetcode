package Dynamicprogramming;

public class uniquePathsWithObstacles63 {
    public static void main(String[] args) {
        int[][] a = new int[5][10];
        System.out.println(a.length);
        System.out.println(a[0].length);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int hang = obstacleGrid.length;
        int lei = obstacleGrid[0].length;
        int[][] dp = new int[hang][lei];
        for (int i = 0; i < hang; i++) {//初始化
            for (int j = 0; j < lei; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 0; i < hang; i++) {
            if (obstacleGrid[i][0] != 1){
                dp[i][0] = 1;
            }
            else {
                break;
            }
        }
        for (int i = 0; i < lei; i++) {
            if (obstacleGrid[0][i] != 1){
                dp[0][i] = 1;
            }
            else {
                break;
            }
        }
        for (int i = 0; i < hang; i++) {//初始化
            for (int j = 0; j < lei; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[hang-1][lei-1];
    }
}
