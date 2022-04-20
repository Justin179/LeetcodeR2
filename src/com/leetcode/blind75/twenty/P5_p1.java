package com.leetcode.blind75.twenty;

public class P5_p1 {
    public static void main(String[] args) {
        // {-2,1,-3,4,-1,2,1,-5,4} -> 6
        // {5,4,-1,7,8}; // -> 23
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
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
}

