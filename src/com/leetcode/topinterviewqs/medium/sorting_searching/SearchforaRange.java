package com.leetcode.topinterviewqs.medium.sorting_searching;

public class SearchforaRange {

    public static void main(String[] args) {
        int[] nums = {1,2,3}; // {5,7,7,8,8,10};
        int target = 2;
        int[] res = searchRange(nums,target);
        System.out.println(res);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if (nums.length==0)
            return res;
        if (nums.length==1 && nums[0]==target)
            return new int[]{0,0};

        // 找頭
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            int midVal = nums[mid];
            if (midVal==target){
                if (mid==0 || nums[mid-1]<midVal){
                    res[0] = mid;
                    left = mid;
                    break;
                } else { // 左邊沒有比較小，代表頭在左
                    right = mid-1;
                }
            } else if (target>midVal){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        if (nums[left]!=target)
            return res;

        res[0] = left;
        // 找尾
        left = res[0];
        right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            int midVal = nums[mid];
            if (midVal==target){
                if (mid==nums.length-1 || nums[mid+1]>midVal){
                    res[1] = mid;
                    return res;
                } else { // 左邊沒有比較小，代表頭在左
                    left = mid+1;
                }
            } else if (target>midVal){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        res[1] = left;

        return res;
    }
}





















