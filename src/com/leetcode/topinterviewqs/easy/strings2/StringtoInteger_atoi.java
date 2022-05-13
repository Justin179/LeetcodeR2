package com.leetcode.topinterviewqs.easy.strings2;

public class StringtoInteger_atoi {

    // -314
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length()==0)
            return 0;

        int sign = 1;
        int start = 0;
        if (s.charAt(0)=='+'){
            sign = 1;
            start++;
        } else if (s.charAt(0)=='-'){
            sign = -1;
            start++;
        }

        long sum = 0;
        for (int i = start; i<s.length(); i++){
            if (!Character.isDigit(s.charAt(i))){
                return (int) sum*sign;
            }
            sum = sum*10 + s.charAt(i)-'0';
            if (sign==1 && sum>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign==-1 && sum*sign<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }


        return (int)sum*sign;
    }

}
