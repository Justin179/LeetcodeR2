package com.leetcode.topinterviewqs.medium.array_strings;

public class CountandSay {
    public static void main(String[] args) {
//        String str = "338";
//        str = "1211";
//        str = "1";
//        String res = findNextStr(str);
//        System.out.println(res);
        String res = countAndSay(4);
        System.out.println(res);
    }

    public static String countAndSay(int n) {
        String[] strings = new String[n];
        strings[0] = "1";
        for (int i = 1; i<n; i++){ // 1 2 3
            String preStr = strings[i-1];
            String currStr = findNextStr(preStr);
            strings[i] = currStr;
        }
        return strings[n-1];
    }

    private static String findNextStr(String str){
        char[] chars = str.toCharArray(); // 3 3 8
        int[] counter = new int[chars.length]; // 3格
        counter[0] = 1;
        for (int i = 1; i<chars.length; i++){
            if (chars[i] == chars[i-1]){ // 前一個為一樣的數字
                counter[i] = counter[i-1]+1;
            } else {
                counter[i] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        int lastPosition = counter.length-1;
        for (int i = 0; i<counter.length; i++){
            if (i==lastPosition || counter[i+1]<=counter[i]){
                sb.append(counter[i]).append(chars[i]);
            }
        }

        return sb.toString();
    }
}











