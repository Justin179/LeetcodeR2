package com.leetcode.topinterviewqs.easy.others;

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {

    public static void main(String[] args) {
//        int x = 3;
//        int y = 1;
//        List<Integer> list = new ArrayList<>();
//        while (x!=0 || y!=0){
//            int currX = (x%2)&1;
//            int currY = (y%2)&1;
//            list.add(currX^currY); // 不同為1; 同為零
//            x>>>=1;
//            y>>>=1;
//        }
//        System.out.println(list);
//
//        List<Integer> positions = new ArrayList<>();
//        for (int i = 0; i<list.size(); i++){
//            if(list.get(i).intValue()==1){
//                positions.add(i);
//            }
//        }

    }



    public int hammingDistance(int x, int y) {

        List<Integer> list = new ArrayList<>();
        while (x!=0 || y!=0){
            int currX = (x%2)&1;
            int currY = (y%2)&1;
            list.add(currX^currY); // 不同為1; 同為零
            x>>>=1;
            y>>>=1;
        }
//        System.out.println(list);

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            if(list.get(i).intValue()==1){
                positions.add(i);
            }
        }

//        if (positions.size()==1)
//            return 1;
//        else
//            return Math.abs(positions.get(0) - positions.get(1));

        return positions.size();
    }
}
