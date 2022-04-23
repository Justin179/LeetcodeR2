package com.leetcode.topinterviewqs.easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            if (map.containsKey(i))
                return true;
            else
                map.put(i,1);
        }
        return false;
    }
}
