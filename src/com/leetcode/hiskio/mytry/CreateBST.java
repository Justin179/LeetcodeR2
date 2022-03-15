package com.leetcode.hiskio.mytry;



public class CreateBST {

    public static void main(String[] args) {
        int[] nums = {5,2,6,1,4,7,3};
        CreateBST createBST = new CreateBST(nums);
        createBST.buildtree();
        System.out.println(root);
    }

    private int[] nums;
    private static BST_Node root;

    public CreateBST(int[] nums) {
        this.nums = nums;
    }

    public static class BST_Node {
        public BST_Node left;
        public BST_Node right;
        public int val;
        public String owner;

        public BST_Node(){}
        public BST_Node(int val, String owner) {
            this.val = val;
            this.owner = owner;
        }
        public BST_Node(int val) {
            this.val = val;
        }
    }

    public void buildtree() {
        for (int i = 0; i < this.nums.length; i++) {
            add(this.nums[i]);
        }
    }

    public void add(int val) {
        BST_Node root_after_add = add(this.root, val);
        if (this.root != root_after_add) {
            this.root = root_after_add;
        }

    }

    public static BST_Node add(BST_Node node, int val) {

        if(node==null)
            return new BST_Node(val);

        int currVal = node.val;
        if (val == currVal)
            System.out.println("Error! Duplicate Value!");
        else if(val<currVal){
            BST_Node left = add(node.left,val);
            if (node.left!=left)
                node.left = left;
        } else if(val>currVal){
            BST_Node right = add(node.right,val);
            if(node.right!=right)
                node.right = right;
        }

        return node;
    }
















//    public static BST_Node add(BST_Node node, int val) {
//
//        // found the right spot for inserting new node!
//        if (node == null) {
//            node = new BST_Node(val);
//            return node;
//        }
//
//        if (val == node.val) {
//            System.out.print("\nnode:" + val + " already exists. skip insert." );   // traverse stop
//        }else if (val < node.val) {
//            BST_Node node_child = add(node.left, val);                              // traverse left
//            if (node.left != node_child)
//                node.left = node_child;
//        }else if (val > node.val) {
//            BST_Node node_child = add(node.right, val);                             // traverse right
//            if (node.right != node_child)
//                node.right = node_child;
//        }
//        return node;
//    }
}
