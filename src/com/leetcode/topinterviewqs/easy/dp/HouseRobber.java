package com.leetcode.topinterviewqs.easy.dp;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length==1)
            return nums[0];
        if (nums.length==2)
            return Math.max(nums[1], nums[0]);

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        // 1 2 3 1
        // 1 2
        for (int i = 2; i<nums.length; i++){
            dp[i] = Math.max((nums[i]+dp[i-2]),dp[i-1]);
        }

        return dp[nums.length-1];
    }
}
