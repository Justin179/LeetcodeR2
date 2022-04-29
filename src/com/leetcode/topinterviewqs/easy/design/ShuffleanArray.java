package com.leetcode.topinterviewqs.easy.design;

import java.util.Random;

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 *
 * [1,2,3] -> 0 1 2
 * 0 + rand.nextInt(3) -> 0 + [0,1,2] -> 0, 1, 2
 * 1 + rand.nextInt(2) -> 1 + [0,1] -> 1 or 2
 * 2 + rand.nextInt(1) -> 2 + [0] -> 2
 */
public class ShuffleanArray {

//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3};
//        Random random = new Random();
//        for (int i = 0; i<nums.length; i++){
//            int randIndex = i + random.nextInt(nums.length-i);
//            System.out.println(randIndex);
//        }
//    }

    int[] nums;
    Random random;

    public ShuffleanArray(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] res = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            res[i] = nums[i];
        }

        for (int i = 0; i<nums.length; i++){
            int randIndex = i + random.nextInt(nums.length-i);
            swap(res,i,randIndex);
        }

        return res;
    }

    private void swap(int[] res, int i, int randIndex) {
        int temp = res[i];
        res[i] = res[randIndex];
        res[randIndex] = temp;
    }
}
