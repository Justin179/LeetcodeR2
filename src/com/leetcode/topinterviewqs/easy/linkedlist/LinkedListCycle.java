package com.leetcode.topinterviewqs.easy.linkedlist;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow!=null){
            if (slow.val==fast.val)
                return true;

            if (fast==null||fast.next==null||fast.next.next==null)
                return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
