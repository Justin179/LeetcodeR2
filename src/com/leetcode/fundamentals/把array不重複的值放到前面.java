package com.leetcode.fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 把array不重複的值放到前面 {

    public static void main(String[] args) {
        // 第二個的題目好像是把array中不重複的值放到前面
        int duplicateArray[] = { 4, 2, 5, 1, 5, 2, 5, 4, 3 };
        // 1 3
        findNonDuplicates(duplicateArray);
    }

    public static int[] findNonDuplicates(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if (map.get(i)!=null){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue()==1)
                list.add(entry.getKey());
        }

        System.out.println(list);
        int[] intArr = new int[list.size()];
        for (int i =0; i<list.size(); i++){
            intArr[i] = list.get(i);
        }

        return intArr;
    }


}
