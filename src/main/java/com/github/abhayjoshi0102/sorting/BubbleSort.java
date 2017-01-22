package com.github.abhayjoshi0102.sorting;


public class BubbleSort {
    public static int [] sort(int [] array) {
        int temp;
        Boolean swapFlag = true;
        for (int i = 0; i < array.length -1 && swapFlag; i++) {
            swapFlag = false;
            for (int j = 0 ; j < array.length - i -1 ; j++) {
                if (array[j] > array[j+1] ) {
                    swapFlag = true;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
