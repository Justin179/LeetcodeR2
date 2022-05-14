package com.leetcode.topinterviewqs.medium.sorting_searching;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(nums);
    }
    // 0 0 1 1 2 2
    public static void sortColors(int[] nums) {
        int curr = 0;
        int left = 0;
        int right = nums.length-1;
        while (curr<=right&&left<right){
            int currVal = nums[curr];
            if (currVal==2){
                swap(nums,curr,right);
                right--;
            }else if (currVal==0){
                swap(nums,curr,left);
                curr++;
                left++;
            } else
                curr++;
        }
    }

    private static void swap(int[] nums, int curr, int leftOrRight) {
        int temp = nums[curr];
        nums[curr] = nums[leftOrRight];
        nums[leftOrRight] = temp;
    }
}
