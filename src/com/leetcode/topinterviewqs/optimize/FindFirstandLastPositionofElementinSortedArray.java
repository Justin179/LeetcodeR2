package com.leetcode.topinterviewqs.optimize;

public class FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,4};
        int target = 4;
        searchRange(nums,target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1}; // new int[2];
        if (nums.length==1){
            if (nums[0]==target){
                return new int[]{0,0};
            }else {
                return res;
            }
        }


        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            int midVal = nums[mid];
            if (midVal==target){
                int tempMid = mid;
                // 左找
                while (mid>0 && nums[mid-1] == target){ // 當左數=target
                    mid = mid-1;
                }
                res[0] = mid;
                // 右找
                while (tempMid< nums.length-1 && nums[tempMid+1] == target){
                    tempMid = tempMid+1;
                }
                res[1] = tempMid;

                break;

            } else if (target>midVal){
                left = mid+1;
            } else {
                right = mid-1;
            }

        }

        return res;
    }
}
