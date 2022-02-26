package com.leetcode.picp50;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class SortList {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);

        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = null;

        sortList(head);
    }

    public static ListNode sortList(ListNode head) {
        //Base case
        if(head == null || head.next == null) return head;

        //Split in the middle
        ListNode l1 = head;
        ListNode l2 = splitMidNode(head);

        //Sort the left list
        l1 = sortList(l1);

        //Sort the right list
        l2 = sortList(l2);

        //Merge to lists together
        ListNode dummy = new ListNode();
        ListNode res = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                res.next = l1;
                l1 = l1.next;
            }else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }

        if(l2 != null) {
            res.next = l2;
        }else{
            res.next = l1;
        }
        //Return the head node
        return dummy.next;
    }

    // head tail        slow fast
    private static ListNode splitMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode tail = null;
        while(fast != null && fast.next != null){
            tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        tail.next = null;
        return slow;
    }


}






