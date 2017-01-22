package com.github.abhayjoshi0102.searching;

import java.math.BigInteger;
import java.util.BitSet;

/**
 * Problem statement: Given an array of integers of size N, find missing number in array where range of numbers is from 1 to N+1.
 * For example:
 *  A = [1,2,5,4,6]         N = 5 range 1 to 6. Output is 3.
 *  A = [1,5,3,4,7,8,9,2]   N = 8 range 1 to 9. Output is 6
 */
public class MissingNumber {
    /**
     * This method uses brute force method to find out missing number. Time complexity is O(n^2) and space complexity is O(1).
     *
     * @param array array of numbers where you want to search the missing number
     * @return the missing number. If no number is missing then returns -1.
     */
    public static int bruteForce(int [] array) {
        int missingNumber = -1;
        for(int i = 0; i < array.length ; i++) {
            Boolean found = false;
            for(int j = 0; j < array.length ; j++) {
                if(array[j] == i + 1) {
                    found = true;
                    break;
                }
            }
            if(found == false) {
                missingNumber = i +1 ;
                break;
            }
        }
        return missingNumber;
    }

    /**
     * This methods uses similar method as bucket sort where we create a large array and go through the unsorted array
     * and put the number in the corresponding index. The prerequisite for this sorting algorithm is that we should be
     * knowing the range of numbers and create the array with the length of maximum number present in the array.
     * Time and space complexity of this approach is O(n).
     * The drawback of this approach is Arrays have high bound as Integer.MAX_VALUE -6.
     *
     * @param array array of numbers where you want to search the missing number
     * @return the missing number. If no number is missing then returns -1.
     */
    public static int bucketSort(int [] array) {
        int missingNumber = -1;
        /* The easiest method was to create an array of numbers and initialize to 0 and scan the input array
           and insert the item in appropriate index but it would have taken too much space i.e. 4*(n+1)
           The other option was to use array of Boolean but again it will take 8 bits and 7 bits will be wasted.
           Bitset is the best option in this case as it will occupy only (n+1)/8 bytes.
         */
        BitSet bucket = new BitSet(array.length + 1);
        for(int i = 0; i < array.length ; i++) {
            bucket.set(array[i]);
        }
        for(int i=1; i <array.length ; i++) {
            if(!bucket.get(i)) {
                missingNumber = i;
                break;
            }
        }
        return missingNumber;
    }

    /**
     * We all know than sum of N consecutive numbers is N*(N+1)/2. If there is some number missing,
     * sum of all numbers will not be equal to N*(N+1)/2.
     * Missing number will be difference between expected sum and actual sum.
     * Time complexity of this method is O(n) and space complexity is O(1).
     * The issue with this approach is that if size of array is very high then that are chances of overflow
     * as multiplication of n and n+1 will go beyond the limit of int.
     *
     * @param array array of numbers where you want to search the missing number
     * @return the missing number. If no number is missing then returns -1.
     */
    public static int mathematicalMethod(int [] array) {
        int missingNumber;
        int sumOfArrayNumbers = 0;
        int maxNumberInArray = array.length + 1;
        int sumOfFirstNPlusOneNumbers;
        for(int i = 0 ; i < array.length ; i++) {
            sumOfArrayNumbers += array[i];
        }
        sumOfFirstNPlusOneNumbers = (maxNumberInArray * (maxNumberInArray + 1))/2;
        missingNumber = sumOfFirstNPlusOneNumbers - sumOfArrayNumbers;
        if(missingNumber == maxNumberInArray) {
            return -1;
        }
        else {
        return missingNumber;
        }
    }

    /**
     * This approach is same as previous one but we are fixing the overflow issue
     * that might occur when we use int. We will use BigInteger instead of int.
     * Time complexity of this method is O(n) and space complexity is O(1).
     *
     * @param array array of numbers where you want to search the missing number
     * @return the missing number. If no number is missing then returns -1.
     */
    public static int mathematicalApproachWithBigInteger(int [] array) {
        int missingNumber;
        /* Below line can also be written as below:
           BigInteger sumOfArray = BigInteger.valueOf(0);
         */
        BigInteger sumOfArray = new BigInteger("0");
        for (int number : array) {
            /* Below line can can also be written as below:
               sumOfArray = sumOfArray.add(new BigInteger(String.valueOf(number)));
             */
            // Make sure to use assignment in below statement as BigInteger is immutable.
            sumOfArray = sumOfArray.add(BigInteger.valueOf(number));
        }
        BigInteger arrayLengthPlusOne = new BigInteger(String.valueOf(array.length)).add(BigInteger.ONE);
        BigInteger sumOfNPlusOneNumber = arrayLengthPlusOne.multiply(arrayLengthPlusOne.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
        missingNumber = sumOfNPlusOneNumber.subtract(sumOfArray).intValue();
        if(missingNumber == arrayLengthPlusOne.intValue()) {
            return -1;
        }
        return missingNumber;
    }

    /**
     * There is a beautiful property of XOR, that is, if we XOR a number with itself, result will be zero.
     * How can this property help us? In our problem there are two set of numbers, one which should be there from 1 to N+1,
     * and other which are actually there. Now if we XOR first set of numbers with second set of numbers,
     * all except of missing number will cancel each other. The final result will be the actual missing number.
     *
     * So we will use below two properties:
     * x ^ x = 0
     * x ^ 0 = x
     *
     * @param array array of numbers where you want to search the missing number
     * @return the missing number. If no number is missing then returns -1.
     */
    public static int usingXorMethod(int [] array) {
        int missingNumber=-1;
        int xorOfArray = 0;
        int xorOfNPlusOneNumber = 0;
        for(int number : array) {
            xorOfArray ^= number;
        }
        for (int i = 1; i <= array.length +1; i++) {
            xorOfNPlusOneNumber ^= i;
        }
        missingNumber =  xorOfArray ^ xorOfNPlusOneNumber;
        if(missingNumber == array.length + 1) {
            return -1;
        }
        return missingNumber;
    }
}
