package com.leetcode.topinterviewqs.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        intersect(nums1,nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int smaller = Math.min(n1,n2);
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        if (n1>=n2){
            for (int i : nums1){ // 1 2 2 1
                if (map.containsKey(i))
                    map.put(i,map.get(i)+1);
                else
                    map.put(i,1);
            }
            for (int i = 0; i<nums2.length; i++){ // 2 2
                if (map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                    map.put(nums2[i], map.get(nums2[i])-1);
                    list.add(nums2[i]);
                }
            }
        } else {
            for (int i : nums2){ // 1 2 2 1
                if (map.containsKey(i))
                    map.put(i,map.get(i)+1);
                else
                    map.put(i,1);
            }
            for (int i = 0; i<nums1.length; i++){ // 2 2
                if (map.containsKey(nums1[i]) && map.get(nums1[i])>0){
                    map.put(nums1[i], map.get(nums1[i])-1);
                    list.add(nums1[i]);
                }
            }
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}
