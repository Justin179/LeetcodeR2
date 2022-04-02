package com.leetcode.blind75;

import java.util.Arrays;

public class P17_p1 { // lc 300
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,3};
        int res = lengthOfLIS(nums); // 3
        System.out.println(res);
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        dp[n-1] = 1;
        for (int i = n-2; i>=0; i--){
            for (int j = i+1; j<n; j++){
                if(nums[j]>nums[i])
                    dp[i] = Math.max(dp[i],1+dp[j]);
            }
        }
        Arrays.sort(dp);
        return dp[n-1];
    }
}












