package com.leetcode.topinterviewqs.medium.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoLinkedLists {

    public static void main(String[] args) {
        // LinkedListUtils
        int arr[] = { 4,1,8,4,5 };
        int arr2[] = { 5,6,1,8,4,5 };
        ListNode root = LinkedListUtils.arrayToList(arr, arr.length);
        ListNode root2 = LinkedListUtils.arrayToList(arr2, arr2.length);
        ListNode res = getIntersectionNode(root,root2);
        System.out.println(res);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode a = headA;
        ListNode b = headB;
        while (a!=null){
            set.add(a); // 是用記憶體位置為準
            a = a.next;
        }
        while (b!=null){
            if(set.contains(b))
                return b;
            b = b.next;
        }

        return null;
    }
}














