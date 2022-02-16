package com.leetcode.yks11;

public class BST {

    // Implement your function below.
    public static boolean isBST(TreeNode node) {
        return isBstHelper(node, null, null);
    }

    public static boolean isBstHelper(TreeNode node, Integer lowerLim, Integer upperLim) {
        if (lowerLim!=null&&node.value<lowerLim)
            return false;
        if (upperLim!=null&&node.value>upperLim)
            return false;

        boolean leftOK = true;
        boolean rightOK = true;

        if(node.left!=null)
            leftOK = isBstHelper(node.left,lowerLim,node.value);
        if(node.right!=null)
            rightOK = isBstHelper(node.right,node.value,upperLim);

        if(leftOK==false || rightOK==false)
            return false;
        else
            return true;
    }


//    public static boolean isBstHelper(TreeNode node, Integer lowerLim, Integer upperLim) {
//        if (lowerLim != null && node.value < lowerLim) return false;
//        if (upperLim != null && upperLim < node.value) return false;
//        boolean isLeftBST = true;
//        boolean isRightBST = true;
//        if (node.left != null) {
//            isLeftBST = isBstHelper(node.left, lowerLim, node.value);
//        }
//        if (isLeftBST && node.right != null) {
//            isRightBST = isBstHelper(node.right, node.value, upperLim);
//        }
//        return isLeftBST && isRightBST;
//    }



}

