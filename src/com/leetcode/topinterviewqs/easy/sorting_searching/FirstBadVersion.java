package com.leetcode.topinterviewqs.easy.sorting_searching;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion {
    // We recommend First Bad Version as a great introduction to a very important algorithm.
    public int firstBadVersion(int n) {
        // n = 5   ->  1 2 3 4 5
        int left = 1;
        int right = n;
        while (left<=right){
            int mid = left + (right-left)/2; // 3
            boolean isBadVersion = isBadVersion(mid);
            if (isBadVersion){
                if (mid==1 || !isBadVersion(mid-1)){ // 第一版就壞掉 or 前一版正常
                    return mid;
                }
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
