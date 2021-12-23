package com.leetcode.debugzone;

public class SearchInsertPosition_35_2 {
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition_35_2().new Solution();


    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            while(left<=right){ // 當left>right時，break the loop
                int mid = left + (right-left)/2;
                // int mid = (right+left)/2; // 這樣寫也可以
                if(nums[mid]==target) return mid;
                if(target>nums[mid])
                    left = mid+1;
                else
                    right = mid-1;
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
