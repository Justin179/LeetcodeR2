package com.leetcode.tenccip;

public class FirstAndLastIndexInSortedArray {

    // {2,4,5,5,5,5,5,7,9,9},   target: 5
    // 2, 6
    static int[] findFirstAndLastIndexInSortedArray(int[] nums, int target){
        if(nums.length==0 || target<nums[0] || target>nums[nums.length-1])
            return new int[]{-1,-1};

        int leftI = findFirstIndex(nums,target);
        int rightI = findLastIndex(nums,target);

        return new int[]{leftI,rightI};
    }

    private static int findFirstIndex(int[] nums, int target) {
        if(nums[0] == target)
            return 0;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target && target>nums[mid-1])
                return mid;
            else if (target>nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }

    private static int findLastIndex(int[] nums, int target) {
        if(nums[nums.length-1]==target)
            return nums.length-1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target && nums[mid+1]>target)
                return mid;
            else if (target<nums[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }


}










