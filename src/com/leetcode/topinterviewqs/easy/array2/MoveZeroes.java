package com.leetcode.topinterviewqs.easy.array2;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        nums = new int[]{2,1};
//        nums = new int[]{4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
        System.out.println(nums);
    }

    public static void moveZeroes(int[] nums) {

        int i = 0;
        int j = 1;
        while (j<nums.length){
            while (i<nums.length && nums[i]!=0){
                i++;
                j++;
            }
            while (j < nums.length && nums[j] == 0)
                j++;

            if (j>=nums.length)
                break;


            int iVal = nums[i];
            int jVal = nums[j];
            if (iVal==0&&jVal!=0){
                swap(nums,i,j);
                i++;
                j++;
            }

        }


    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
