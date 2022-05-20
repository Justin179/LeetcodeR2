package com.leetcode.topinterviewqs.medium.sorting_searching;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        // 先排序n(log n)
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));;

        // 轉，拿linkedlist來裝
        List<int[]> merged = new LinkedList<>();
        for (int[] interval: intervals){
            if (merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0]){ // 可以直接放下去的情況
                merged.add(interval);
            }else {
                int[] pre = merged.get(merged.size()-1);
                pre[1] = Math.max(pre[1],interval[1]);
            }
        }

        // return linkedlist to array
        return merged.toArray(new int[merged.size()][]);
    }
}
