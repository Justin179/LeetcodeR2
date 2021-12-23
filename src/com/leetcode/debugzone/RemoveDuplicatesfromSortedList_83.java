package com.leetcode.debugzone;

public class RemoveDuplicatesfromSortedList_83 {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesfromSortedList_83().new Solution();


    }
//leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {

            ListNode curr = head;

            while(curr!=null&&curr.next!=null){
                if(curr.val == curr.next.val){
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }

            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
