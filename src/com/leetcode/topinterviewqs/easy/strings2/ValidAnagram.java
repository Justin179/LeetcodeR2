package com.leetcode.topinterviewqs.easy.strings2;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        for (int i = 0; i<charsS.length; i++){
            char key = charsS[i];
            if (map.containsKey(key)){
                map.put(key,map.get(key)+1);
            } else
                map.put(key,1);
        }
        for (int i = 0; i<charsT.length; i++){
            char key = charsT[i];
            if (map.containsKey(key)){
                map.put(key, map.get(key)-1);
            }else
                return false;
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue()!=0)
                return false;
        }


        return true;
    }
}
