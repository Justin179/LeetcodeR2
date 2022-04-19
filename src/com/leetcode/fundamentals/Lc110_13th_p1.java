package com.leetcode.fundamentals;

public class Lc110_13th_p1 {

    // 一票否決，只要在過程中，有子樹的高差 大於1 就不平衡

    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;

        maxDepth(root);

        return res;
    }

    private int maxDepth(TreeNode root) {
        if (root==null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (Math.abs(left-right)>1)
            res = false;

        return 1 + Math.max(left,right);
    }

}















