package com.leetcode.blind75;

public class P5 {
    public static void main(String[] args) {
        // {-2,1,-3,4,-1,2,1,-5,4} -> 6
        // {5,4,-1,7,8}; // -> 23
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int currSum = 0;
        for (int i = 0; i<n; i++){
            if(currSum<0)
                currSum=0;
            currSum = currSum+nums[i];
            max = Math.max(max, currSum);
        }
        return max;
    }
}

/* 邏輯是對的，但也會超時
    public static int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];

        int n = nums.length; // 5
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int tempSum = Integer.MIN_VALUE;
        // [5,4,-1,7,8]
        while (i<n && j<n){ // i<5 && j<5
            System.out.println("i="+i +", j="+j);
            // 判斷與計算，不動指針
            if(i==j){
                tempSum = nums[i]; // 5
                if (tempSum<0){
                    i++;
                    j = i;
                    max = Math.max(max, tempSum); // 5
                    continue;
                }
            } else {
                tempSum = tempSum + nums[j];
                if (tempSum<0){
                    i = j+1;
                    j = i;
                    max = Math.max(max, tempSum);
                    continue;
                }
            }
            max = Math.max(max, tempSum);

            // 單純動指針
            if (j==n-1){ // 4 (j走到底了)
                i++;
                j = i; // 起點拉齊
            } else {
                j++;
            }
        }

        return max;
    }
 */

/* 暴力解可以解，但會超時
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            int tempSum = nums[i];
            for (int j = i; j<n; j++){
                if (i==j){
                    max = Math.max(tempSum, max);
                    continue;
                }
                tempSum = tempSum + nums[j];
                max = Math.max(tempSum, max);
            }
        }
        return max;
    }
 */
