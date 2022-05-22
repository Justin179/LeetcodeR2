package com.leetcode.topinterviewqs.medium.sorting_searching;

import java.util.Arrays;

public class MeetingRoomsII {
    public static void main(String[] args) {

    }

    public int minMeetingRooms(int[][] intervals) {

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        //  intervals = [[0,30],[5,10],[15,20]]
        for (int i = 0; i<intervals.length; i++){
            int[] interval = intervals[i];
            start[i] = interval[0];
            end[i] = interval[1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;
        int max = 0;
        int count = 0;
        while (i<start.length){
            int iVal = start[i];
            int jVal = end[j];
            if (iVal<jVal){
                i++;
                count++;
            } else {
                j++;
                count--;
            }
            max = Math.max(max,count);
        }

        return max;
    }
}
