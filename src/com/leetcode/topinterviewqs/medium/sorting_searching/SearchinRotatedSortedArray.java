package com.leetcode.topinterviewqs.medium.sorting_searching;

public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,1,2,3};
        int res = search(nums,1);
        System.out.println(res);
    }

    public static int search(int[] nums, int target) {
        if (nums.length==0)
            return -1;
        if (nums.length==1 && nums[0]==target)
            return 0;

        int minIndex = findMin(nums);

        if (nums[minIndex]==target){
            return minIndex;
        } else if (target>nums[minIndex] && target<=nums[nums.length-1]){
            return binarySearch(minIndex+1,nums.length-1,nums,target);
        } else
            return binarySearch(0,minIndex-1,nums,target);
    }

    private static int binarySearch(int left, int right, int[] nums, int target) {
        while (left<right){
            int mid = left+(right-left)/2;
            if (nums[mid] == target){
                return mid;
            } else if (target>nums[mid]){
                left = mid+1;
            } else
                right = mid-1;

        }
        return nums[left]==target? left : -1;
    }


    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            if (mid>0 &&nums[mid-1]>nums[mid])
                return mid;
            else if (nums[mid]>=nums[left] && nums[mid]>nums[right]) // 找右邊
                left = mid+1;
            else
                right = mid-1;
        }

        return left;
    }
}
