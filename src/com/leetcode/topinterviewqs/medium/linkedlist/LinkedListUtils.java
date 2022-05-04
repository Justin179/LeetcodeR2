package com.leetcode.topinterviewqs.medium.linkedlist;

public class LinkedListUtils {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        ListNode root = arrayToList(arr, n);
        display(root);
    }

    static ListNode root;
    static ListNode insert(ListNode root, int item)
    {
        ListNode temp = new ListNode();
        temp.val = item;
        temp.next = root;
        root = temp;
        return root;
    }
    static ListNode arrayToList(int arr[], int n)
    {
        root = null;
        for (int i = n - 1; i >= 0 ; i--)
            root = insert(root, arr[i]);
        return root;
    }
    static void display(ListNode root)
    {
        while (root != null)
        {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }
}
