package com.github.abhayjoshi0102.Searching;

/**
 * This class is contains different methods for searching a number in an Array.
 */
public class SearchingAlgorithms {
    /**
     * This method searches a number in given array. The complexity of linear search algorithm is O(n).
     * This search can be used in sorted or unsorted array.
     * @param numberToBeSearched is the number that you want to search in array.
     * @param array is the input array where you want to search the number.
     * @return This method returns the position of the array where number is present. The method returns -1 if number is not found.
     */
    public static int linearSearch(int numberToBeSearched, int [] array) {
        int indexNumberFound = -1;
        for(int i=0; i < array.length ; i ++) {
            if (array[i] == numberToBeSearched) {
                return i;
            }
        }
        return indexNumberFound;
    }

    /**
     * This method searches a number in given array. The complexity of binary search algorithm is O(log n).
     * This search can be used only in sorted arrays.
     * @param numberToBeSearched is the number that you want to search in array.
     * @param array is the input array where you want to search the number.
     * @return This method returns the position of the array where number is present. The method returns -1 if number is not found.
     */
    public static int binarySearch(int numberToBeSearched, int [] array) {
        int indexNumberFound = -1;
        int lowerBound = 0;
        int upperBound = array.length -1;
        while (lowerBound <= upperBound) {

            /*
               Commenting below line for calculating midPoint using (lowerBound + upperBound)/2 formula.
               This formula can create problem for really big size array, if sum of lowerBound and upperBound is going beyond
               is going beyond the limit of int. Instead use lowerBound + (upperBound - lowerBound)/2
            */

            // int midPoint = (lowerBound + upperBound)/2;

           int midPoint =  lowerBound + (upperBound - lowerBound)/2;
           if (numberToBeSearched == array[midPoint]) {
               return midPoint;
           }
           else if(numberToBeSearched < array[midPoint]) {
               upperBound = midPoint -1;
           }
           else {
               lowerBound = midPoint + 1;
           }
        }
        return indexNumberFound;
    }

    /**
     * This method searches a number in given array. The complexity of binary search algorithm is O(log n).
     * This search can be used only in sorted arrays.
     * @param numberToBeSearched is the number that you want to search in array.
     * @param array is the input array where you want to search the number.
     * @return This method returns the position of the array where number is present. The method returns -1 if number is not found.
     */

    public static int binarySearchUsingRecursion(int numberToBeSearched, int [] array) {
        return binarySearchRecursionHelper(numberToBeSearched, array, 0, array.length -1);
    }

    private static int binarySearchRecursionHelper(int numberToBeSearched, int [] array,int lowerBound, int upperBound) {
        /*
         Commenting below line for calculating midPoint using (lowerBound + upperBound)/2 formula.
         This formula can create problem for really big size array, if sum of lowerBound and upperBound is going beyond
         is going beyond the limit of int. Instead use lowerBound + (upperBound - lowerBound)/2
        */

        // int midPoint = (lowerBound + upperBound)/2;

        int midPoint =  lowerBound + (upperBound - lowerBound)/2;
        int searchItemNotFound = -1;
         if (lowerBound <= upperBound) {
            if(numberToBeSearched == array[midPoint]) {
                return midPoint;
            }
            else if(numberToBeSearched < array[midPoint]) {
                return binarySearchRecursionHelper(numberToBeSearched, array, lowerBound, midPoint -1);
            }
            else {
                return binarySearchRecursionHelper(numberToBeSearched, array, midPoint + 1, upperBound);
            }
        }
        return searchItemNotFound;
    }
}
