package com.leetcode.picp50;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    static int[] removeDuplicates(int[] arr){
        // your code here
        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        int[] res = new int[set.size()];
        int pos = 0;
        for(int i : set){
            res[pos] = i;
            pos++;
        }
        return res;
    }
}
