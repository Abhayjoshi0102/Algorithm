package com.github.abhayjoshi0102.sorting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class InsertionSortTest extends TestCase {
    public InsertionSortTest(String testCase) {
        super(testCase);
    }

    public static Test suite() {
        return new TestSuite(InsertionSortTest.class );
    }

    public void testInsertionSortTest() {
        int [] array = { 8, 9, 7,0, 1, 10};
        int [] sortedArray = {0,1,7,8,9,10};
        int [] insertionSort = new InsertionSort().sort(array);
        for (int i = 0; i < array.length ; i++) {
            assertEquals(insertionSort[i],sortedArray[i]);
        }
    }

}
