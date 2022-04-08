package com.leetcode.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Lc46 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> res = permute(nums);
        System.out.println(res);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        boolean[] used = new boolean[n];
        backtrack(nums,list,res,used);
        return res;
    }

    private static void backtrack(int[] nums, List<Integer> list, List<List<Integer>> res, boolean[] used) {
        int n = nums.length;
        if (list.size() == n){
            res.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i<n; i++){ // 0 1 2
                if (used[i])
                    continue;
                list.add(nums[i]);
                used[i] = true;
                backtrack(nums, list, res, used);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }
    }
}
