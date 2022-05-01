package com.leetcode.topinterviewqs.medium.array_strings;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
//        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int[] nums = new int[]{0,0,0};
        threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums==null || (nums!=null && nums.length==1 && nums[0]==0))
            return res;

        Arrays.sort(nums);

        for (int i = 0; i<nums.length-2; i++){
            if (i==0 || nums[i]!=nums[i-1]){
                int currNum = nums[i]; //
                int sumGoal = currNum * -1; //

                int left = i+1;
                int right = nums.length-1;
                while (left<right){
                    int leftVal = nums[left];
                    int rightVal = nums[right];
                    if (leftVal+rightVal==sumGoal){
                        res.add(Arrays.asList(leftVal,rightVal,currNum));
                        while (left<right && nums[left] == nums[left+1])
                            left++;
                        while (left<right && nums[right] == nums[right-1])
                            right--;
                        left++;
                        right--;
                    } else if (leftVal+rightVal>sumGoal){
                        right--;
                    } else {
                        left++;
                    }
                }


            }
        }

        return res;
    }


//    public static int[] twoSum(int startPoint, int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = startPoint; i<nums.length; i++){
//            int currNum = nums[i];
//            int key = target-currNum;
//            if (map.containsKey(key)){
//                int pos = map.get(key);
//                if (pos!=i)
//                    return new int[]{pos,i};
//            } else {
//                map.put(nums[i],i);
//            }
//        }
//        return null;
//    }
}



/*
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums==null || (nums!=null && nums.length==1 && nums[0]==0))
            return res;

        Arrays.sort(nums);

        for (int i = 0; i<nums.length; i++){
            if (i!=0 && (nums[i]==nums[i-1]))
                continue;

            int currNum = nums[i]; // -1
            int sumGoal = currNum * -1; // 1
            List<int[]> positions = twoSum(i+1, nums, sumGoal);
            for (int[] intArr : positions){
                int a = nums[intArr[0]];
                int b = nums[intArr[1]];
                List<Integer> list = new ArrayList<>();
                list.addAll(Arrays.asList(currNum,a,b));
                res.add(list);
            }
        }

        return res;
    }

    public static List<int[]> twoSum(int startIndex, int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for (int i = startIndex; i<nums.length; i++){ // 1 - 5
            int currNum = nums[i];
            int key = target-currNum;
            if (map.containsKey(key)){
                int pos = map.get(key);
                if (pos!=i)
                    list.add(new int[]{pos,i});
            } else {
                map.put(nums[i],i);
            }
        }
        return list;
    }
 */