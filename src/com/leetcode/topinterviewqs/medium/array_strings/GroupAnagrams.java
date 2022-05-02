package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
//        String[] strs = new String[]{"",""};
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            if (map.containsKey(key)){
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }


//    public static List<List<String>> groupAnagrams(String[] strs) {
////        Set<String> set = new HashSet<>(Arrays.asList(strs)); // this is coding skills
//        List<String> dictionary = new ArrayList<>(Arrays.asList(strs));
//
//        List<List<String>> permutations = new ArrayList<>();
//        for (String str : strs){ // "eat"
////        String str = "eat";
//
//            StringBuilder sb = new StringBuilder();
//            List<String> list = new ArrayList<>();
//
//            boolean[] visited = new boolean[str.length()];
//            backtrack(dictionary,str.toCharArray(),sb,list,visited);
//            if (!list.isEmpty())
//                permutations.add(list);
//        }
//
////        System.out.println(list);
//        return permutations;
//    }
//
//    private static void backtrack(List<String> dictionary, char[] chars, StringBuilder sb, List<String> list, boolean[] visited) {
//        // base case
//        if (sb.length()==chars.length){
//            String str = sb.toString();
//            if (dictionary.contains(str)){
//                dictionary.remove(str);
//                list.add(str);
//            }
//            return;
//        }
//
//        for (int i = 0; i<chars.length; i++){ // e a t
//            char currChar = chars[i]; // e
//            if (!visited[i]){
//                sb.append(currChar);
//                visited[i] = true;
//                backtrack(dictionary,chars,sb,list,visited); //
//                sb.setLength(sb.length() - 1);
//                visited[i] = false;
//            }
//        }
//    }
}











