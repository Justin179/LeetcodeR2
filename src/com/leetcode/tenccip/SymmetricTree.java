package com.leetcode.tenccip;

public class SymmetricTree {
    static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left,root.right);
    }

    static boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left==null&&right==null)
            return true;
        else if (left==null||right==null)
            return false;
        else {// 兩邊都有值
            if(left.value!= right.value)
                return false;
            else
                return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
        }
    }
}
