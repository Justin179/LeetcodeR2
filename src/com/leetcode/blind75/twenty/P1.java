package com.leetcode.blind75.twenty;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    /*
    Input: nums = [3,2,4], target = 6
    Output: [0,1]
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++)
            map.put(nums[i],i);

        for (int i = 0; i<nums.length; i++){
            int nextTarget = target-nums[i]; // 6 - 3 = 3
            Integer nextTargetIndex = map.get(nextTarget);
            if(nextTargetIndex != null && nextTargetIndex.intValue()!=i)
                return new int[]{i,map.get(nextTarget)};
        }

        return null;
    }
}
