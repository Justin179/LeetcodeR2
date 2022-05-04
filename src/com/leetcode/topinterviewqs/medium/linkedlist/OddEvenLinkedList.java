package com.leetcode.topinterviewqs.medium.linkedlist;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        int arr[] = {2,1,3,5,6,4,7};
        int n = arr.length;
        ListNode root = LinkedListUtils.arrayToList(arr, n);

        ListNode res = oddEvenList(root);

        LinkedListUtils.display(res);
    }



    public static ListNode oddEvenList(ListNode head) {
        if (head==null)
            return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }

        odd.next = evenHead;
        return head;
    }
}





















