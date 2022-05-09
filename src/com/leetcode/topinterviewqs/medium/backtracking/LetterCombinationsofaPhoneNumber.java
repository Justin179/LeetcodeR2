package com.leetcode.topinterviewqs.medium.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {

    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        System.out.println(list);
    }

    static List<String> res = new ArrayList<>();
    static Map<Character,String> map = new HashMap<>();
    public static List<String> letterCombinations(String digits) {

        if (digits==null || digits.length()==0)
            return res;

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backtrack(digits,0,"");

        return res;
    }

    private static void backtrack(String digits, int i, String s) {
        if (s.length()==digits.length()){
            res.add(s);
            return;
        }
        String str = map.get(digits.charAt(i)) ; // "abc"
        for (char c : str.toCharArray()){
            s+=c;
            backtrack(digits,i+1,s);
            s = s.substring(0,s.length()-1);
        }
    }
}


















