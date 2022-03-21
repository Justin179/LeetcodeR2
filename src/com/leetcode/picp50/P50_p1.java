package com.leetcode.picp50;

import java.util.Arrays;

public class P50_p1 {
    public static void main(String[] args) {
//        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
        int res = lengthOfLIS(nums);
        System.out.println(res);
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for (int i = 1; i<n; i++){
            for (int j = 0; j<i; j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
        }

        Arrays.sort(dp);
        return dp[n-1];
    }
}
