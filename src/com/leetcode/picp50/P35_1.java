package com.leetcode.picp50;

import java.util.LinkedList;
import java.util.List;

public class P35_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1};
        permute(nums);
        System.out.println(res);
    }

    static List<List<Integer>> res = new LinkedList<>();

    public static List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> path = new LinkedList<>(); // 存單一數組用
        bt(nums, path);
        return res;
    }

    private static void bt(int[] nums, LinkedList<Integer> path){
        if(path.size() == nums.length){
            res.add(new LinkedList<>(path));
            return;
        }

        for(int i = 0; i<nums.length; i++){ // 0 1 2 (1 2 3)
            if(path.contains(nums[i]))
                continue;
            // 放進
            path.add(nums[i]);
            // 下一層
            bt(nums, path);
            // 取出
            path.removeLast();
        }
    }











//    private static void bt(int[] nums, LinkedList path){
//        // 裝滿 記錄 收工
//        if(path.size()==nums.length){
//            res.add(new LinkedList<>(path));
//            return;
//        }
//
//        // for loop
//        for(int i = 0; i<nums.length; i++){ // 0 1 2 (1 2 3)
//            // 放過的continus
//            if(path.contains(nums[i]))
//                continue;
//            // 放
//            path.add(nums[i]);
//            // 走
//            bt(nums, path);
//            // 拿
//            path.removeLast();
//
//        }
//    }
}
