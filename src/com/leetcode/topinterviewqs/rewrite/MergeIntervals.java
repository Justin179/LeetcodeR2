package com.leetcode.topinterviewqs.rewrite;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        // sort by first element
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] interval : intervals){
            if (list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){ // 直接放
                list.add(interval);
            } else { // 有交疊，需合併
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

}
