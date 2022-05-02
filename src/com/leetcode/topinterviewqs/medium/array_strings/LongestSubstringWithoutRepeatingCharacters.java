package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abcabcbb";
//        s = "bbbbb";
//        s = "pwwkew";
//        s = "dvdf";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) { //
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = 0;
        int max = 0;
        while (j<chars.length){
            if (!set.contains(chars[j])){
                set.add(chars[j]);
                j++;
                max = Math.max(max,set.size());
            } else {
                set.remove(chars[i]);
                i++;
            }
        }
        return max;
    }
}

/*
    public static int lengthOfLongestSubstring(String s) { //
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = 0;
        int max = 0;
        while (i<chars.length && j<chars.length){

            set.add(chars[j]);

            if (i==j){
                set.add(chars[j]);
                j++;
            } else if ((j-i+1)==set.size()){ // 沒重複 j++
                j++;
            } else if ((j-i+1)!=set.size()){
                set.remove(chars[i]);
                i++;
            }
            max = Math.max(max,(j-i));
        }

        return max;
    }
 */