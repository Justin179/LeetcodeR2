package com.leetcode.topinterviewqs.medium.sorting_searching;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,1,2,3};
        int res = findMin(nums);
        System.out.println(res);
    }
    public static int findMin(int[] nums) {
        if (nums.length==0)
            return -1;
        if (nums.length==1)
            return nums[0];

        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            if (mid>0 &&nums[mid-1]>nums[mid])
                return nums[mid];
            else if (nums[mid]>=nums[left] && nums[mid]>nums[right]) // 找右邊
                left = mid+1;
             else
                right = mid-1;
        }

        return nums[left];
    }
}























