package com.leetcode.topinterviewqs.easy.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : chars){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        for (int i = 0; i<chars.length; i++){
            if (map.get(chars[i]).intValue()==1){
                return i;
            }
        }
        return -1;
    }
}
