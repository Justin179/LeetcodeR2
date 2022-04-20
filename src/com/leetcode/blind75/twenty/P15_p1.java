package com.leetcode.blind75.twenty;

public class P15_p1 { // 70
    public static void main(String[] args) {

        climbStairs(3);
    }

    public static int climbStairs(int n) { // 1 <= n <= 45
        int[] dp = new int[45];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i<45; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n-1];
    }
}
