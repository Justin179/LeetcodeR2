package com.leetcode.topinterviewqs.easy.strings;

public class ReverseInteger {
    public static void main(String[] args) {
        int res = reverse(123);
    }
    public static int reverse(int x) {
        // 123
        long reversed = 0;
        while (x!=0){
            reversed = reversed*10 + x%10; // 3
            x/=10; // 12
        }
        if (reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE)
            return 0;

        return (int)reversed;
    }
}
