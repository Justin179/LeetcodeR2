package com.leetcode.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Lc46_p1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> res = permute(nums);
        System.out.println(res);
    }

    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[n];
        backtrack(nums,res,list,used);
        return res;
    }

    private static void backtrack(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] used) {
        int n = nums.length;
        if (list.size()==n){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i<n; i++){ // 0 1 2
            if (used[i])
                continue; // 用過的，就跳過此輪向前轉
            list.add(nums[i]);
            used[i] = true;
            backtrack(nums,res,list,used);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }

}


















