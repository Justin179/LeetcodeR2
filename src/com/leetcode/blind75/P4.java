package com.leetcode.blind75;

public class P4 {
    public int[] productExceptSelf(int[] nums) { // 1 2 3 4
        int n = nums.length;
        int[] a_array = new int[n];
        int[] b_array = new int[n];
        a_array[0] = 1;
        b_array[n-1] = 1;
        for (int i = 0; i<n-1; i++){
            a_array[i+1] = a_array[i]*nums[i];
        }
        for (int i = n-1; i>0; i--){
            b_array[i-1] = b_array[i]*nums[i];
        }
        for (int i = 0; i<n; i++){
            nums[i] = a_array[i]*b_array[i];
        }
        return nums;
    }
}
