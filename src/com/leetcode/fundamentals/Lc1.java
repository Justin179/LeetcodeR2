package com.leetcode.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Lc1 {

    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,11,15};
//        int target = 9;
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] res = twoSum(nums,target);
        System.out.println(res); //
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            map.put(nums[i], i); // 3,2,4
        }
        for (int i = 0; i<nums.length; i++){
            int diff = target - nums[i]; // 6 - 3 = 3
            if (map.containsKey(diff) && map.get(diff).intValue()!=i){
                return new int[]{i,map.get(diff)};
            }
        }

        return null;
    }
}
