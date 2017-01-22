package com.github.abhayjoshi0102.searching;

/**
 * Problem Statement: Given an array of sorted number of size N which contains numbers in range 1 to N-1, with some numbers missing.
 * Find the smallest missing number in sorted array of integers.
 *
 * Example:
 *  A = [1,2,3,5,7,8] Smallest missing number : 4
 *  A = [1,2,3,4,6,8,10,11] Smallest missing number  : 5
 */
public class SmallestMissingNumber {
    /**
     * This method finds out the least missing number from the array. This method uses linear search and the time complexity is O(n).
     * @param array array to be searched.
     * @return smallest missing number from the array. If no number is missing then method returns -1.
     */
    public static int linearSearch(int [] array) {
        int missingNumber = -1;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] != i+1) {
                missingNumber = i+1;
                break;
            }
        }
        return missingNumber;
    }

    /**
     * This method finds out the least missing number from the array. This method uses binary search and the time complexity is O(log n).
     * @param array array to be searched.
     * @return smallest missing number from the array. If no number is missing then method returns -1.
     */
    public static int binarySearch(int [] array) {
        int missingNumber = -1;
        int left = 0;
        int right = array.length -1;
        while(left <= right) {
            int middleNumber = left + (right - left)/2;
            if(array[middleNumber] > middleNumber + 1 ) {
                missingNumber = array[middleNumber] -1;
                right = middleNumber -1;
            }
            else {
                left = middleNumber + 1;
            }
        }
        return missingNumber;
    }
}