package com.leetcode.topinterviewqs.medium.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        int carry = 0;
        ListNode head = new ListNode();
        ListNode curr = head;
        while (c1!=null || c2!=null){
            int c1Val = c1!=null? c1.val : 0;
            int c2Val = c2!=null? c2.val : 0;
            int sum = c1Val+c2Val+carry;
            if (sum>9)
                carry = 1;
            else
                carry = 0;
            int thisDigit = sum%10;
            ListNode currNode = new ListNode(thisDigit);
            curr.next = currNode;
            curr = curr.next;

            if (c1!=null)
                c1 = c1.next;
            if (c2!=null)
                c2 = c2.next;
        }
        if (carry==1){
            ListNode currNode = new ListNode(carry);
            curr.next = currNode;
        }

        return head.next;
    }
}
