package com.leetcode.blind75.twenty;

public class P10_p1 {
    // lc 11
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int res = maxArea(height);
        System.out.println(res);
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        while (left<right){
            int water = (right-left) * Math.min(height[left],height[right]);
            max = Math.max(max, water);
            if(height[left]<=height[right]){
                left++;
            } else
                right--;
        }

        return max;
    }
}
