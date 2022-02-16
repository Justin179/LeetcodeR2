package com.leetcode.yks11;

import java.util.HashMap;
import java.util.Stack;

public class LCA {

    public static TreeNode lca(TreeNode root, int j, int k) {
        Stack<TreeNode> pathToJ = pathToX(root,j);
        Stack<TreeNode> pathToK = pathToX(root,k);
        if(pathToJ==null||pathToK==null)
            return null;

        TreeNode lca = null;
        while (!pathToJ.isEmpty() && !pathToK.isEmpty()){
            TreeNode curJ = pathToJ.pop();
            TreeNode curK = pathToK.pop();
            if(curJ==curK)
                lca = curJ;
            else
                break;
        }

        return lca;
    }

    public static Stack<TreeNode> pathToX(TreeNode root, int x) {
        if(root==null)
            return null;
        if(root.value==x){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            return stack;
        }

        Stack<TreeNode> pathToLeft = pathToX(root.left,x);
        if(pathToLeft!=null){
            pathToLeft.push(root);
            return pathToLeft;
        }

        Stack<TreeNode> pathToRight = pathToX(root.right,x);
        if(pathToRight!=null){
            pathToRight.push(root);
            return pathToRight;
        }

        return null;
    }


    // Implement your function below.
//    public static TreeNode lca(TreeNode root, int j, int k) {
//        Stack<TreeNode> pathToJ = pathToX(root, j);
//        Stack<TreeNode> pathToK = pathToX(root, k);
//        if (pathToJ == null || pathToK == null) {
//            return null;
//        }
//
//        TreeNode lcaToReturn = null;
//
//        while (!pathToJ.isEmpty() && !pathToK.isEmpty()) {
//            TreeNode jPop = pathToJ.pop();
//            TreeNode kPop = pathToK.pop();
//            if (jPop == kPop) {
//                lcaToReturn = jPop;
//            } else {
//                break;
//            }
//        }
//        return lcaToReturn;
//    }
//
//    public static Stack<TreeNode> pathToX(TreeNode root, int x) {
//        if (root == null) {
//            return null;
//        }
//
//        if (root.value == x) {
//            Stack<TreeNode> path = new Stack<TreeNode>();
//            path.push(root);
//            return path;
//        }
//
//        Stack<TreeNode> leftPath = pathToX(root.left, x);
//        if (leftPath != null) {
//            leftPath.push(root);
//            return leftPath;
//        }
//
//        Stack<TreeNode> rightPath = pathToX(root.right, x);
//        if (rightPath != null) {
//            rightPath.push(root);
//            return rightPath;
//        }
//
//        return null;
//    }


}

