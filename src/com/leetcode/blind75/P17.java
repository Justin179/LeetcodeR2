package com.leetcode.blind75;

import java.util.Arrays;

public class P17 { // lc 300
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,3};
        int res = lengthOfLIS(nums); // 3
        System.out.println(res);
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        //     0 1 2 3
        // dp  1 1 1 1
        for (int i = n-1; i>=0; i--){ // 3 2 1 0
            for (int j = i+1; j<n; j++){ // 3<4
                if(nums[i]>=nums[j])
                    continue;

                dp[i] = Math.max(dp[i],1+dp[j]);
            }
        }

        Arrays.sort(dp);

        return dp[n-1];
    }
}












