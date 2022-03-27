package com.leetcode.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P9_p1 {
    /*
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
     */
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
//        int[] nums = new int[]{-2,0,0,2,2};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);
    }

    // -4 -1 -1 0 1 2
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i<n-2; i++){
            int currNum = nums[i];

            // 此輪上輪已經跑過，就 continue
            if(i>0 && currNum==nums[i-1])
                continue;

            int j = i+1;
            int k = n-1;

            while (j<k){
                int sum = currNum + nums[j] + nums[k];
                if (sum==0){
                    res.add(Arrays.asList(currNum,nums[j],nums[k]));

                    // 先預判下一個
                    while (j<k && nums[j]==nums[j+1])
                        j++;
                    while (j<k && nums[k]==nums[k-1])
                        k--;

                    j++;
                    k--;
                } else if (sum>0){
                    k--;
                } else {
                    j++;
                }

            }

        }

        return res;
    }
}
































