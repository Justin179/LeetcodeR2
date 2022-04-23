package com.leetcode.topinterviewqs.easy.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i<nums.length; i++){
            int key = target - nums[i]; // 9-2 = 7
            if (map.containsKey(key) && map.get(key).intValue()!=i){
                return new int[]{map.get(key),i};
            }

        }
        return null;
    }
}
