package com.leetcode.fundamentals;

public class Lc100_10th {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null&&q==null){
            return true;
        } else if (p==null||q==null){
            return false;
        } else {
            // 兩個都不是null
            if (p.val!=q.val)
                return false;

            // 再向下層探
            boolean leftRes = isSameTree(p.left, q.left);

            boolean rightRes = isSameTree(p.right,q.right);

            if (!leftRes || !rightRes)
                return false;

            return true;
        }

    }
}
