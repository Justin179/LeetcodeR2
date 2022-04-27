package com.leetcode.topinterviewqs.easy.trees;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left==null&&right==null)
            return true;
        else if (left==null || right==null) {
            return false;
        } else {
            if (left.val!= right.val)
                return false;
        }

        boolean outer = isSymmetric(left.left, right.right);
        boolean inner = isSymmetric(left.right, right.left);

        return outer && inner;
    }
}
