package com.leetcode.picp50;

public class P33 {
    static int waysToDecode(String str){ // 6324120129
        // your code here
        return waysToDecode(str, 0);
    }

    static int waysToDecode(String str, int i){
        int n = str.length();

        if(n == 0 || (i < n && str.charAt(i) == '0'))
            return 0;
        else if(i >= n-1)
            return 1;
        else if(Integer.parseInt("" + str.charAt(i) + str.charAt(i+1)) >= 10 &&  Integer.parseInt("" + str.charAt(i) + str.charAt(i+1)) <= 26)
            return waysToDecode(str, i+1) + waysToDecode(str, i+2);
        else
            return waysToDecode(str, i+1);
    }
}
