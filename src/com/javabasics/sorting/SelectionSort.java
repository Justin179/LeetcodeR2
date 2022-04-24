package com.javabasics.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i<array.length; i++){
            int minIndex = i;
            int currMin = array[i];
            for (int j = i+1; j<array.length; j++){ // J -> 1 2 3 4 5
                if (array[j]<currMin){
                    currMin = array[j];
                    minIndex = j;
                }
            }
            if (minIndex>i){
                swap(array,i,minIndex);
            }
        }
    }

    private static void swap(int[] array, int i, int minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }


//    public static void selectionSort(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < array.length; j++) {
//                if (array[j] < array[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            if (i != minIndex) {
//                int temp = array[i];
//                array[i] = array[minIndex];
//                array[minIndex] = temp;
//            }
//        }
//    }



}
