package com.leetcode.debugzone;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreefromInorderandPostorderTraversal().new Solution();
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        solution.buildTree(inorder,postorder);
    }
//leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for a binary tree node.     */
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        int[] inorder;
        int[] postorder;
        int last_index;
        Map<Integer,Integer> map = new HashMap<>();
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            this.inorder = inorder;
            this.postorder = postorder;
            int size = inorder.length;
            this.last_index = size-1;

            // trun inorder to a dictionary
            for(int i = 0; i<size; i++){
                map.put(inorder[i],i);
            }

            TreeNode treeNode = dfs(0,last_index);

            return treeNode;
        }

        public TreeNode dfs(int start, int end){
            // base case
            if(start>end)
                return null;

            // build current node
            int rootVal = postorder[last_index--];
            TreeNode currNode = new TreeNode(rootVal);
            int mid = map.get(rootVal); // 一刀切的中點

            // build right subtree
            currNode.right = dfs(mid+1, end);
            // build left subtree
            currNode.left = dfs(mid-1,start);

            // return current node
            return currNode;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
