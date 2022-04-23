package com.leetcode.topinterviewqs.easy.array;

public class Remove_Duplicates_from_Sorted_Array {


    public int removeDuplicates(int[] nums) {

        int a = 0;
        int b = 0;

        while (b<nums.length){
            if (nums[a] == nums[b])
                b++;
            else {
                a++;
                nums[a] = nums[b];
            }
        }


        return a+1;
    }
}





