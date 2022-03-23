package com.leetcode.blind75;

import java.util.Arrays;
import java.util.Collections;

public class P6 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, -2, 4};
        nums = new int[]{-2, 3, 2, 4};
        nums = new int[]{-3,-1,-1};
        nums = new int[]{2,3,-2,4};
        int res = maxProduct(nums);
        System.out.println(res); // 6
    }

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        int firstNum = nums[0];
        max[0] = firstNum;
        min[0] = firstNum;
        for (int i = 1; i<n; i++){
            int big = nums[i]*max[i-1];
            int small = nums[i]*min[i-1];
            max[i] = max(big,small,nums[i]);
            min[i] = min(big,small,nums[i]);
        }

        Arrays.sort(max);
        return max[n-1];
    }

    public static int max(Integer... vals) {
        return Collections.max(Arrays.asList(vals));
    }
    public static int min(Integer... vals) {
        return Collections.min(Arrays.asList(vals));
    }
}
