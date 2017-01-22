package com.github.abhayjoshi0102.searching;

public class PointOfRotation {

    public static int linearMethod(int [] array) {
        if(array == null || array.length == 0 ) {
            return -1;
        }
        int pointOfRotation = -1;
        for(int i =1 ; i < array.length ; i++) {
            if(array[i-1] > array[i]) {
                pointOfRotation = i-1;
                break;
            }
        }
        return pointOfRotation;
    }

    public static int binaryMethod(int [] array) {
        if(array == null || array.length == 0 ) {
            return -1;
        }
        int pointOfRotation = -1;
        int startIndex = 0;
        int endIndex = array.length -1;
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex)/2;
            if(array[midIndex-1] < array[midIndex] && array[midIndex] >array[midIndex+1]) {
                pointOfRotation = midIndex;
                break;
            }
            if(array[midIndex] > array[startIndex]) {
                startIndex = midIndex+1;
            }
            else {
                endIndex = midIndex -1 ;
            }
        }
        return pointOfRotation;
    }
}

/*

8,9,10,11,12,1,2

8,9,1,2,3,4,5

5,6,7,8,1,2,3

*/
