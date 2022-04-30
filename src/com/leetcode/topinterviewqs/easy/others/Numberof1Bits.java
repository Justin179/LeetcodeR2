package com.leetcode.topinterviewqs.easy.others;

public class Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int counter = 0;
        while (n!=0){
            counter+= (n%2)&1;
//            if (n%2==1)
//                counter++;
            n>>>=1;
        }

        return counter;
    }
}
