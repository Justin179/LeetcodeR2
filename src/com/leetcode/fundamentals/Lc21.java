package com.leetcode.fundamentals;

import java.util.LinkedList;
import java.util.List;

public class Lc21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        l1.next = a1;
        a1.next = a2;
        ListNode l2 = new ListNode(1);
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        l2.next = b1;
        b1.next = b2;

//        ListNode l1 = new ListNode();
//        ListNode l2 = new ListNode();

        mergeTwoLists(l1,l2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;

        while (list1!=null && list2!=null){
            if (list1.val <= list2.val){
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
                dummy = dummy.next;
        }
        if (list1!=null){
            dummy.next = list1;
        }
        if (list2!=null){
            dummy.next = list2;
        }

        return res.next;
    }
}









