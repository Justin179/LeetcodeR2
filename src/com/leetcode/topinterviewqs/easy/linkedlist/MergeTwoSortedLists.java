package com.leetcode.topinterviewqs.easy.linkedlist;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode b1 = new ListNode(4);
        ListNode a1 = new ListNode(2);
        ListNode head1 = new ListNode(1);
        head1.next = a1;
        a1.next = b1;

        ListNode b2 = new ListNode(4);
        ListNode a2 = new ListNode(3);
        ListNode head2 = new ListNode(1);
        head2.next = a2;
        a2.next = b2;

        ListNode mergedList = mergeTwoLists(head1,head2);
        System.out.println(mergedList);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        ListNode a = list1;
        ListNode b = list2;
        while (a!=null&&b!=null){
            if (a.val<=b.val){
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        if (a!=null){
            temp.next = a;
        } else if (b!=null) {
            temp.next = b;
        }


        return res.next;
    }
}

















