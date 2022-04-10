package com.amazon;

import java.util.ArrayList;
import java.util.List;

public class CQ1 {
    /*
     * Complete the 'getHeaviestPackage' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY packageWeights as parameter.
     *
     * 包裏會依重量分類
     * merge a lighter package with a heavier package 大重量合併小重量的，這樣就不用分開送了
     * n packages [i, i+1,... ]
     * -> [75,53,...]
     * -> [53,75,...] -> 前小後大，可以合併，合併後i包裏就刪掉，i+1包裏的重量就變成了128
     * 全合併後，找出最大的重量
     */

    public static void main(String[] args) {
        List<Integer> packageWeights = new ArrayList<>();
//        packageWeights.add(30);
//        packageWeights.add(15);
//        packageWeights.add(5);
//        packageWeights.add(9);

//        packageWeights.add(20);
//        packageWeights.add(13);
//        packageWeights.add(8);
//        packageWeights.add(9);

        packageWeights.add(2);
        packageWeights.add(9);
        packageWeights.add(10);
        packageWeights.add(3);
        packageWeights.add(7);
        long res = getHeaviestPackage(packageWeights);
    }
    public static long getHeaviestPackage(List<Integer> packageWeights) {
        // Write your code here
        int n = packageWeights.size();
        for (int i = n-1; i>0; i--){ // 4 3 2 1
            int last = packageWeights.get(i);
            int minusOne = packageWeights.get(i-1);
            if (minusOne<last){
                int combineWeight = last+minusOne;
                packageWeights.add(i-1, combineWeight);
                packageWeights.remove(i);
            }
        }
        return packageWeights.get(0);
    }
}
