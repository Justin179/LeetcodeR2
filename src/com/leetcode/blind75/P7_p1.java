package com.leetcode.blind75;

public class P7_p1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,2};
//        int[] nums = new int[]{4,5,6,7,0,1,2};
//        int[] nums = new int[]{11,13,15,17};
//        int[] nums = new int[]{1,2};
        int res = findMin(nums);
        System.out.println(res);
    }

    public static int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            int mid = left + (right-left)/2;
            if(mid>0 && nums[mid-1]>nums[mid])
                return nums[mid];
            else if (nums[left]<=nums[mid] && nums[mid]>nums[right]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return nums[left];
    }


}




















