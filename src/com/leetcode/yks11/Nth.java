package com.leetcode.yks11;

 class Node {
     int value;
     Node next;
     Node(int val, Node next) {
         this.value = val;
         this.next = next;
     }
 }

public class Nth {
    // // head2 = 1 -> 2 -> 3 -> 4 -> (null)
    //  nthFromLast(head2, 4) should return 1.
    //  nthFromLast(head2, 5) should return null.
    public static Node nthFromLast(Node head, int n) {
        Node left = head;
        Node right = head;
        for(int i = 0; i<n; i++){ // 4
            if(right==null)
                return null;
            right = right.next;
        }
        while (right!=null) {
            left = left.next;
            right = right.next;
        }

        return left;
    }

    // Implement your function below.
//    public static Node nthFromLast(Node head, int n) {
//        Node left = head;
//        Node right = head;
//
//        // First, make sure that we have at least n items in the linked list.
//        for (int i = 0; i < n; i++) {
//            if (right == null) return null;
//            right = right.child;
//        }
//        while (right != null) {
//            right = right.child;
//            left = left.child;
//        }
//        return left;
//    }


    //  NOTE: Feel free to use the following function for testing.
    //  It converts the given linked list into an easy-to-read string format.
    //  Example: 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
    public static String linkedListToString(Node head) {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(String.valueOf(current.value));
            sb.append(" -> ");
            current = current.next;
        }
        sb.append("(null)");
        return sb.toString();
    }
}

