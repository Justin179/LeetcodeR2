package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public static void main(String[] args) {
        // nums = [0,1,3,50,75], lower = 0, upper = 99
        int[] nums = new int[]{0,1,3,50,75};
        int lower = 0;
        int upper = 99;
        List<String> res = findMissingRanges(nums,lower,upper);
        System.out.println(res);
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // 以lower bound 為主軸，持續更新之
        List<String> list = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            if (lower<nums[i]){
                int gap = nums[i] - lower; // 1
                if (gap==1){
                    list.add(lower+"");
                } else {
                    list.add(lower+"->"+(nums[i]-1));
                }
            }
            if (lower==Integer.MAX_VALUE)
                return list;
            lower = nums[i]+1;
        }
        if (lower<upper)
            list.add(lower+"->"+upper);
        else if (lower==upper)
            list.add(lower+"");

        return list;
    }
}
