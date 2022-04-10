package com.amazon;

import java.util.Map;

public class CQ2 {
    /*
     * Complete the 'getMaxFreqDeviation' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     *
     * bbacccc
     * 4 - 1 = 3 (deviation)
     * find the max possible deviation
     */
    public static void main(String[] args) {
        String s = "bbacccabab";
//        s = "aabb";
//        s = "aaaaa";
        int res = getMaxFreqDeviation(s);
        System.out.println(res); // 2
    }
    public static int getMaxFreqDeviation(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        int i = 0;
        int j = 0;
        int n = chars.length; // 10
        int maxDev = 0;
        while (j<n){
            char num_i = chars[i];
            char num_j = chars[j];
            if (num_i==num_j){
                j++;
            } else { // different
                int preLen = s.substring(i,j).length();

                int k = j+1;
                while (k<n && chars[j]==chars[k]){
                    k++;
                }
                int postLen = s.substring(j,k).length();

                maxDev = Math.max(maxDev, Math.abs(preLen-postLen));
                i = j;
            }
        }
        return maxDev;
    }
}

















