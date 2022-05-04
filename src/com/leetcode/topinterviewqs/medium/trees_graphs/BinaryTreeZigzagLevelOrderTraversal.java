package com.leetcode.topinterviewqs.medium.trees_graphs;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int counter = 0;
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            for (int i = 0; i<size; i++){ // level order traversal
                TreeNode currNode = q.poll(); // 3
                if (currNode != null) {

                    if (counter%2!=0){
                        stack.add(currNode);
                    } else {
                        list.add(currNode.val);
                    }

                    if (currNode.left != null) // 放下一層的
                        q.add(currNode.left);
                    if (currNode.right != null)
                        q.add(currNode.right);
                }
            }
            if (counter%2!=0){
                while (!stack.isEmpty()){
                    TreeNode treeNode = stack.pop();
                    list.add(treeNode.val);
                }
            }
            res.add(list);
            counter++;
        }

        return res;
    }
}
