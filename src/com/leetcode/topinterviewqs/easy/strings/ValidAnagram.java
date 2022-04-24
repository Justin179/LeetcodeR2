package com.leetcode.topinterviewqs.easy.strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        for (char c : t.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)-1);
            } else
                map.put(c,1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue().intValue()!=0)
                return false;
        }

        return true;
    }
}
