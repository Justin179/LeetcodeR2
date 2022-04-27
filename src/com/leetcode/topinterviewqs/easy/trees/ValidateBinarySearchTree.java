package com.leetcode.topinterviewqs.easy.trees;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode root, Integer max, Integer min) { //
        if (root==null)
            return true;

        if (max!=null&&root.val>=max)
            return false;
        else if (min!=null&&root.val<=min) {
            return false;
        } else if (root.left!=null && root.left.val>= root.val){
            return false;
        } else if (root.right!=null && root.right.val<= root.val){
            return false;
        }

        boolean left = dfs(root.left, root.val, min); // true
        boolean right = dfs(root.right, max, root.val); // min 5

        return left && right;
    }
}
