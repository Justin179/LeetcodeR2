package com.ubiquiti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) { // lc 268
//        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int[] nums = new int[]{3,0,1};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    // 需找到更好的解法
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<=n; i++){
            map.put(i,i);
        }
        for (int i : nums){
            map.remove(i);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            return entry.getKey();
        }

        return 0;
    }
}
