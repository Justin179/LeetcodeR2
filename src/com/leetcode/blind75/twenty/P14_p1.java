package com.leetcode.blind75.twenty;

public class P14_p1 { // 190
    public static void main(String[] args) {
        int res = reverseBits(14);
        System.out.println(res);
    }

    // you need treat n as an unsigned value
    public static int reverseBits(int n) { // 0111

        int res = 0;
        for (int i = 0; i<32; i++){
            res<<=1;
            res+=n%2;
            n>>>=1;
        }

        return res;
    }
}

