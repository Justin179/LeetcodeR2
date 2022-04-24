package com.paypay;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        int[] a = new int[]{25, 2, 3, 57, 38, 41};
        int[] res = solution(a);
        System.out.println(res);
    }

    static int[] solution(int[] a) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i : a){ // 25 2 3 57 ...
            String str = String.valueOf(i); // "25"
            char[] chars = str.toCharArray(); // 2 5
            for (char c: chars){
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                } else {
                    map.put(c,1);
                }
            }
        }

        List<Character> list = new ArrayList<>(); // 2 3 5
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the HashMap
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                // System.out.println(entry.getKey());     // Print the key with max value
                list.add(entry.getKey());
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            res[i] = list.get(i) - '0';
        }

        return res;
    }



}
