package com.leetcode.picp50;

public class P29 {
    static int minimum(int[] arr){ // 4 5 1 2 3
        //your code here
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
}
