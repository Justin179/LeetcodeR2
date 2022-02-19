package com.leetcode.tenccip;

import java.util.Arrays;

public class KthLargest {

    // {3,2,1,5,6,4}  2
    // 5
    static int findKthLargest(int[] nums, int k) {
        int leng = nums.length; // 6
        Arrays.sort(nums); // 1 2 3 4 5 6 -> 4
        return nums[leng-k]; // 6 - 2   = 4
    }
}
