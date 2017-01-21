package com.github.abhayjoshi0102.Searching;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test class for com.github.abhayjoshi0102.Searching.SmallestMissingNumber class.
 */
public class SmallestMissingNumberTest extends TestCase{

    public SmallestMissingNumberTest(String test) {
        super(test);
    }

    public static Test suite() {
        return new TestSuite(com.github.abhayjoshi0102.Searching.SmallestMissingNumberTest.class);
    }

    public void testSmallestMissingNumber() {
        int [] array = {1,2,3};
        assertEquals(-1,SmallestMissingNumber.linearSearch(array));
        assertEquals(-1,SmallestMissingNumber.binarySearch(array));
        array = new int [] {2,3,4,5,6,7};
        assertEquals(1,SmallestMissingNumber.linearSearch(array));
        assertEquals(1,SmallestMissingNumber.binarySearch(array));
        array = new int [] {1,2,3,5,6,7,9,10,12,14,15,16,17,18,19,20};
        assertEquals(4,SmallestMissingNumber.linearSearch(array));
        assertEquals(4,SmallestMissingNumber.binarySearch(array));
        array = new int [] {1,2,3,4,5,7};
        assertEquals(6,SmallestMissingNumber.linearSearch(array));
        assertEquals(6,SmallestMissingNumber.binarySearch(array));
    }

}
