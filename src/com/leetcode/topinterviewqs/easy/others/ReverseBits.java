package com.leetcode.topinterviewqs.easy.others;

public class ReverseBits {

    public static void main(String[] args) {
        System.out.println((0%2)&1);
        System.out.println((1%2)&1);
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int reverse = 0;
        for (int i = 0; i<32; i++){
            reverse<<=1; // 空一格出來
            reverse += n%2; // 放尾位進去
            n>>>=1; // 右推一格
        }

        return reverse;
    }
}
