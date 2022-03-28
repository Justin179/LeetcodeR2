package com.leetcode.blind75;

public class P11_p1 {
    // lc 191
    public static void main(String[] args) {
//        int n = 00000000000000000000000000001011;
//        int n = 11111111111111111111111111111101;

        System.out.println(0%2);
        System.out.println(1%2);
//        int n = 10;
//        System.out.println(n>>=1);
//        int n1 = 01;
//        System.out.println(n1>>=1);
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int counter = 0;
        while (n!=0){
            counter += (n%2) & 1;
            n>>>=1;
        }
        return counter;
    }
}
