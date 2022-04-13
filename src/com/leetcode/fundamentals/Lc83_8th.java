package com.leetcode.fundamentals;

public class Lc83_8th {

    public static void main(String[] args) {
        ListNode b = new ListNode(2);
        ListNode a = new ListNode(1,b);
        ListNode listNode = new ListNode(1,a);
        ListNode res = deleteDuplicates(listNode);
        System.out.println(res);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while (curr!=null){
            ListNode nextObj = curr.next;
            while (nextObj!=null && curr.val == nextObj.val){
                nextObj = nextObj.next;
            }
            curr.next = nextObj;
            curr = curr.next;
        }


        return head;
    }
}
