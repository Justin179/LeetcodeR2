package com.leetcode.blind75.twenty;

public class P12 {
    public static void main(String[] args) {
        int n = 5;
        int[] res = countBits(n);
        System.out.println(res);
    }
    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i<=n; i++){
            int num = countOnes(i);
            res[i] = num;
        }
        return res;
    }

    private static int countOnes(int i) {
        int counter = 0;
        while (i!=0){
            counter+= (i%2)&1;
            i>>>=1;
        }
        return counter;
    }

}
