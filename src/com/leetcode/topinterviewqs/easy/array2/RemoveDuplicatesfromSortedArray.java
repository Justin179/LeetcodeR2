package com.leetcode.topinterviewqs.easy.array2;

public class RemoveDuplicatesfromSortedArray {
    // 0,0,1,1,1,2,2,3,3,4
    public int removeDuplicates(int[] nums) {
        // 第一個數字，永遠是unique
        int index = 1;
        for (int i = 0; i<nums.length-1; i++){
            if (nums[i]!=nums[i+1])
                nums[index] = nums[i+1];
        }

        return index;
    }
}
