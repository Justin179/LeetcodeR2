package com.leetcode.r2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        Solution solution = new TwoSum_1().new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = solution.twoSum(nums,target);
        System.out.println(res);
//        int[] expected = {1,2};
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            Map<Integer,Integer> map = new HashMap<>();

            for(int i = 0; i<nums.length; i++){
                if(map.containsKey(target-nums[i])){
                    Integer ind = map.get(target-nums[i]);
                    int[] res = {i,ind};
                    return res;
                } else {
                    map.put(nums[i], i);
                }
            }


            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
