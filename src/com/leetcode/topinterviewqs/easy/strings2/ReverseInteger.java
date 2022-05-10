package com.leetcode.topinterviewqs.easy.strings2;

public class ReverseInteger {

    public static void main(String[] args) {
//        int x = 123;
        int x = 2147483647;
//        int y = 7460000000;
        int res = reverse(x);
    }

    public static int reverse(int x) {

        long reversed = 0;
        while (x!=0){ // 123
            reversed = (reversed*10) + x%10;
            if (reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE)
                return 0;

            x /= 10;
        }

        return (int) reversed;
    }
}
