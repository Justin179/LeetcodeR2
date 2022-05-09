package com.leetcode.topinterviewqs.easy.array2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i<nums.length; i++){
            int key = target-nums[i]; // 7
            if (map.containsKey(key)){
                int pair = map.get(key).intValue();
                if (i==pair)
                    continue;
                else
                    return new int[]{i,pair};
            }
        }

        return null;
    }
}
