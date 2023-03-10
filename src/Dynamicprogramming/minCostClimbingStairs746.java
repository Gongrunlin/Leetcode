package Dynamicprogramming;

import java.util.Arrays;

public class minCostClimbingStairs746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        if (cost.length==1){
            return cost[0];
        }
        if (cost.length == 2){
            Arrays.sort(cost);
            return cost[0];
        }
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
