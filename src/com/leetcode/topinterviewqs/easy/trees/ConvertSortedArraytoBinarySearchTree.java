package com.leetcode.topinterviewqs.easy.trees;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null || nums.length==0)
            return null;
        
        return makeBstFromSortedArray(nums,0,nums.length-1);
    }

    private TreeNode makeBstFromSortedArray(int[] nums, int left, int right) {
        if (nums==null)
            return null;
        if (left>right)
            return null;

        TreeNode treeNode = new TreeNode();
        int mid = left + (right - left) / 2;
        treeNode.val = nums[mid]; // 0
        TreeNode leftNode = makeBstFromSortedArray(nums, left, mid - 1); // 0 1
        TreeNode rightNode = makeBstFromSortedArray(nums, mid + 1, right);
        treeNode.left = leftNode;
        treeNode.right = rightNode;

        return treeNode;
    }
}
