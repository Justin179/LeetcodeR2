package com.leetcode.debugzone;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        Solution solution = new Bfs().new Solution();
        buildtree();
        List<List<Integer>> res = solution.levelOrder(root);
        System.out.println(res);

    }

    private static Integer[] nums = {3,9,20,null,null,15,7};
    private static TreeNode root;

    // 非本章學習重點(本方法僅模擬測試資料用）
    public static void buildtree () {
        if (nums.length < 0) return;
        if (nums[0] == null) return;

        // prepare Node instances
        TreeNode[] nodes_tmp = new TreeNode[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null) continue;
            nodes_tmp[i] = new TreeNode(nums[i]);
        }
        // set root
        root = nodes_tmp[0];

        for (int i = 0; i < nums.length; i++) {
            int i_left = (i + 1) * 2 - 1; // i_left_plus_one = (i_node_plus_one) * 2 -> i_left = i_left_plus_one - 1
            int i_right = (i + 1) * 2 + 1 - 1; // i_right_plus_one = (i_node_plus_one) * 2 + 1-> i_right = i_right_plus_one - 1

            TreeNode node = nodes_tmp[i];
            if (node == null) continue;

            if (i_left < nums.length) {
                node.left = nodes_tmp[i_left];
            }
            if (i_right < nums.length) {
                node.right = nodes_tmp[i_right];
            }
        }
    }




    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for a binary tree node. */
      public static class TreeNode {
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
        List<List<Integer>> res = new LinkedList<>();
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null)
                return res;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){

                List<Integer> list = new LinkedList<>();
                int size = queue.size();
                for(int i = 0; i<size; i++){
                    TreeNode node = queue.poll();
                    list.add(node.val);

                    if(node!=null){
                        if(node.left!=null)
                            queue.add(node.left);
                        if(node.right!=null)
                            queue.add(node.right);
                    }
                }
                res.add(list);

            }

            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)
}
