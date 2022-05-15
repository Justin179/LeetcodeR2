package com.leetcode.topinterviewqs.medium.sorting_searching;

import java.util.Arrays;
import java.util.Collections;

public class KthLargestElementinanArray {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        int res = findKthLargest(nums,2);
        System.out.println(res);
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = nums.length-1; i>=0; i--){
            if (i== nums.length-k)
                return nums[i];
        }

        return 0;
    }
}
