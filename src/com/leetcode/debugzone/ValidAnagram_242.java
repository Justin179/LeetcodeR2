package com.leetcode.debugzone;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        Solution solution = new ValidAnagram_242().new Solution();
        String s = "anagram";
        String t = "nagaram";
        solution.isAnagram(s,t);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {

            if(s.length()!=t.length())
                return false;

            char[] chars1 = s.toCharArray();
            char[] chars2 = t.toCharArray();

            Map<Character,Integer> map = new HashMap<>();

            // map.getOrDefault(key,"default value")
            // map.putIfAbsent() 方法会先判断指定的键（key）是否存在，不存在则将键/值对插入到 HashMap 中。

            for(int i = 0; i<chars1.length; i++){
                char key = chars1[i];
                Integer value = map.get(key);

                if(value==null){
                    map.put(key,1);
                } else {
                    map.put(key,value+1);
                }

            }

            for(int i = 0; i<chars2.length; i++){

                char key2 = chars2[i];
                Integer value2 = map.get(key2);

                if(value2==null){
                   return false;
                } else {
                    map.put(key2,value2-1);
                }
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue()!=0){
                    return false;
                }
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
