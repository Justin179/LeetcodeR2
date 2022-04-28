package com.leetcode.topinterviewqs.easy.sorting_searching;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

    public static void main(String[] args) {
        // 1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = new int[]{2,5,6};
//        int n = 3;
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        merge(nums1,m,nums2,n);
        System.out.println(nums1);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp1 = new int[m];
        for (int i = 0; i<m; i++){
            temp1[i] = nums1[i];
        }
        // temp1[1,2,3] -> a
        // nums2[2,5,6] -> b
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 0;
        while (a<m && b<n){
            if (temp1[a]<=nums2[b]){
                list.add(temp1[a]);
                a++;
            } else {
                list.add(nums2[b]);
                b++;
            }
        }

        if (a<m){
            for (int i = a; i<m; i++){
                list.add(temp1[i]);
            }
        }

        if (b<n){
            for (int i = b; i<n; i++){
                list.add(nums2[i]);
            }
        }

        for (int i = 0; i<list.size(); i++){
            nums1[i] = list.get(i);
        }

    }



    /*
       non-decreasing order
       m and n, representing the number of elements in nums1 and nums2 respectively.
       The final sorted array should not be returned by the function, but instead be stored inside the array nums1
     */
}
