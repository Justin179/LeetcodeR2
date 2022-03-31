package com.leetcode.blind75;

import java.util.Arrays;

public class P16_p1 { // lc 322
    public static void main(String[] args) {
        int[] coins = new int[]{1,3,4,5};
//        int[] coins = new int[]{2};
        int amount = 7;
        int res = coinChange(coins,amount);
        System.out.println(res); // 2 (3+4)
    }

    public static int coinChange(int[] coins, int amount) { // 1 3 4 5      7
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i<amount+1; i++){
            for (int coin : coins){ // 1 3 4 5
                if(i-coin <0)
                    continue;
                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }

        return dp[amount]>amount? -1: dp[amount];
    }
}





















