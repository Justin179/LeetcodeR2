package com.leetcode.fundamentals;

public class Lc53_6th {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i<nums.length; i++){
            currSum+=nums[i];
            max = Math.max(max,currSum);
            if (currSum<0)
                currSum = 0;
        }
        return max;
    }
}



/*
    public int maxSubArray(int[] nums) {
                int n = nums.length;
        int max = nums[0];
        int currSum = 0;
        for (int i = 0; i<n; i++){
            currSum = currSum + nums[i];
            max = Math.max(max,currSum);
            if(currSum<0){
                currSum = 0;
                continue;
            }

        }

        return max;
    }
 */