package com.leetcode.blind75;

public class P4_p1 {
    public int[] productExceptSelf(int[] nums) { // 1 2 3 4
        int n = nums.length;
        int[] tempA = new int[n];
        int[] tempB = new int[n];
        tempA[0] = 1;
        tempB[n-1] = 1;
        for (int i = 0; i<n-1; i++)
            tempA[i+1] = nums[i]*tempA[i];
        for (int i = n-1; i>0; i--)
            tempB[i-1] = nums[i]*tempB[i];
        for (int i = 0; i<n; i++)
            nums[i] = tempA[i]*tempB[i];
        return nums;
    }
}
