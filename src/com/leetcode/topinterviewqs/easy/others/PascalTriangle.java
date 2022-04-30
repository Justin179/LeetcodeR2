package com.leetcode.topinterviewqs.easy.others;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);
        if (numRows==1)
            return res;
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        res.add(list2);
        if (numRows==2)
            return res;

        for (int i = 1; i<numRows-1; i++){ // 1 2 3 4
            List<Integer> currList = res.get(i); // 1 1
            List<Integer> nextList = new ArrayList<>();
            nextList.add(1);
            for (int j = 0; j<currList.size()-1; j++){
                Integer tempSum = currList.get(j) + currList.get(j+1);
                nextList.add(tempSum);
            }
            nextList.add(1);
            res.add(nextList);
        }

        return res;
    }
}
