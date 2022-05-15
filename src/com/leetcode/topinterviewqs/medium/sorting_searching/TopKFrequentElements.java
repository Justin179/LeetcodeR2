package com.leetcode.topinterviewqs.medium.sorting_searching;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        List<Integer[]> listToSort = new ArrayList<>();
        Integer[] b = new Integer[]{2,2};
        Integer[] c = new Integer[]{1,3};
        Integer[] a = new Integer[]{3,1};
        listToSort.add(b);
        listToSort.add(c);
        listToSort.add(a);
//        listToSort.sort(Comparator.comparing(l -> l[0]));

        listToSort.sort((o1, o2) -> {
            return o2[0] - o1[0];
            // o1[0] - o2[0]; // 1 2 3
        });

        System.out.println(listToSort);
    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }
        List<Integer[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer[] temp = new Integer[]{entry.getValue(), entry.getKey()};
            list.add(temp);
        }
        list.sort((o1, o2) -> {
            return o2[0] - o1[0]; // 3 2 1
            // o1[0] - o2[0]; // 1 2 3
        });

        int[] res = new int[k];
        for (int i = 0; i<k; i++){
            res[i] = list.get(i)[1];
        }

        return res;
    }
}
