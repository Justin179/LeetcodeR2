package com.leetcode.topinterviewqs.easy.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
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
                TreeNode curr = q.poll();
                list.add(curr.val);
                if (curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
            }
            res.add(list);
        }
        return res;
    }
}
