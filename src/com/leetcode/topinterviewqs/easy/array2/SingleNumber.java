package com.leetcode.topinterviewqs.easy.array2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            if (set.contains(i)){
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        Iterator value = set.iterator();
        Integer res = 0;
        while (value.hasNext())
            res = (Integer)value.next();

        return res;
    }
}
