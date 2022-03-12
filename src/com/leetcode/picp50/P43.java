package com.leetcode.picp50;

import java.util.Arrays;
import java.util.Collections;

public class P43 {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }

    public static void main(String[] args) {
//        Tree root = new Tree(1);
//        Tree n2 = new Tree(2);
//        Tree n3 = new Tree(3);
//        Tree n4 = new Tree(4);
//        Tree n5 = new Tree(5);
//        root.left = n2;
//        root.right = n3;
//        n3.left = n4;
//        n3.right = n5;

        Tree root = new Tree(29);
        Tree n5 = new Tree(5);
        Tree n19 = new Tree(19);
        Tree n2 = new Tree(2);
        Tree n15 = new Tree(15);
        root.right = n5;
        n5.left = n19;
        n5.right = n2;
        n19.left = n15;

        int res = maxPathSum(root);
        System.out.println(res); // 68
    }

    static int maxPathSum(Tree root){
        // your code here
        max = root.data;

        dfs(root);

        return max;
    }

    static int max = 0;

    static int dfs(Tree root){
        if(root==null)
            return 0;

        int currVal = root.data;

        int leftVal = dfs(root.left);
        int rightVal = dfs(root.right);
        leftVal = Math.max(leftVal,0);
        rightVal = Math.max(rightVal,0);

        int sum = currVal+leftVal+rightVal;
        if(sum>max)
            max = sum;

        // return 只能挑大邊
        return currVal + max(leftVal,rightVal,0);
    }

    static int max(Integer... vals) {
        return Collections.max(Arrays.asList(vals));
    }
}
