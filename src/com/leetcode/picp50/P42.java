package com.leetcode.picp50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P42 {

    public static void main(String[] args) {
        int[][] intArr = new int[][]{{4, 8}, {2, 6}, {9, 9}, {5, 7}};
        int[][] res = mergeIntervals(intArr);
        System.out.println(res);
    }

    static int[][] mergeIntervals(int[][] intervals){
        Arrays.sort(intervals,Comparator.comparingInt(x -> x[0]));

        // 雙指針法，合併後，前為null
        for(int i = 0; i<intervals.length-1; i++){
            int j = i+1;
            if(intervals[i][1]<intervals[j][0]){

            }else {
                intervals[j][0] = intervals[i][0];
                intervals[j][1] = Math.max(intervals[i][1],intervals[j][1]);
                intervals[i] = null;
            }
        }

        List<int[]> list = new ArrayList<>();
        // 只留下不是null的
        for(int[] intArr : intervals){
            if(intArr!=null)
                list.add(intArr);
        }

        int[][] res = list.toArray(new int[list.size()][]);

        return res;
    }















//    static int[][] mergeIntervals(int[][] intervals){
//        // your code here
//        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
//
//        for(int i = 0; i<intervals.length-1; i++){
//            int j = i+1;
//            if(intervals[i][1]<intervals[j][0]){
//
//            } else {
//                intervals[j][0] = intervals[i][0];
//                intervals[j][1] = Math.max(intervals[i][1],intervals[j][1]);
//                intervals[i] = null;
//            }
//
//        }
//
//        List<int[]> list = new ArrayList<>();
//        for(int i = 0; i<intervals.length; i++){
//            if(intervals[i]!=null)
//                list.add(intervals[i]);
//        }
//        int[][] res = list.toArray(new int[list.size()][2]);
//
//        return res;
//    }
}
