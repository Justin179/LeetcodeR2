package com.leetcode.picp50;

public class P30 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static class LinkedList{
        Node head;
        LinkedList(){
            this.head = null;
        }
        LinkedList(Node head){
            this.head = head;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node a = new Node(6);
        Node b = new Node(5);
        Node c = new Node(4);
        node1.next = a;
        a.next = b;
        b.next = c;
        LinkedList list1 = new LinkedList(node1);

        Node node2 = new Node(4);
        Node a1 = new Node(8);
        Node b1 = new Node(2);
        Node c1 = new Node(7);
        Node d1 = new Node(9);
        node2.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        LinkedList list2 = new LinkedList(node2);

        LinkedList list = addTwoLinkedLists(list1,list2);
    }

    static LinkedList addTwoLinkedLists(LinkedList list1, LinkedList list2){
        LinkedList output = new LinkedList();

        Node p1 = list1.head;
        Node p2 = list2.head;
        Node tail = null;

        int carry = 0;
        while(p1!=null || p2!=null || carry!=0){
            int v1 = (p1!=null?p1.data:0);
            int v2 = (p2!=null?p2.data:0);
            int currDigit = (v1+v2+carry)%10;
            carry = (v1+v2+carry)/10;
            Node currNode = new Node(currDigit);
            if(output.head==null){
                output.head=currNode;
                tail=currNode;
            }else{
                tail.next = currNode;
                tail = tail.next;
            }
            p1 = (p1!=null?p1.next:null);
            p2 = (p2!=null?p2.next:null);
        }

        return output;
    }










//    static LinkedList addTwoLinkedLists(LinkedList list1, LinkedList list2){
//        LinkedList output = new LinkedList();
//        Node ptr1 = list1.head;
//        Node ptr2 = list2.head;
//        Node tail = null;
//
//        int carry = 0;
//        while(ptr1 != null || ptr2 != null || carry > 0){
//            int digit1 = ptr1 != null ? ptr1.data : 0;
//            int digit2 = ptr2 != null ? ptr2.data : 0;
//            int nextDigit = (digit1 + digit2 + carry)%10;
//            carry = (digit1 + digit2 + carry)/10;
//            Node newNode = new Node(nextDigit);
//            if(output.head == null){
//                output.head = newNode;
//                tail = newNode;
//            }else{
//                tail.next = newNode;
//                tail = tail.next;
//            }
//            ptr1 = ptr1 != null ? ptr1.next : null;
//            ptr2 = ptr2 != null ? ptr2.next : null;
//        }
//        return output;
//    }
}













