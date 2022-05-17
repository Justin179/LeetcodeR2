package com.leetcode.topinterviewqs.optimize;

import com.javabasics.essentials.Priority_Queue;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        findKthLargest(nums,2);

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i : nums){
//            pq.add(i);
//            if (pq.size()>2)
//                pq.remove(); // Retrieves and removes the head of this queue
//            System.out.println(pq);
//        }
        /*
        [3]
        [2, 3]
        [1, 3, 2]
        [1, 3, 2, 5]
        [1, 3, 2, 5, 6]
        [1, 3, 2, 5, 6, 4]
         */


    }

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums){
            pq.add(i);
            if (pq.size()>k)
                pq.remove(); // Retrieves and removes the head of this queue
//            System.out.println(pq);
        }
        return pq.poll();
    }
}
