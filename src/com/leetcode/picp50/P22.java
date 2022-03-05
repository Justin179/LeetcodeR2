package com.leetcode.picp50;

public class P22 {

    public static void main(String[] args) {
        // [2,3,1,1,4]
        int[] arr = new int[]{2,3,1,1,4};
        boolean res = canJump(arr);
        System.out.println(res); // true
        System.out.println();
    }

    static boolean canJump(int[] arr){
        // 從後往前
        int length = arr.length;
        int lastGoodIndex = length-1; // 4
        for(int i = length-1; i>=0; i--){
            if(i+arr[i] >= lastGoodIndex){
                lastGoodIndex = i; // 4
            }else
                return false;
        }


        return lastGoodIndex==0;
    }
}
