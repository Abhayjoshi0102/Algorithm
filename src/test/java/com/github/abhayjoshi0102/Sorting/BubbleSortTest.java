package com.github.abhayjoshi0102.Sorting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BubbleSortTest extends TestCase {
    public BubbleSortTest(String testCase) {
        super(testCase);
    }

    public static Test suite() {
        return new TestSuite(BubbleSortTest.class );
    }

    public void testBubbleSortTest() {
        int [] array = { 1,4, 6,0,2,3,5,2};
        int [] sortedArray = {0,1,2,2,3,4,5,6};
        int [] bubbleSort = BubbleSort.sort(array);
        for (int i = 0; i < array.length ; i++) {
            assertEquals(bubbleSort[i],sortedArray[i]);
        }
    }
}
