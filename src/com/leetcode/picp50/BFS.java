package com.leetcode.picp50;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }

    static void bfs(Tree root){
        // your code here
        if(root==null)
            return;
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                Tree curr = queue.poll();
                if (curr!=null){
                    System.out.print(curr.data+ " ");
                    if(curr.left!=null)
                        queue.add(curr.left);
                    if(curr.right!=null)
                        queue.add(curr.right);
                }
            }
        }
        return;
    }
}
