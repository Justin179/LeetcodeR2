package com.leetcode.blind75.fourty;

public class Lc55_25th {

    public static void main(String[] args) {
//        int[] nums = new int[]{2,3,1,1,4};
        int[] nums = new int[]{3,2,1,0,4};
        boolean res = canJump(nums);
        System.out.println(res);
    }

    public static boolean canJump(int[] nums) {

        int goal = nums.length-1;
        for (int i = nums.length-2; i>=0; i--){
            if (i+nums[i]>=goal)
                goal = i;
        }


        return goal==0;
    }
}
















