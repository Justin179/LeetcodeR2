package com.leetcode.yks11;

public class IR {

    public static void main(String[] args) {
        int[] array1 =  {1, 2, 3, 4, 5, 6, 7};
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        isRotation(array1,array2b);
    }

    public static Boolean isRotation(int[] array1, int[] array2) {
        if(array1.length!=array2.length)
            return false;

        int firstNum = array1[0];
        int secondCorrespondent = -1;

        // 從第二個Array找到firstNum的index
        for(int i = 0; i<array2.length; i++){
            if(array2[i] == firstNum){
                secondCorrespondent = i;
                break;
            }

        }

        if(secondCorrespondent==-1)
            return false;

        for(int i = 0; i<array1.length; i++){
            int j = (i+secondCorrespondent) % array1.length;
//            System.out.println("j: " + j);
            if(array1[i] != array2[j])
                return false;
        }

        return true;
    }





    // Implement your solution below.
//    public static Boolean isRotation(int[] array1, int[] array2) {
//        if (array1.length != array2.length) return false;
//
//        int key = array1[0];
//        int keyLoc = -1;
//        // 從第二個陣列中，找到第一個
//        for (int i = 0; i < array2.length; i++) {
//            if (array2[i] == key) {
//                keyLoc = i;
//                break;
//            }
//        }
//        if (keyLoc == -1)
//            return false;
//
//        for (int i = 0; i < array1.length; i++) {
//            int j = (keyLoc + i) % array1.length; // 4 % 7 -> 4 (第二個陣列對應的index)
//            if (array1[i] != array2[j])
//                return false;
//        }
//
//        return true;
//    }
}

