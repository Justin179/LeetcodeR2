package com.leetcode.dsamasterclass;

public class DecimalToBinary {
    /*
        assertEquals(1010,DecimalToBinary.toBinary(10));
        10/2 -> 5 0
        5/2  -> 2 1
        2/2  -> 1 0
        1/2  -> 0 1
        a/2
     */

    static String toBinary(int num, StringBuilder sb){
        if(sb==null)
            sb = new StringBuilder();

        if(num==0)
            return sb.reverse().toString();

        int remain = num % 2; // 10%2=0, 5%2=1, 2%2=0, 0
        sb.append(remain); // 0

        return toBinary(num/2, sb);
    }
}
