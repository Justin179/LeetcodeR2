package com.leetcode.topinterviewqs.easy.linkedlist2;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow!=null){
            if (fast==slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
