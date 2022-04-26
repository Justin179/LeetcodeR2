package com.leetcode.topinterviewqs.easy.linkedlist;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversed = reverse(slow);
        while (reversed!=null){
            if (reversed.val!=head.val)
                return false;
            reversed = reversed.next;
            head = head.next;
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
