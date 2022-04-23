package com.leetcode.topinterviewqs.easy.array;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
    }

    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] res = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            int pos = (i+k)%size;
            res[pos] = nums[i];
        }

        for (int i = 0; i<nums.length; i++){
            nums[i] = res[i];
        }
    }


}
