package com.leetcode.topinterviewqs.medium.trees_graphs;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public static void main(String[] args) {
        /*
            preorder: 根 左 右 -> 第一個必為根節點
            inorder: 左 根 右  -> 做成map<value,index>
            拿根節點，去inorder找到根的位置，該根的左為左，該根的右為右
            https://www.youtube.com/watch?v=O39qED_LghU&t=300s
            TreeNode dfs(int start, int end) {
                // base case (s>e) return null
                // main task: build tree node
                // dive deeper (build left tree(s,mid-1), build right tree(mid+1,e)
                // return tree node
            }

         */
    }
/*
            Input:
            preorder = [3,9,20,15,7], 根 左 右
             inorder = [9,3,15,20,7] 左 根 右
            Output: [3,9,20,null,null,15,7]
 */
    int[] preorder;
    int[] inorder;
    int index = 0;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        // 把inorder 先做成map
        for (int i = 0; i<inorder.length; i++){
            map.put(inorder[i],i); // value and its position
        }

        TreeNode treeNode = dfs(0,preorder.length-1);
        return treeNode;
    }
    TreeNode dfs(int start, int end) {
        // base case
        if (start>end)
            return null;
        // main task: build tree
        TreeNode root = new TreeNode(preorder[index++]);
        int rootVal = root.val;
        // preorder: 3,9,20,15,7
        int mid = map.get(rootVal);
        // go left
        root.left = dfs(start,mid-1);
        // go right
        root.right = dfs(mid+1,end);

        return root;
    }
}
