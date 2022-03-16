package com.leetcode.picp50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P46_sol {
    public static void main(String[] args) {
        int amount = 11;
        int[] coins = new int[]{1,2,5};
        int res = leastCoins(coins, amount);
        System.out.println(res);
    }

    public static int leastCoins(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        for(int i = 1; i<=amount; i++){
            for(int j = 0; j<coins.length; j++){ // 1 2 5
                if(i>=coins[j]){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount]>amount?-1:dp[amount];
    }













//    public static int leastCoins(int[] coins, int amount) {
//        // This table will store the answer to our sub problems
//        int[] dp = new int[amount + 1];
//
//        // Initialize the dp table
//        Arrays.fill(dp, amount + 1);
//
//    /*
//      The answer to making change with minimum coins for 0
//      will always be 0 coins no matter what the coins we are
//      given are
//    */
//        dp[0] = 0;
//
//
//        // Solve every subproblem from 1 to amount
//        for (int i = 1; i <= amount; i++) {
//            // For each coin we are given
//            for (int j = 0; j < coins.length; j++) {
//                // If it is less than or equal to the sub problem amount
//                if (coins[j] <= i) {
//                    // Try it. See if it gives us a more optimal solution
//                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
//                }
//            }
//        }
//
//    /*
//      dp[amount] has our answer. If we do not have an answer then dp[amount]
//      will be amount + 1 and hence dp[amount] > amount will be true. We then
//      return -1.
//
//      Otherwise, dp[amount] holds the answer
//    */
//        return dp[amount] > amount ? -1 : dp[amount];
//    }
}
