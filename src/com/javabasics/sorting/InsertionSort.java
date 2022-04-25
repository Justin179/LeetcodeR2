package com.javabasics.sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
    https://www.youtube.com/watch?v=nKzEJWbkPbQ
    小的往前移動
        time:
            最壞情況是最小的在最後面，這樣必然從頭走到尾 O(n^2) iteration*shift
            最好情況是原本就排序好的，no swap -> O(n)
        space:
 */
    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i<array.length; i++){ // 2   1 - 5
            int currPos = i; // 2
            while (currPos>0 && array[currPos]<array[currPos-1]){ // 2 < 4
                swap(currPos,array);
                currPos--;
            }
        }
    }

    private static void swap(int i, int[] array) {
        int temp = array[i-1];
        array[i-1] = array[i];
        array[i] = temp;
    }


//    public static void insertionSort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int temp = array[i];
//            int j = i - 1;
//            while (j > -1 && temp < array[j]) {
//                array[j+1] = array[j];
//                array[j] = temp;
//                j--;
//            }
//        }
//    }



}
