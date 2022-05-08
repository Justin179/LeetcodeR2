package com.leetcode.topinterviewqs.medium.trees_graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderSuccessorinBST {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root==null)
            return null;
        
        List<TreeNode> list = new ArrayList<>();
        dfs(root,p,list);

        for (int i = 0; i<list.size(); i++){ // 1 2 3
            if (list.get(i).val == p.val && (i+1)<list.size()){ // 1
                return list.get(i+1);
            }
        }

        return null;
    }

    private void dfs(TreeNode root, TreeNode p, List<TreeNode> list) {
        if (root==null)
            return;

        dfs(root.left, p, list);

        list.add(root);

        dfs(root.right, p, list);

    }

}














