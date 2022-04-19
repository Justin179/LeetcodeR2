package com.leetcode.fundamentals;

public class Lc110_13th {

    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;

        int left = maxHeight(root.left);
        int right = maxHeight(root.right);

        if (Math.abs(left-right)>1)
            res = false;

        return res;
    }

    private int maxHeight(TreeNode root) {
        if (root==null)
            return 0;

        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        if (Math.abs(left-right)>1){
            res = false;
            return -1;
        }

        return 1 + Math.max(left,right);
    }
}















