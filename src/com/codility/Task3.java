package com.codility;

public class Task3 {
    public static void main(String[] args) {
//        int[] A = new int[]{3, -7, 3, -7, 3};
//        int[] A = new int[]{7,4,-2,4,-2,-9};
        int[] A = new int[]{7,-5,-5,-5,7,-1,7};
        int res = solution(A);
        System.out.println(res);
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8

        int max = 2;
        int n = A.length;
        if(n<=2){
            return n; // 1 or 2
        } else {
            int len = 2;
            for (int i = 2; i<n; i++){
                if (A[i] == A[i-2]){
                    len++;
                    max = Math.max(max, len);
                } else
                    len = 2;
            }
        }

        return max;
    }
}
