package com.leetcode.picp50;

public class P34 {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }

    static Tree deleteNodeBst(Tree root, int num){
        // your code here
        if(root==null)
            return root;
        if(num < root.data)
            root.left = deleteNodeBst(root.left,num);
        else if(num > root.data)
            root.right = deleteNodeBst(root.right,num);
        else { // 對到
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else {
                Tree minNode = getMinNode(root.right);
                root.data = minNode.data;
                root.right = deleteNodeBst(root.right, root.data);
            }
        }

        return root;
    }

    private static Tree getMinNode(Tree root) {
        while (root.left!=null)
            root = root.left;
        return root;
    }


//    static Tree getMinNode(Tree root){
//        while(root.left != null) root = root.left;
//        return root;
//    }

//    static Tree deleteNodeBst(Tree root, int num){
//        if(root == null){
//            return null;
//        }else if(num < root.data){
//            root.left = deleteNodeBst(root.left, num);
//        }else if(num > root.data){
//            root.right = deleteNodeBst(root.right, num);
//        }else{ // 對到
//            if(root.left == null){ // 一邊為空，直接拿另一邊接上即可
//                return root.right;
//            }else if(root.right == null) {
//                return root.left;
//            }else{
//                Tree successor = getMinNode(root.right);
//                root.data = successor.data;
//                root.right = deleteNodeBst(root.right, successor.data);
//            }
//        }
//        return root;
//    }
}
