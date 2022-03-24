package com.leetcode.blind75;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class P6_p1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, -2, 4};
        nums = new int[]{-2, 3, 2, 4};
        nums = new int[]{-3,-1,-1};
        nums = new int[]{2,3,-2,4};
        int res = maxProduct(nums);
        System.out.println(res); // 6
    }

    // 2 3 -2 4
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int[] maxCurr = new int[n];
        int[] minCurr = new int[n];
        maxCurr[0] = nums[0];
        minCurr[0] = nums[0];
        for (int i = 1; i<n; i++){
            int a = nums[i]*maxCurr[i-1];
            int b = nums[i]*minCurr[i-1];
            maxCurr[i] = max(nums[i],a,b);
            minCurr[i] = min(nums[i],a,b);
        }

        Arrays.sort(maxCurr);

        return maxCurr[n-1];
    }

    public static int max(Integer... vals) {
        return Collections.max(Arrays.asList(vals));
    }
    public static int min(Integer... vals) {
        return Collections.min(Arrays.asList(vals));
    }
}
