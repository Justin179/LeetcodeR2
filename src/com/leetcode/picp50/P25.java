package com.leetcode.picp50;

import java.util.ArrayList;

public class P25 {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> strings = getSubsequences(str);
        System.out.println(strings);
    }
    static ArrayList<String> getSubsequences(String str){
        ArrayList<String> output = new ArrayList<>();
        getSubsequences(str, 0, new ArrayList<Character>(), output);
        return output;
    }

    static void getSubsequences(String str, int i, ArrayList<Character> subsequence, ArrayList<String> output){
        if(i == str.length()){
            StringBuilder builder = new StringBuilder(subsequence.size());
            for(Character ch: subsequence)
                builder.append(ch);
            output.add(builder.toString());
        }else{
            getSubsequences(str, i+1, subsequence, output);
            subsequence.add(str.charAt(i));
            getSubsequences(str, i+1, subsequence, output);
            subsequence.remove(subsequence.size()-1);
        }
    }
}
