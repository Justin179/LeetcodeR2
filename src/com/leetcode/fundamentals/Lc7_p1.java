package com.leetcode.fundamentals;

public class Lc7_p1 {
    public static void main(String[] args) {
        int x = 123;
        int res = reverse(x);
        System.out.println(res);
    }
    public static int reverse(int x) {
        long reversed = 0;
        int pop = 0;
        while (x!=0){ // 1 2 3
            pop = x%10; // 3
            x/=10;

            reversed = (reversed * 10) + pop;

            if(reversed > Integer.MAX_VALUE || reversed<Integer.MIN_VALUE)
                return 0;
        }

        return (int) reversed;
    }
}
