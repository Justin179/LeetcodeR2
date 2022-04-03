package com.codility;

public class Task1 {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,5,9,9}; // 由小到大排序
        int X = 5;

//        int[] A = new int[]{1,2,3,4,5}; // 由小到大排序
//        int X = 4;


        int res = solution(A,X); // 若能找到X, 回傳index (找不到的話，回傳-1)
        System.out.println(res);
    }
    // can modify at most three lines 最多只能改三行
    // focus on correctness, not performance
    static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else if (A[m] < X){
                l = m + 1;
            } else return m;

//            System.out.println("test");
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

}
