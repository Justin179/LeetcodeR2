package com.leetcode.blind75.fourty;

public class Lc198_21st {

    public static void main(String[] args) {
//        System.out.println(0%2); // 0
//        System.out.println(1%2); // 1
        // 0 1 2 3 4 5
        // 0 1 0 1 0 1
        int[] nums = new int[]{1,2,3,1,1,100};
        int res = rob(nums);
        System.out.println(res);
    }

    // 1,2,3,1,1,100
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length==1)
            return nums[0];
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }

        return dp[nums.length-1];
    }
}

/*
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i<nums.length; i++){
            dp[i+1] = Math.max(dp[i], dp[i-1]+nums[i]);
        }


        return dp[dp.length-1];
    }
 */


