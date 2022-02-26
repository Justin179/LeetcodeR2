package com.leetcode.picp50;

import java.util.HashMap;
import java.util.Map;

public class Firstrepeatingcharacter {
    // str = "inside code"
    static char firstRepeatingCharacter(String str){
        // your code here
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c))
                return c;
            else {
                map.put(c,1);
            }
        }

        return '\0';
    }

}
