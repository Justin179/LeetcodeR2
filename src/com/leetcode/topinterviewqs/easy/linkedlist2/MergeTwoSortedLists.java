package com.leetcode.topinterviewqs.easy.linkedlist2;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;

        while (list1 != null && list2 != null) {
            int val1 = list1.val;
            int val2 = list2.val;
            if (val1<val2){
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1!=null)
            curr.next = list1;
        if (list2!=null)
            curr.next = list2;

        return head.next;
    }
}
