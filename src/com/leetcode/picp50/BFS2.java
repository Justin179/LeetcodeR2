package com.leetcode.picp50;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS2 {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }

    static ArrayList<ArrayList<Integer>> getValuesByLevel(Tree root){
        // your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i<size; i++){ // 該層從左到右
                Tree curr = queue.poll();
                if(curr!=null){
                    list.add(curr.data);
                    if(curr.left!=null)
                        queue.add(curr.left);
                    if (curr.right!=null)
                        queue.add(curr.right);
                }
            }
            res.add(list);
        }

        return res;
    }
}



















