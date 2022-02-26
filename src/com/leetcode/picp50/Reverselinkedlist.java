package com.leetcode.picp50;

import java.util.Stack;

public class Reverselinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static class LinkedList{
        Node head;
        LinkedList(){
            this.head = null;
        }
        LinkedList(Node head){
            this.head = head;
        }
    }

    // 1 -> 2 -> 3 -> null
    static void reverseList(LinkedList list){
        // your code here
        Node head = list.head;
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while(head.next!=null){
            head = head.next;
            stack.push(head);
        }
        LinkedList res = new LinkedList(stack.pop());
        while(!stack.isEmpty()){
            res.head.next = stack.pop();
        }
        list = res;
    }
}
