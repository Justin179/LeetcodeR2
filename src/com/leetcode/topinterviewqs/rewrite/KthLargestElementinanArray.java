package com.leetcode.topinterviewqs.rewrite;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = findKthLargest(nums,k);
        System.out.println(res);
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums){
            pq.add(i);
            if (pq.size()>k)
                pq.poll();
        }
        return pq.poll();
    }
}
