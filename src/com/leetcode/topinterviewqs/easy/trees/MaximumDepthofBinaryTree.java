package com.leetcode.topinterviewqs.easy.trees;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root==null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);

        return 1 + Math.max(left,right);
    }
}
