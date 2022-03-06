package com.leetcode.picp50;

import java.util.Set;

public class P31 {
    // n=3
    // 能一次走1步或2步
    // 1 1 1
    // 1 2
    // 2 1
    // https://insidecode.teachable.com/courses/833446/lectures/16094576
    static int waysToClimb(int n, Set<Integer> possibleSteps){
        if(n==0)
            return 1;
        int ways = 0;
        for(int step : possibleSteps){ // 1 or 2
            if(n-step>=0)
                ways+=waysToClimb(n-step, possibleSteps); // 同層相加後
        }
        return ways; // 回傳
    }

//    static int waysToClimb(int n, Set<Integer> possibleSteps){
//        if(n == 0) return 1;
//        int nbWays = 0;
//        for(Integer steps : possibleSteps) // 1 or 2
//            if((n-steps) >= 0)
//                nbWays += waysToClimb(n-steps, possibleSteps);
//
//        return nbWays;
//    }
}
