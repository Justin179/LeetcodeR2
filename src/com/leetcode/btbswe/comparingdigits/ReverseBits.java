package com.leetcode.btbswe.comparingdigits;

public class ReverseBits {

    public static void main(String[] args) {
        // 看懂了，自己寫一遍
    }

    public static int reverseBits(int input) {
        /*
         * Approach:
         *   1. Check the last bit of input (如何做到? &1 即可 )
         *   2. Shift output left
         *   3. If it is 1, add it to output (do nothing otherwise)
         *   4. Shift input right
         *
         * Stop when input is 0
         */

        int output = 0;

        while (input != 0) {
            output = output << 1; // 往左一格，以空出個位數

            if ((input & 1) == 1) { // input 必為1 這裡才會是true
                output = output | 1; // 這必放1啊… output |= 1;
            }

            input = input >> 1; // 往右一格，以取得個位數
        }

        return output;
    }
}
