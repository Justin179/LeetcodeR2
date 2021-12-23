package com.leetcode.debugzone;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition_35().new Solution();


    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 時間: logN 每次循環少一半的量
        // 空間: 1
        public int searchInsert(int[] nums, int target) {

            int left = 0;
            int right = nums.length-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(nums[mid]==target)
                    return mid;
                if(target>nums[mid]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }

            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
