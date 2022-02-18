package com.leetcode.tenccip;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        // map Character, Integer 字元, 次數
        Map<Character,Integer> map1 = new HashMap<>();
        for(char c1 : s.toCharArray()){
            if(map1.containsKey(c1))
                map1.put(c1, map1.get(c1) + 1);
            else
                map1.put(c1, 1);
        }
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c2 : t.toCharArray()){
            if(map2.containsKey(c2))
                map2.put(c2, map2.get(c2) + 1);
            else
                map2.put(c2, 1);
        }

        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
//            System.out.println("map1: " + key + " : " + value);
            if(!map2.containsKey(key)){ // 字元不一致
                return false;
            }
            if(map2.containsKey(key)){ // 有字元，但數量不一致
                Integer value2 = map2.get(key);
                if(value2.intValue() != value.intValue())
                    return false;
            }
        }

//        for(Map.Entry<Character,Integer> entry : map2.entrySet()){
//            Character key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("map2: " + key + " : " + value);
//        }

        return true;
    }
}
