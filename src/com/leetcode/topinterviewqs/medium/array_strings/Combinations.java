package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> list = combine(4,2);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(n,k,res,list,1);

        return res;
    }

    private static void dfs(int n, int k, List<List<Integer>> res, List<Integer> list,int start) {
        if (list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i<=n; i++){
            list.add(i);
            dfs(n,k,res,list,i+1);
            list.remove(list.size()-1);
        }

    }
}
























