package com.ubiquiti;

import java.util.*;

public class Q4 {
    public static void main(String[] args) { // lc 268
//        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int[] nums = new int[]{3,0,1};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    /*
        這個可以
     */
    public static int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : nums){
            sum1+=i;
        }

        for (int i = 0; i<=nums.length; i++){
            sum2+=i;
        }

        return Math.abs(sum1-sum2);
    }
}



/*  需找到更好的解法
    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        for (int i = 0; i<=nums.length; i++){ // 0 1 2 3
            if (!set.contains(i))
                return i;
        }
        return -1;
    }

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
 */
