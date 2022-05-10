package com.leetcode.topinterviewqs.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> list = permute(nums);
        System.out.println(list);
    }

    static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        trackback(nums, list, visited);
        return res;
    }

    private static void trackback(int[] nums, List<Integer> list, boolean[] visited) {
        // base case
        if (list.size()== nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i<nums.length; i++){ // 本層 0 1 2
            if (visited[i])
                continue;

            list.add(nums[i]);
            visited[i] = true;
            trackback(nums,list,visited);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }
}




















