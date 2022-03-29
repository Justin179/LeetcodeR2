package com.leetcode.blind75;

public class P15 { // 70
    public static void main(String[] args) {

        climbStairs(3);
    }

    public static int climbStairs(int n) { // 1 <= n <= 45
        int[] intArr = new int[45];
        intArr[0] = 1;
        intArr[1] = 2;
        for (int i = 2; i<45; i++){
            intArr[i] = intArr[i-1]+intArr[i-2];
        }


        return intArr[n-1];
    }
}
