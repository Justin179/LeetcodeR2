package com.leetcode.blind75;

import java.util.HashMap;
import java.util.Map;

public class P1_p1 {
    /*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i<n; i++)
            map.put(nums[i],i);

        for (int i = 0; i<n; i++){ // 2 7 11 15
            int remainder = target - nums[i]; // 9 - 2 = 7
//            int remainderIndex = map.get(remainder).intValue();
            Integer remainderIndex = map.get(remainder); // 1

            if (remainderIndex!=null && remainderIndex.intValue()!=i)
                return new int[]{i,remainderIndex.intValue()};

        }

        return null;
    }
}













