package com.leetcode.dsamasterclass;

public class SumOfDigits {
    /*
        assertEquals(1, SumOfDigits.findSumOfDigits(10));
        assertEquals(0, SumOfDigits.findSumOfDigits(54));
        assertEquals(4, SumOfDigits.findSumOfDigits(112));
        assertEquals(3, SumOfDigits.findSumOfDigits(111));
     */
    static int findSumOfDigits(int num){
        // 1 id the recursive case
        // 2 base case (
        // 3 edge case

        // 9
        // 9 + 0
        if(num<1)
            return 0;


        // 54 % 10 + 54/10
        // 111
        return num%10 + findSumOfDigits(num/10);
    }
}
