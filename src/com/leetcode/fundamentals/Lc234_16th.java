package com.leetcode.fundamentals;

import java.util.Stack;

public class Lc234_16th {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reversed = reverse(slow);
        fast = head;
        ListNode temp = reversed;
        while (temp!=null){
            if (temp.val!=fast.val)
                return false;
            temp = temp.next;
            fast = fast.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}















