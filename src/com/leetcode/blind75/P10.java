package com.leetcode.blind75;

public class P10 {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int res = maxArea(height);
        System.out.println(res);
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int left = 0;
        int right = n-1;
        while (left<right){
            int liter = (right-left) * Math.min(height[left],height[right]);
            max = Math.max(max, liter);
            if (height[right]>=height[left]){
                left++;
            } else
                right--;
        }
        return max;
    }
}


/* 暴力解超時
        int n = height.length;
        int max = 0;
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                int liter = (j-i) * Math.min(height[i],height[j]);
                max = Math.max(liter,max);
            }
        }
        return max;
 */