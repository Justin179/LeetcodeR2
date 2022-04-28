package com.leetcode.topinterviewqs.easy.dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n<=2)
            return n;

        int[] dp = new int[n]; // 5
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i<n; i++){ // 2 3 4
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n-1];
    }
}
