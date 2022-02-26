package com.leetcode.picp50;

public class Reverseabinarytree {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }
/*
Input: root = [1, 2, 3, 4, 5, 6, 7]
Output: [1, 3, 2, 7, 6, 5, 4]
 */
    static void reverseTree(Tree root){
        // your code here
        if(root==null)
            return;
        // do the job for this node
        Tree left = root.left;
        Tree right = root.right;
        root.left = right;
        root.right = left;
        // go left
        reverseTree(root.left);
        // go right
        reverseTree(root.right);

    }
}
