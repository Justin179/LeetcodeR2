package com.leetcode.topinterviewqs.medium.array_strings;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,4,5};
//        int[] nums = new int[]{5,4,3,2,1};
//        int[] nums = new int[]{2,1,5,0,4,6};
//        int[] nums = new int[]{20,100,10,12,5,13};
//        int[] nums = new int[]{1,5,0,4,1,3};
        int[] nums = new int[]{9,10,5,11,10,9,8};
        boolean res = increasingTriplet(nums);
        System.out.println(res);
    }

    public static boolean increasingTriplet(int[] nums) {
        int[] leftDp = new int[nums.length];
        leftDp[0] = nums[0];
        int[] rightDp = new int[nums.length];
        rightDp[nums.length-1] = nums[nums.length-1];

        // 左dp (到現在這個位置的最小值)
        for (int i = 1; i<nums.length; i++){
            leftDp[i] = Math.min(leftDp[i-1],nums[i]);
        }
        // 右dp (到現在這個位置的最大值)
        for (int i = nums.length-2; i>=0; i--){
            rightDp[i] = Math.max(rightDp[i+1], nums[i]);
        }

        for (int i = 1; i<nums.length-1; i++){
            int currVal = nums[i];
            int leftMin = leftDp[i-1];
            int rightMax = rightDp[i+1];
            if (currVal>leftMin && currVal<rightMax)
                return true;
        }

        return false;
    }



    // 概念上可行，但會超時
    // 1,5,0,4,1,3
//    private static boolean checkLeftAndRight(int mid, int[] nums) {
//        // mid = 2
//        int left = mid-1; // 1
//        int min = nums[left]; // 5
//        while (left>=0){
//            min = Math.min(min,nums[left]);
//            left--;
//        }
//
//        int right = mid+1;
//        int max = nums[right];
//        while (right<nums.length){
//            max = Math.max(max,nums[right]);
//            right++;
//        }
//
//        // 中間的 大於左側最小 && 小於右側最大
//        return (nums[mid] > min) && (nums[mid] < max);
//    }
}
