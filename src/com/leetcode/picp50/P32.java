package com.leetcode.picp50;

public class P32 {
    static int subsetsThatSumUpToK(int[] arr, int k){
        return subsetsThatSumUpToK(arr, k, 0, 0);
    }
    static int subsetsThatSumUpToK(int[] arr, int k, int i, int sum){
        if(sum == k)
            return 1;
        else if(sum > k || i >= arr.length)
            return 0;
        else
            return  subsetsThatSumUpToK(arr, k, i+1, sum + arr[i]) +
                    subsetsThatSumUpToK(arr, k, i+1, sum);
    }
}
