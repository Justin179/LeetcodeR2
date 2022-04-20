package com.leetcode.blind75.twenty;

import java.util.ArrayList;
import java.util.List;

public class P14 { // 190
    public static void main(String[] args) {
        int res = reverseBits(14);
        System.out.println(res);
    }

    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i<32; i++){ // 32次
            res <<= 1;
            res+=n%2;
            n>>>=1;
        }

        return res;
    }
}

