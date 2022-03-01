package com.leetcode.picp50;

public class P21 {

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,1,8,2};
        int[] res = productExceptSelf(arr);
        System.out.println(res);
    }

    static int[] productExceptSelf(int[] nums){
        // your code here
        int length = nums.length;
        int[] arr1 = new int[length];
        arr1[0] = 1;
        int[] arr2 = new int[length];
        arr2[length-1] = 1;

        // 4 5 1 8 2
        // 1
        for(int i = 0; i<length-1; i++){
            int sum = nums[i] * arr1[i];
            arr1[i+1] = sum;
        }
        // 4 5 1 8 2
        //         1
        for(int i = length-1; i>0; i--){
            int sum = nums[i] * arr2[i];
            arr2[i-1] = sum;
        }

        int[] arr3 = new int[length];
        for(int i = 0; i<nums.length; i++){
            arr3[i] = arr1[i]*arr2[i];
        }

        return arr3;
    }
}
