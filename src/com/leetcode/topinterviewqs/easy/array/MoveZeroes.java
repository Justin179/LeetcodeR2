package com.leetcode.topinterviewqs.easy.array;

public class MoveZeroes {

    // 0 1 0 3 12
    // 1 0
    public void moveZeroes(int[] nums) {
        if (nums.length==1)
            return;

        int a = 0;
        int b = 0;
        while (b<nums.length){
            if (nums[a]==0 && nums[b]!=0){
                swap(a,b,nums);
                a++;
                b++;
            } else if (nums[a]==0 && nums[b]==0){
                b++;
            } else if (nums[a]!=0 && nums[b]!=0){
                b++;
            } else if (nums[a]!=0 && nums[b]==0){
                a++;
            }
        }

    }

    private void swap(int a, int b, int[] nums) { // 0 1
        int temp = nums[b]; // 1
        nums[b] = nums[a];
        nums[a] = temp;
    }


}
