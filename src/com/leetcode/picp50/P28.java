package com.leetcode.picp50;

import java.util.ArrayList;

public class P28 {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }

    static Tree lowestCommonAncestor(Tree root, int num1, int num2){
        ArrayList<Tree> pathNum1 = new ArrayList<Tree>();
        ArrayList<Tree> pathNum2 = new ArrayList<Tree>();
        if(!getPath(root, pathNum1, num1) || !getPath(root, pathNum2, num2))
            return null;

        int minLength = Math.min(pathNum1.size(), pathNum2.size());
        int i = 0;
        while(i < minLength){
            if(pathNum1.get(i).data == pathNum2.get(i).data) i++;
            else break;
        }
        return pathNum1.get(i-1);
    }

    static boolean getPath(Tree root, ArrayList<Tree> path, int num){
        if(root == null) return false;
        path.add(root);
        if(root.data == num) return true;
        if(getPath(root.left, path, num) || getPath(root.right, path, num))
            return true;
        path.remove(path.size()-1);
        return false;
    }
}
