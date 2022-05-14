package com.leetcode.topinterviewqs.easy.linkedlist2;


public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
