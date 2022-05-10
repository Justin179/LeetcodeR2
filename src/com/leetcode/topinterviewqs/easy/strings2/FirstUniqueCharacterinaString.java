package com.leetcode.topinterviewqs.easy.strings2;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        String s = "leetcode";
//        s = "loveleetcode";
//        s = "aabb";
        int res = firstUniqChar(s);
        System.out.println(res);
    }

    public static int firstUniqChar(String s) {

        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i<chars.length; i++){
            char curr = chars[i];
            if (map.containsKey(curr)){
                map.put(curr,map.get(curr)+1);
            }else
                map.put(curr,1);
        }

        for (int i = 0 ;i<chars.length; i++){
            char curr = chars[i];
            if(map.get(curr).intValue()==1)
                return i;
        }

        return -1;
    }
}
