package com.leetcode.fundamentals;

public class Lc104_12th {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;

        int res = dfs(root);

        return res;
    }

    private int dfs(TreeNode root) {
        if (root==null)
            return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        return Math.max(left,right) + 1;
    }
}
