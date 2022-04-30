package com.leetcode.topinterviewqs.easy.others;

public class MissingNumber {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int realSum = 0;
        for (int i = 0; i<=n; i++){ // 0 1 2 3
            realSum+=i;
        }
        int lackSum = 0;
        for (int i : nums){
            lackSum+=i;
        }


        return realSum-lackSum;
    }
}
