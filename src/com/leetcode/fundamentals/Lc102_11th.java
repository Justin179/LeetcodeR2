package com.leetcode.fundamentals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lc102_11th {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i<size; i++){ // level order traversal
                TreeNode treeNode = q.poll();
                if (treeNode!=null){
                    list.add(treeNode.val);
                    if (treeNode.left!=null)
                        q.add(treeNode.left);
                    if (treeNode.right!=null)
                        q.add(treeNode.right);
                }
            }
            res.add(list);
        }

        return res;
    }
}
