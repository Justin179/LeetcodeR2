package com.leetcode.dsamasterclass;

public class PowerOfANumber {

    // 3, 2
    // = 3*3
    static int getPowerOfANumber(int base, int exp){ // base // exp
        // constraints
        if(exp<0)
            return -1;

        // base
        if(exp==0)
            return 1;

        // recursive
        return base * getPowerOfANumber(base, exp-1);
    }
}
