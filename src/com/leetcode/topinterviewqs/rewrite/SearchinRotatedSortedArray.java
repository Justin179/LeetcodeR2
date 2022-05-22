package com.leetcode.topinterviewqs.rewrite;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int res = search(nums,4);
        System.out.println(res);
    }

    public static int search(int[] nums, int target) {
        if (nums.length==0)
            return -1;
        if (nums.length==1){
            if (nums[0]==target)
                return 0;
            else
                return -1;
        }

        int minIndex = findMin(nums);
        int left = 0;
        int right = nums.length-1;
        if (nums[minIndex] == target){
            return minIndex;
        } else if (minIndex<nums.length-1 && target>=nums[minIndex+1] && target<=nums[right]){
            return binarySearch(minIndex+1,right,nums,target);
        } else if (minIndex>0 && target<=nums[minIndex-1] && target>=nums[left]) {
            return binarySearch(left,minIndex-1,nums,target);
        } else
            return -1;
    }
    private static int binarySearch(int left, int right, int[] nums, int target) {

        while (left<right){
            int mid = left + (right-left)/2;
            if (nums[mid]==target){
                return mid;
            } else if (target>nums[mid])
                left = mid+1;
            else
                right = mid-1;
        }

        return nums[left]==target?left:-1;
    }


    public static  int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            if (mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            } else if (nums[left]<=nums[mid] && nums[right]<nums[mid]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}
