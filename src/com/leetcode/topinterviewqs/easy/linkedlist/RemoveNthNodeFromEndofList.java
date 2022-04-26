package com.leetcode.topinterviewqs.easy.linkedlist;

public class RemoveNthNodeFromEndofList {

    // with the help of discuss
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }
}
