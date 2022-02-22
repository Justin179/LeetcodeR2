package com.leetcode.fiftypicp;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    // [1, 4, 2, 2, 5, 2]
    // 2
    static int findDuplicate(int[] arr){
        //your code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i))
                return i;
            else
                map.put(i,1);
        }
        return -1;
    }
}
