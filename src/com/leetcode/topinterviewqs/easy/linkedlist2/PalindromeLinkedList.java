package com.leetcode.topinterviewqs.easy.linkedlist2;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reversed = reverseLinkedList(slow);
        while (reversed!=null){
            if (reversed.val != head.val)
                return false;
            reversed = reversed.next;
            head = head.next;
        }

        return true;
    }

    private ListNode reverseLinkedList(ListNode head) {
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
