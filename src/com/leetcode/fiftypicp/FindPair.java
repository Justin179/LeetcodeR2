package com.leetcode.fiftypicp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindPair {
    /*
        int[] arr = new int[]{4, 5, 1, -3, 6};
        int k = 11;
     */
    static boolean findPair(int[] arr, int k){
        // your code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            int key = k - num; // 11 - 4 = 7
            if(map.containsKey(key)){
                return true;
            } else { // 沒成對
                map.put(num,1); // 4 5 1 -3
            }
        }

        return false;
    }


}
