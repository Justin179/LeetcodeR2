package com.leetcode.topinterviewqs.rewrite;

import java.util.PriorityQueue;

public class KthLargestElementinanArray2 {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums){
            pq.add(i);
            if (pq.size()>k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}
