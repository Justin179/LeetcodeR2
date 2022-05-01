package com.leetcode.topinterviewqs.medium.trees_graphs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    // 22.5.1 done
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res,root);
        return res;
    }

    private void dfs(List<Integer> res, TreeNode root) {
        if (root==null)
            return;
        dfs(res,root.left);
        res.add(root.val);
        dfs(res,root.right);
    }
}
