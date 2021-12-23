package com.leetcode.debugzone;

public class StringAndChar {
    public static void main(String[] args) {
        int a = 1;
        char b = (char)(a + '0');
        System.out.println(b);

        char c = '1';
        char c2 = (char)(c-1);
        System.out.println(c2);

        String x = new String("0000");
        String y = new String("0000");
        System.out.println(x.equals(y));
        System.out.println(x==y);


    }
}
