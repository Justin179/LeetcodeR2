package com.leetcode.blind75;

import java.util.ArrayList;
import java.util.List;

public class P20_p1 { // lc 39
    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        List<List<Integer>> res = combinationSum(candidates,target);
        System.out.println(res);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(candidates,target,res,list,0);
        return res;
    }

    private static void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int start) {
        int sum = 0;
        for (int i : list)
            sum+=i;
        if (sum>target)
            return;
        if (sum == target){
            res.add(new ArrayList<>(list));
            return;
        }
        // ---------------------
        for (int i = start; i<candidates.length; i++){
            list.add(candidates[i]);
            dfs(candidates,target,res,list,i);
            list.remove(list.size()-1);
        }
    }
}















