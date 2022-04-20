package com.leetcode.fundamentals;

public class Lc693_18th {
    public boolean hasAlternatingBits(int n) {

        int temp = n>>1;

        int allOnes = temp^n; // all 1s
        int allOnesPlusOne = allOnes+1;
        int res = allOnes&allOnesPlusOne;

        return res==0;
    }
}
