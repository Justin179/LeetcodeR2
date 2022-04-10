package com.amazon;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        String s = "|**|*|*";
        List<Integer> startIndices = new ArrayList<>(); // 1 1
        startIndices.add(1);
        startIndices.add(1);
        List<Integer> endIndices = new ArrayList<>(); // 5 6
        endIndices.add(5);
        endIndices.add(6);
        List<Integer> res = numberOfItems(s,startIndices,endIndices);
        // |**|*    |**|*|  -> 完整包起來的*才算數
        System.out.println(res); // [2,3]

        // 切出字串後，找出頭尾的棒棒，再算中間的星星數即可
    }
    /*
     * Complete the 'numberOfItems' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY startIndices
     *  3. INTEGER_ARRAY endIndices
     */

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here

        return null;
    }
}
