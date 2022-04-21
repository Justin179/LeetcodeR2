package com.leetcode.blind75.fourty;

public class Lc62_24th {

    public static void main(String[] args) {
        int res = uniquePaths(3,2);
        System.out.println(res);
    }

    public static int uniquePaths(int m, int n) { // 3 2

        int[][] dp = new int[m+1][n+1];
        dp[m-1][n-1] = 1;

        for (int i = m-1; i>=0; i--){ // 2 1 0
            for (int j = n-1; j>=0; j--){
                if (j==n-1 && i==m-1)
                    continue;
                dp[i][j] = dp[i+1][j]+dp[i][j+1];
            }
        }

        return dp[0][0];
    }
}


