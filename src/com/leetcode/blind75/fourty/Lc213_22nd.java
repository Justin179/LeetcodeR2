package com.leetcode.blind75.fourty;

public class Lc213_22nd {

    public static void main(String[] args) {
//        int[] t1 = new int[]{1,2,3}; // 3
//        int[] t2 = new int[]{2,3,2}; // 3
        int[] t3 = new int[]{1,2,3,1}; // 4
//        int[] t4 = new int[]{200,3,140,20,10}; // 340
//        System.out.println(rob(t1));
//        System.out.println(rob(t2));
        System.out.println(rob(t3));
//        System.out.println(rob(t4));
    }

    public static int rob(int[] nums) {
        if (nums.length==1)
            return nums[0];
        if (nums.length==2)
            return Math.max(nums[0], nums[1]);

        int res1 = robFirst(nums);
        int res2 = doNotRobFirst(nums);

        return Math.max(res1,res2);
    }
    //  200 3 140 20  10
    // |            |
    private static int robFirst(int[] nums) {
        int[] dp = new int[nums.length-1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i<nums.length-1; i++){ // 2 3
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
    //  200 3 140 20  10
    //     |            |

    // 1  2 3 1
    //   |     |
    private static int doNotRobFirst(int[] nums) {
        int[] dp = new int[nums.length-1];
        dp[0] = nums[1]; // 2
        dp[1] = Math.max(nums[1], nums[2]); // 3
        for (int i = 3; i<nums.length; i++){ // 3
            dp[i-1] = Math.max(dp[i-2],nums[i]+dp[i-3]);
        }
        return dp[dp.length-1];
    }

}

/*

        // 1 2 1 1
        int[] dp1 = new int[nums.length-1];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i<nums.length; i++){ // 2 3

        }
 */