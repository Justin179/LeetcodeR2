package com.leetcode.blind75;

public class P8 {

    public static void main(String[] args) {
//        int[] nums = new int[]{4,5,6,7,0,1,2};
//        int target = 0; // 4

//        int[] nums = new int[]{4,5,6,7,0,1,2};
//        int target = 3; // -1

//        int[] nums = new int[]{1};
//        int target = 0; // -1
        int[] nums = new int[]{1,3};
        int target = 3;
        int res = search(nums, target);
        System.out.println(res); // 1
    }

    /*
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0; // 4
     */
    // 找到最小值: find the pivot point 這樣就知道要對該點的左邊或是右邊進行binary search了
    public static int search(int[] nums, int target) {
        int n = nums.length;

        int left = 0;
        int right = n-1;
        int minIndex = findMinIndex(nums);

        if (target>=nums[minIndex] && target<=nums[right])
            left = minIndex;
        else
            right = minIndex-1;

        while (left<right){
            int mid = left + (right-left)/2;
            if (nums[mid] == target)
                return mid;
            else if (target>nums[mid])
                left = mid+1;
            else
                right = mid-1;
        }

        return nums[left]==target? left:-1;
    }

    public static int findMinIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            int mid = left + (right - left) / 2;
            if(mid>0 && nums[mid-1]>nums[mid])
                return mid;
            else if (nums[left] <= nums[mid] && nums[mid] > nums[right]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}






















