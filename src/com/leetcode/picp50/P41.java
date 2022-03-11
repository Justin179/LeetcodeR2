package com.leetcode.picp50;

import java.util.ArrayList;

public class P41 {
    /*
    Input: intervals = [[1,3],[6,9]], newInterval = [2,5]

    Output: [[1,5],[6,9]]
     */

    public static void main(String[] args) {
//        int[][] int2DArr = new int[][]{{1,3},{6,9}};
//        int[] intArr = new int[]{2,5};
        int[][] int2DArr = new int[][]{{1,3},{7,10}};
        int[] intArr = new int[]{4,6};
        int[][] res = insertInterval(int2DArr,intArr);
        System.out.println(res);
    }

    static int[][] insertInterval(int[][] intervals, int[] newInterval){
        ArrayList<int[]> output = new ArrayList<>();

        int i = 0;
        // 前段
        while (i < intervals.length && intervals[i][1] < newInterval[0]){
            output.add(intervals[i]);
            i++;
        }

        // 中段
        while (i<intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);

            i++;
        }
        output.add(newInterval); // 中間的全做完後，只會剩下一個

        // 後段
        while (i<intervals.length){
            output.add(intervals[i]);
            i++;
        }

        // 轉int[][]
        return output.toArray(new int[output.size()][2]);
    }

//    static int[][] insertInterval(int[][] intervals, int[] newInterval){
//        ArrayList<int[]> output = new ArrayList<>();
//        int i = 0;
//        // 前段
//        while(i<intervals.length && intervals[i][1] < newInterval[0]){
//            output.add(intervals[i]);
//            i++;
//        }
//
//        // 中段(one) 當前的頭<=newInterval的尾
//        while (i<intervals.length && intervals[i][0]<=newInterval[1]){
//            // merge的頭 & merge的尾
//            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
//            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
//            i++;
//        }
//        output.add(newInterval);
//
//        // 後段
//        while (i<intervals.length){
//            output.add(intervals[i]);
//            i++;
//        }
//
//        return output.toArray(new int[output.size()][2]);
//    }



//    static int[][] insertInterval(int[][] intervals, int[] newInterval){
//        ArrayList<int[]> output = new ArrayList<>();
//        int i = 0;
//        // 前段: newInterval 在curr的右側，這意味著沒有交集，curr直接放進去
//        while(i < intervals.length && intervals[i][1] < newInterval[0]){
//            output.add(intervals[i++]);
//        }
//
//        // 中段: curr的頭 <= newInterval的尾，代表有交集: 頭取兩者之前，尾取兩者之後
//        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
//            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
//            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
//            i++;
//        }
//        output.add(newInterval);
//
//        // 尾段
//        while(i < intervals.length){
//            output.add(intervals[i++]);
//        }
//
//        // ArrayList<int[]> output
//        return output.toArray(new int[output.size()][2]);
//    }
}
