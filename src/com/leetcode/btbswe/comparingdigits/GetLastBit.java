package com.leetcode.btbswe.comparingdigits;

public class GetLastBit {
    public static void main(String[] args) {

        // To convert an integer to binary divide the number by 2 until it becomes 0.
        int a = 14; // 1110
        /*
        14%2 0
        7%2 1
        3%2 1
        1%2 1
         */

        System.out.println(a&1);

        a>>=1;
        System.out.println(a&1);

        a>>=1;
        System.out.println(a&1);

        a>>=1;
        System.out.println(a&1);

//        System.out.println(1%2);
    }
}
