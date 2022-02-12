package com.leetcode.yks11;

import java.util.HashMap;
import java.util.Map;

public class NR {
    public static void main(String[] args) {

    }

    public static Character nonRepeating(String s) {
        // find non repeating character and return it
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            } else {
                map.put(c,1);
            }
        }

        for(char c : s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }

        return null;
    }

    // Implement your solution below.
//    public static Character nonRepeating(String s) {
//        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
//        // NOTE: Using s.toCharArray() is no the most efficient method,
//        // but I chose to use it here for simplicity.
//        for (char c : s.toCharArray()) {
//            if (charCount.containsKey(c)) {
//                Integer newVal = charCount.get(c) + 1;
//                charCount.put(c, newVal);
//            } else {
//                charCount.put(c, 1);
//            }
//        }
//        for (char c : s.toCharArray()) {
//            if (charCount.get(c) == 1) return c;
//        }
//        return null;
//    }
}

