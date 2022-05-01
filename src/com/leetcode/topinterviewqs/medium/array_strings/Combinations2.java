package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.ArrayList;
import java.util.List;

public class Combinations2 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> list = combine(nums,2);
    }

    // [1 2 3]
    // 1 2
    // 1 3
    // 2 3

    public static List<List<Integer>> combine(int[] nums, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, k, res, list, 0);

        return res;
    }

    private static void dfs(int[] nums, int k, List<List<Integer>> res, List<Integer> list, int start) {
        if (list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i<nums.length; i++){ // 0 1 2
            list.add(nums[i]);
            dfs(nums,k,res,list,i+1);
            list.remove(list.size()-1);
        }
    }


}
























