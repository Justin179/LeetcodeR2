package com.leetcode.topinterviewqs.easy.math;

public class PowerofThree {

    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        // double result2 =Math.pow(2, 5);//2的5次方
//        System.out.println(Math.pow(3,4));
        if (n==0)
            return false;
        if (n==1)
            return true;

        double accumulate = 1;
        int i = 1;
        while (accumulate<n){
            accumulate = Math.pow(3,i++);
        }

        return n == accumulate;
    }
}
