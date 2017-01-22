package com.github.abhayjoshi0102.searching;

/**
 * Problem statement: Given an array containing only 0s and 1s in sorted order. Find the first occurrence of 1 in array.
 *
 * There are some possible variant to this problem. Some are mentioned below:
 * 1. Given an array containing only 0s and 1s in sorted order. Find the first occurrence of 1 in array.
 * 2. Same problem can be asked as find last occurrence of 0.
 * 3. Other variant is to find number of ones or zeroes in given array.
 */
public class FindFirstOne {
    /**
     * This method return the position of first 1 in the array. If 1 is not present in the array this method returns -1.
     * Since this method uses linear search algorithm so time complexity of this method is O(n).
     * @param array The array in which we need to find the first position of 1.
     * @return the position of first 1. If 1 is not present, this method returns -1.
     */
    public static int linearSearch(int [] array) {
        int firstOnePosition = -1;
        for(int i = 0 ; i < array.length ; i++ ) {
            if(array[i] == 1) {
                firstOnePosition = i;
                break;
            }
        }
        return firstOnePosition;
    }

    /**
     * This method return the position of first 1 in the array. If 1 is not present in the array this method returns -1.
     * Since this method uses binary search algorithm so time complexity of this method is O(log n).
     * @param array The array in which we need to find the first position of 1.
     * @return the position of first 1. If 1 is not present, this method returns -1.
     */
    public static int binarySearch(int [] array) {
        int firstOnePosition = -1;
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int middle = left + (right - left)/2;
            if (array[middle] == 1) {
                firstOnePosition = middle;
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return firstOnePosition;
    }
}
