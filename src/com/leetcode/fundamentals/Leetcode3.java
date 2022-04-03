package com.leetcode.fundamentals;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "abcabcbb"; // 8
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
    public static int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;
        while (b_pointer<s.length()){
            if (!set.contains(s.charAt(b_pointer))){
                set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }


        return max;
    }
}
