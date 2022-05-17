package com.leetcode.topinterviewqs.medium.sorting_searching;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int res = findPeakElement(nums);
        System.out.println(res);
    }
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            int midVal = nums[mid];
            int midPlus1Val = nums[mid+1];
            if (midVal>midPlus1Val){ // 峰在左
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }
}
