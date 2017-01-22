package com.github.abhayjoshi0102.sorting;


public class InsertionSort {
    public int [] sort(int [] array) {
        int temp;
        for (int i= 1 ; i < array.length ; i++) {
            for (int j = 0 ; j < i ; j++) {
                if (array[j] > array[i]) {
                    for (int k = i-1; k >= j ; k--) {
                        temp = array[k+1];
                        array[k+1] = array[k];
                        array[k] = temp;
                    }
                }
            }
        }
        return array;
    }
}

