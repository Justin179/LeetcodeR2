package com.leetcode.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Lc409_17th {
    // ascii 65-122 A-z
    public int longestPalindrome(String s) {

        int[] intArr = new int[128];
        for (char c : s.toCharArray()){
            intArr[c]++;
        }

        int sum = 0;
        int quota = 0;
        for (int i : intArr){
            if (i%2==0){
                sum+=i;
            }else{
                int temp = (i/2) * 2;
                sum+=temp;
                quota = 1;
            }
        }

        return sum+quota;
    }
}
