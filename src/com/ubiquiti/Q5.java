package com.ubiquiti;



public class Q5 { // 從尾巴開始print出單向的nodelist

    public static void main(String[] args) { // lc 206
        ListNode d = new ListNode(5);
        ListNode c = new ListNode(4,d);
        ListNode b = new ListNode(3,c);
        ListNode a = new ListNode(2,b);
        ListNode head = new ListNode(1,a);
        reverseList(head);
    }

    public static ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null){
//            System.out.println(curr.val);
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;

            curr = next;
        }
        return prev;
    }
}
