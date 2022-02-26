package com.leetcode.picp50;



public class SortList2 {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);

        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = null;

        ListNode res = sortList(head);
    }

    public static ListNode sortList(ListNode head) {
        //Base case
        if(head == null || head.next == null)
            return head;

        //Split in the middle
        ListNode slow = getSecondHalf(head);


        //Sort the left list
        ListNode left = sortList(head);

        //Sort the right list
        ListNode right = sortList(slow);

        return merge(left,right);
    }

    private static ListNode getSecondHalf(ListNode head) {
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

    public static ListNode merge(ListNode l1, ListNode l2){
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


}






