package com.leetcode.topinterviewqs.easy.array2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if (n>m){
            for (int i = 0; i<n; i++){
                int currVal = nums1[i];
                if (map.containsKey(currVal)){
                    map.put(currVal,map.get(currVal) + 1);
                } else {
                    map.put(currVal,1);
                }
            }
            for (int i = 0; i<m; i++){
                int currVal = nums2[i];
                if (map.containsKey(currVal) && map.get(currVal).intValue()>0){
                    map.put(currVal,map.get(currVal)-1);
                    list.add(currVal);
                }
            }


        } else {
            for (int i = 0; i<m; i++){
                int currVal = nums2[i];
                if (map.containsKey(currVal)){
                    map.put(currVal,map.get(currVal) + 1);
                } else {
                    map.put(currVal,1);
                }
            }

            for (int i = 0; i<n; i++){
                int currVal = nums1[i];
                if (map.containsKey(currVal) && map.get(currVal).intValue()>0){
                    map.put(currVal,map.get(currVal)-1);
                    list.add(currVal);
                }
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }


        return arr;
    }

}
