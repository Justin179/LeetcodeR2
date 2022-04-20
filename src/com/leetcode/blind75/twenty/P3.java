package com.leetcode.blind75.twenty;

import java.util.HashSet;
import java.util.Set;

public class P3 {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
        return set.size()!=nums.length;
    }
}
