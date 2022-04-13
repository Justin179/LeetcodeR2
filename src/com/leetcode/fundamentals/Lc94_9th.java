package com.leetcode.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Lc94_9th {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.left = null;
        TreeNode temp1 = new TreeNode(2);
        root.right = temp1;
        temp1.left = new TreeNode(3);
//        temp1.right = null;
        List<Integer> list = inorderTraversal(root);
        System.out.println(list);
    }



    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null)
            return list;

        dfs(root,list);

        return list;
    }

    private static void dfs(TreeNode root, List<Integer> list) {
        if (root==null)
            return;

        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);

    }
}










