package com.leetcode.topinterviewqs.easy.linkedlist;

public class DeleteNodeinaLinkedList {

    public static void main(String[] args) {

//        ListNode d = new ListNode(5);
//        ListNode c = new ListNode(4);
//        ListNode b = new ListNode(3);
//        ListNode a = new ListNode(2);
        ListNode head = new ListNode(1);
//        head.next = a;
//        a.next = b;
//        b.next = c;
//        c.next = d;
        removeNthFromEnd(head,1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // 1 2 3 4 5
        ListNode curr = head;
        int counter = 0;
        while (curr!=null){
            curr = curr.next;
            counter++;
        }

        if (counter==1 && n==1)
            return null;

        int delPos = counter - n;

        counter = 0;
        curr = head;
        if (delPos == 0){ // 若要刪的是第一個node
            curr = curr.next;
            return curr;
        } else {
            while (curr!=null){
                if (counter+1 == delPos){
                    curr.next = curr.next.next;
                    break;
                }

                curr = curr.next;
                counter++;
            }
        }

        return head;
    }


}
