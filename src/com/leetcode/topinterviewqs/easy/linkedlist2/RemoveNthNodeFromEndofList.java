package com.leetcode.topinterviewqs.easy.linkedlist2;

public class RemoveNthNodeFromEndofList {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int counter = 0;
        while (temp!=null){
            counter++;
            temp = temp.next;
        }
        if (counter==1 && counter==n)
            return null;

        if (counter==n){
            ListNode next = head.next;
            head.val = next.val;
            head.next = next.next;
        } else {
            int stopIndex = counter-n-1;
            temp = head;
            counter = 0;
            while (temp!=null){
                if (counter==stopIndex){
                    temp.next = temp.next.next;
                    break;
                }
                counter++;
                temp = temp.next;
            }
        }


        return head;
    }

}
