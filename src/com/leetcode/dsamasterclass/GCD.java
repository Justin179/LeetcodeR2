package com.leetcode.dsamasterclass;

public class GCD {
    /*
    gcd(a,0) = a

        8 4
        4 0

     */
    static int findGCD(int a, int b){
        if(a<0||b<0)
            return -1;
        if(b==0)
            return a;

        return findGCD(b, a%b);
    }
}
