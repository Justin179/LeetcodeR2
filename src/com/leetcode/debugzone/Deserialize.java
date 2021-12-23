package com.leetcode.debugzone;

import java.util.*;

public class Deserialize {

    public static void main(String[] args) {
        Deserialize.Solution solution = new Deserialize().new Solution();
        String data = "1,2,null,null,3,4,null,null,5,null,null,";
        solution.deserialize(data);
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

        public TreeNode deserialize(String data) {
            if(data==null)
                return null;

            String[] strArr = data.split(",");
            List<String> list = new LinkedList<>(Arrays.asList(strArr));

            TreeNode treeNode = buildTree(list);

            return treeNode;
        }
        // 1,2,None,None,3,4,None,None,5,None,None,
        public TreeNode buildTree(List<String> list){
            // base case
            if(list.get(0).equals("null")){
                list.remove(0);
                return null;
            }

            // curr
            Integer val = Integer.parseInt(list.get(0));
            TreeNode treeNode = new TreeNode(val);
            list.remove(0);

            // go left
            treeNode.left = buildTree(list);

            // go right
            treeNode.right = buildTree(list);

            return treeNode;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)


}
