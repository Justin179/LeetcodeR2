package com.leetcode.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Lc1_p1 {

    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,11,15};
//        int target = 9;
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] res = twoSum(nums,target);
        System.out.println(res); //
    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i<n; i++){
            Integer key = target-nums[i]; // 6 - 3 = 3
            if (map.containsKey(key)){
                if (map.get(key).intValue()==i)
                    continue;
                else
                    return new int[]{i,map.get(key)};
            }

        }

        return null;
    }
}
















