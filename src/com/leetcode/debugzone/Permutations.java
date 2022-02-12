package com.leetcode.debugzone;

import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
        int[] nums = {1,2,3};
        solution.permute(nums);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new LinkedList<>();
        public List<List<Integer>> permute(int[] nums) {
            LinkedList<Integer> path = new LinkedList<>();
            backtrack(nums,path);
            return res;
        }

        private void backtrack(int[] nums, LinkedList<Integer> path){
            // base case
            if(path.size()== nums.length){
                res.add(new LinkedList<>(path));
                return;
            }

            for(int i = 0; i<nums.length; i++){
                // 已經在路徑中的 continue
                if(path.contains(nums[i]))
                    continue;
                // add
                path.add(nums[i]);
                // backtrack
                backtrack(nums,path);
                // remove
                path.removeLast();
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)
}












