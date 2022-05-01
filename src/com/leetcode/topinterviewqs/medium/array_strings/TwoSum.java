package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // 2 3 7 15
    public int[] twoSum(int[] nums, int target) {
        // two pointer
        int i = 0;
        int j = nums.length-1;
        while (i<j){
            int iVal = nums[i];
            int jVal = nums[j];
            if (target == iVal+jVal)
                return new int[]{i,j};
            else
                i++;
        }

        return null;
    }

}

/*
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int currNum = nums[i];
            int key = target-currNum;
            if (map.containsKey(key)){
                int pos = map.get(key);
                if (pos!=i)
                    return new int[]{pos,i};
            } else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
 */