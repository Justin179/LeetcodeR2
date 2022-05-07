package com.leetcode.topinterviewqs.medium.trees_graphs;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        if (root==null)
            return -1;

        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        Integer res = list.get(k-1);

        return res;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root==null)
            return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}
