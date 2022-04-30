package com.leetcode.topinterviewqs.easy.math;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String s = "III";
        char[] chars = s.toCharArray();
        int currSum = 0;
        for (int i = chars.length-1; i>=0; i--){
            if (i==chars.length-1){
                char curr = chars[i];
                currSum += map.get(curr);
            } else {
                Integer curr = map.get(chars[i]);
                Integer prev = map.get(chars[i+1]);
                if (curr>=prev)
                    currSum+=curr;
                else {
                    currSum-=curr;
                }
            }
        }
        System.out.println(currSum);


    }
    /*
    Symbol       Value
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);
     */



//    Problem is simpler to solve by working the string from back to front and using a map.
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
//        String s = "III";
        char[] chars = s.toCharArray();
        int currSum = 0;
        for (int i = chars.length-1; i>=0; i--){
            if (i==chars.length-1){
                char curr = chars[i];
                currSum += map.get(curr);
            } else {
                Integer curr = map.get(chars[i]);
                Integer prev = map.get(chars[i+1]);
                if (curr>=prev)
                    currSum+=curr;
                else {
                    currSum-=curr;
                }
            }
        }
        return currSum;
    }
}
