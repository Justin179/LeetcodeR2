package com.leetcode.picp50;

public class Maximumsubarray {
    static int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];

        int accumulatedSum = 0; // 注意
        int maxSum = nums[0]; // 注意
        // -2, -1
        for(int i = 0; i<nums.length; i++){
            if(accumulatedSum<0) // 注意
                accumulatedSum = 0;
            accumulatedSum+=nums[i];
            maxSum = Math.max(accumulatedSum, maxSum);
        }
        return maxSum;
    }
}
