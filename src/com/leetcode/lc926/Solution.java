package com.leetcode.lc926;

public class Solution {

    public static void main(String[] args) {
        String s = "00110";
        s = "010110";
        minFlipsMonoIncr(s);
    }

    public static int minFlipsMonoIncr(String S) { // 00110
        int one = 0;
        int zero =0;
        for(int i=0;i<S.length();i++) { // 遍歷
            if(S.charAt(i)=='1') // 遇1，one++
                one++;
            else                 // 遇0，zero++
                zero++;

            System.out.print(S.charAt(i) +"  ");
            System.out.print("zero: "+zero + "; one: "+one);
            zero = Math.min(one,zero); // 取小的reset zero
            System.out.println("; 取小的zero為: " + zero);
        }

        return zero;
    }
}