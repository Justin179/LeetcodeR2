package com.leetcode.picp50;

public class MiniumPathSum {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int pathSum = minPathSum(grid);
        System.out.println(pathSum);
    }

    public static int minPathSum(int[][] grid) {
        if(grid==null||grid.length==0)
            return 0;

        int[][] dp = new int[grid.length][grid[0].length];
        for(int i = 0; i<dp.length; i++){
            for(int j = 0; j<dp[i].length; j++){
                dp[i][j] = grid[i][j];
                // 累加前一個，前一個只可能來自左邊或上面
                if(i>0&&j>0){ // dp累加小的那一邊的數
                    dp[i][j] += Math.min(dp[i][j-1],dp[i-1][j]);
                } else if (i==0 && j>0){
                    dp[i][j] += dp[i][j-1];
                } else if (j==0 && i>0){
                    dp[i][j] += dp[i-1][j];
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}
