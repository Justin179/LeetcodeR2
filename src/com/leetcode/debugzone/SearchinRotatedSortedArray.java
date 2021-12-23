package com.leetcode.debugzone;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        Solution solution = new SearchinRotatedSortedArray().new Solution();
        // 	测试用例:[4,5,6,7,0,1,2]
        int[] nums = {3,1};
        int res = solution.search(nums,1);
        System.out.println(res);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // [3,1], target = 1
        public int search(int[] nums, int target) {
            int peakIndex = findPeakIndex(nums);

            if(target>=nums[0] && target<=nums[peakIndex]){
                return binarySearch(nums, target, 0, peakIndex);
            } else {
                return binarySearch(nums, target, peakIndex+1, nums.length-1);
            }
        }

        public int findPeakIndex(int[] nums){
            if(nums.length==1)
                return 0;

            for(int i = 0; i<nums.length; i++){
                if(i>0 && nums[i-1]>nums[i])
                    return i-1;
            }

            return nums.length-1;
        }

        public int binarySearch(int[] nums, int target, int low, int high){
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] == target){
                    return mid;
                } else if (target>nums[mid]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
