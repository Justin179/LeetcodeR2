package com.leetcode.topinterviewqs.optimize;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;
        int[] res = topKFrequent(nums,2);
        System.out.println(res);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // value大的排前面
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        int[] res = new int[k];
        for (int i = 0; i<k; i++){
            Map.Entry<Integer, Integer> entry = pq.poll();
            res[i] = entry.getKey();
        }

        return res;
    }
}















