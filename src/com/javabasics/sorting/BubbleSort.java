package com.javabasics.sorting;

import java.util.Arrays;

public class BubbleSort {

    /*
    time:
    space:
     */

    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }


    public static void bubbleSort(int[] array) {
        for (int i = array.length-1; i>0; i--){ // 右擋板: 5 4 3 2 1
            for (int j = 0; j<i; j++) {
                if (array[j]>array[j+1])
                    swap(j,array);
            }
        }
    }

    private static void swap(int j, int[] array) {
        int temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
    }


//    public static void bubbleSort(int[] array) {
//        for (int i = array.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j] > array[j+1]) {
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//    }



}
