package com.github.abhayjoshi0102.Searching;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

/**
 * This class contains the test cases for SearchingAlgorithms class.
 */
public class SearchAlgorithmTest extends TestCase{
    public SearchAlgorithmTest(String testCase) {
        super(testCase);
    }

    public static Test suite() {
        return new TestSuite( SearchAlgorithmTest.class );
    }

    public void testLinearSearch() {
        int [] array = new int [] { 6,19,34,78,8,45,3};
        int numberToBeSearched = 8;
        int resultIndex = SearchingAlgorithms.linearSearch(numberToBeSearched,array);
        assertEquals(4,resultIndex);
        numberToBeSearched = 44;
        resultIndex = SearchingAlgorithms.linearSearch(numberToBeSearched,array);
        assertEquals(-1,resultIndex);
    }

    public void testBinarySearch() {
        int [] array = new int [] { 1,3,7,34,67,98,99,103};
        int numberToBeSearched = 67;
        int resultIndex = SearchingAlgorithms.binarySearch(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
        numberToBeSearched = 44;
        resultIndex = SearchingAlgorithms.binarySearch(numberToBeSearched,array);
        assertEquals(-1,resultIndex);
        numberToBeSearched = 1;
        resultIndex = SearchingAlgorithms.binarySearch(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
        numberToBeSearched = 103;
        resultIndex = SearchingAlgorithms.binarySearch(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
        numberToBeSearched = 34;
        resultIndex = SearchingAlgorithms.binarySearch(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
        }

    public void testbinarySearchUsingRecursion() {
        int [] array = new int [] { 1,3,7,34,67,98,99,103};
        int numberToBeSearched = 67;
        int resultIndex = SearchingAlgorithms.binarySearchUsingRecursion(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
        numberToBeSearched = 44;
        resultIndex = SearchingAlgorithms.binarySearchUsingRecursion(numberToBeSearched,array);
        assertEquals(-1,resultIndex);
        numberToBeSearched = 1;
        resultIndex = SearchingAlgorithms.binarySearchUsingRecursion(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
        numberToBeSearched = 103;
        resultIndex = SearchingAlgorithms.binarySearchUsingRecursion(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
        numberToBeSearched = 34;
        resultIndex = SearchingAlgorithms.binarySearchUsingRecursion(numberToBeSearched,array);
        assertEquals(Arrays.binarySearch(array,numberToBeSearched),resultIndex);
    }
}
