package com.leetcode.picp50;

import java.util.HashSet;
import java.util.Set;

public class Longestsubstringwithoutrepeatingcharacters {
    // pwwkew
    // 3
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            Character jchar = s.charAt(j);
            Character ichar = s.charAt(i);
            if(!set.contains(jchar)){ // 不含
                set.add(jchar);
                j++;
                max = Math.max(max,set.size());
            }else {
                set.remove(ichar);
                i++;
            }
        }

        return max;
    }
}
