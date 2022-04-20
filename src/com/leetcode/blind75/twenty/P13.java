package com.leetcode.blind75.twenty;

import java.util.HashSet;
import java.util.Set;

public class P13 {
    // lc 268
    public static void main(String[] args) {
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int res = missingNumber(nums);
        System.out.println(res); // 8
    }

    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);

        int n = nums.length;
        for (int i = 0; i<=n; i++){ // 0 1 2 3
            if(!set.contains(i))
                return i;
        }

        return -1;
    }
}
