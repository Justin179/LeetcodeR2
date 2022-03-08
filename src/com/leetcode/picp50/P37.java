package com.leetcode.picp50;

import java.util.HashSet;
import java.util.Set;

public class P37 {
    //  [100, 6,8,7, 4,200,1,3,2]
    // You must write an algorithm that runs in O(n) time.
    public static void main(String[] args) {
//        int[] arr = new int[]{100, 6,8,7, 4,200,1,3,2};
        int[] arr = new int[]{9,1,4,7,3,-1,0,5,8,-1,6};
        int res = longestConsecutiveSequence(arr);
        System.out.println(res);
    }

    static int max = 0;

    static int longestConsecutiveSequence(int[] arr){

        // make a set
        Set<Integer> set = new HashSet<>();
        for(int i : arr)
            set.add(i);

        for(int i = 0; i<arr.length; i++){ //  [100, 6,8,7, 4,200,1,3,2]
            int curr = arr[i]; // 6
            if(set.contains(curr-1)){ // non starting point
                continue;
            } else {
                // starting point
                int counter = 1;
                max = counter;
                if(!set.contains(curr+1))
                    continue;
                else{
                    hasNext(curr,set,counter);
                }
            }
        }

        return max;
    }


    private static void hasNext(int curr, Set<Integer> set, int counter) {
        if(set.contains(curr+1))
            hasNext(curr+1,set, counter+1);
        else {
            if(counter>max)
                max = counter;
        }
    }


//    static int counter = 1;
//    static int max = counter;
//    // 6
//    private static void findLongestConsecutiveNum(int curr, Set<Integer> set) {
//        if(set.contains(curr+1)){
//            counter++;
//            findLongestConsecutiveNum(curr+1, set);
//        } else {
//            max = counter;
//        }
//
//
//    }


}


















