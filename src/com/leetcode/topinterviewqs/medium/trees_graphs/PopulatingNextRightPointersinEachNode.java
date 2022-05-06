package com.leetcode.topinterviewqs.medium.trees_graphs;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {
        if (root==null)
            return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i<size; i++){ // level order traversal
                Node curr = q.poll(); // 1
                if (curr!=null){
                    if (curr.left!=null){ // 因為是完美對稱，只要看一邊即可
                        q.add(curr.left);
                        q.add(curr.right);
                        // curr下面的左右連
                        curr.left.next = curr.right;
                        if (curr.next!=null){
                            Node next = curr.next;
                            curr.right.next = next.left;
                        }
                    }
                }
            }
        }
        return root;
    }
}
