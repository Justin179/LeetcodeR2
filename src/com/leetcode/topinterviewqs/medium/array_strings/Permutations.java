package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        permute(nums);
    }

    // 1 2 3
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums,res,list,visited);

        return res;
    }

    private static void dfs(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] visited) {
        if (list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i<nums.length; i++){
            int currVal = nums[i];
            if (!visited[i]){
                list.add(currVal);
                visited[i] = true;
                dfs(nums,res,list,visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
}














