package com.leetcode.topinterviewqs.easy.dp;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // -2 1 -3 4 -1 2 1 -5 4
        int[] dp = new int[nums.length];
        dp[0] = nums[0]; // -2
        int max = nums[0]; // -2

        for (int i = 1; i<nums.length; i++){
            dp[i] = Math.max(nums[i],(dp[i-1]+nums[i]));
            // 1
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
