package com.leetcode.picp50;

import java.util.Arrays;
import java.util.Collections;

public class P38 {
    static int minDistance(String word1, String word2){
        return findMinDistance(word1,word2,0,0);
    }
    /*
                     i
        word1(i): programming
                     j
        word2(j): pro
     */
    static int findMinDistance(String word1, String word2, int i, int j){
        if(j==word2.length())
            return word1.length()-i; // 11 - 3 = 8 須8動
        else if(i==word1.length())
            return word2.length()-j; // 同上
        else if(word1.charAt(i) == word2.charAt(j))
            return findMinDistance(word1,word2,i+1,j+1);
        else
            return 1 + min(findMinDistance(word1,word2,i+1,j+1),findMinDistance(word1,word2,i+1,j),findMinDistance(word1,word2,i,j+1));

    }

    public static int min(Integer... vals) {
        return Collections.min(Arrays.asList(vals));
    }

}
