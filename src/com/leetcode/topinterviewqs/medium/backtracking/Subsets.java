package com.leetcode.topinterviewqs.medium.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(0,nums,list,res);

        return res;
    }

    private void backtrack(int start, int[] nums, List<Integer> list, List<List<Integer>> res) {
        // 一進來就快照
        res.add(new ArrayList<>(list));

        for (int i = start; i<nums.length; i++){ // 當start=3時，這塊不會執行 = return
            list.add(nums[i]);
            backtrack(i+1, nums, list, res);
            list.remove(list.size()-1);
        }
    }


}



















