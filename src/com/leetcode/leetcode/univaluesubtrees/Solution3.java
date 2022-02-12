package com.leetcode.leetcode.univaluesubtrees;

class Solution3 {
    int count = 0;

    public boolean isValidSubtree(TreeNode root, int parentVal){
        // subtree沒東西，就直接視為valid subtree
        if(root == null)
            return true;

        // 兩個都看，只要有一個subtree false, 就return false
        if(!isValidSubtree(root.left, root.val) | !isValidSubtree(root.right, root.val))
            return false;

        count++;

        // this is not a valid subtree if it's different from its parent
        return root.val == parentVal;
    }

    public int countUnivalSubtrees(TreeNode root) {
        if(root==null)
            return 0;
        isValidSubtree(root,0);
        return count;
    }
}
