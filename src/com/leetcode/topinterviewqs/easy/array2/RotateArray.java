package com.leetcode.topinterviewqs.easy.array2;

public class RotateArray {
    // 1 2 3 4 5 6 7
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newNums = new int[n];
        for (int i = 0; i<n; i++){
            int nextIndex = (i+k)%n;
            newNums[nextIndex] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, n);
    }
}
